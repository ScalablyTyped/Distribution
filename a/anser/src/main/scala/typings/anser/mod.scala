package typings.anser

import typings.anser.anserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("anser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Anser
  @JSImport("anser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * This replaces ANSI terminal escape codes with SPAN tags that wrap the
    * content.
    *
    * This function only interprets ANSI SGR (Select Graphic Rendition) codes
    * that can be represented in HTML.
    * For example, cursor movement codes are ignored and hidden from output.
    * The default style uses colors that are very close to the prescribed
    * standard. The standard assumes that the text will have a black
    * background. These colors are set as inline styles on the SPAN tags.
    *
    * Another option is to set `use_classes: true` in the options argument.
    * This will instead set classes on the spans so the colors can be set via
    * CSS. The class names used are of the format `ansi-*-fg/bg` and
    * `ansi-bright-*-fg/bg` where `*` is the color name,
    * i.e black/red/green/yellow/blue/magenta/cyan/white.
    *
    * @param txt The input text.
    * @param options The options.
    * @returns The HTML output.
    */
  /* static member */
  inline def ansiToHtml(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ansiToHtml")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ansiToHtml(txt: String, options: AnserOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ansiToHtml")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Converts ANSI input into JSON output.
    *
    * @param txt The input text.
    * @param options The options.
    * @returns The HTML output.
    */
  /* static member */
  inline def ansiToJson(txt: String): js.Array[AnserJsonEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("ansiToJson")(txt.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnserJsonEntry]]
  inline def ansiToJson(txt: String, options: AnserOptions): js.Array[AnserJsonEntry] = (^.asInstanceOf[js.Dynamic].applyDynamic("ansiToJson")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnserJsonEntry]]
  
  /**
    * Converts ANSI input into text output.
    *
    * @param txt The input text.
    * @returns The text output.
    */
  /* static member */
  inline def ansiToText(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("ansiToText")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def ansiToText(txt: String, options: AnserOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("ansiToText")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Escape the input HTML.
    *
    * This does the minimum escaping of text to make it compliant with HTML.
    * In particular, the '&','<', and '>' characters are escaped. This should
    * be run prior to `ansiToHtml`.
    *
    * @param txt The input text (containing the ANSI snippets).
    * @returns The escaped html.
    */
  /* static member */
  inline def escapeForHtml(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeForHtml")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * Adds the links in the HTML.
    *
    * This replaces any links in the text with anchor tags that display the
    * link. The links should have at least one whitespace character
    * surrounding it. Also, you should apply this after you have run
    * `ansiToHtml` on the text.
    *
    * @param txt The input text.
    * @returns The HTML containing the <a> tags (unescaped).
    */
  /* static member */
  inline def linkify(txt: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("linkify")(txt.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait Anser extends StObject {
    
    /**
      * Converts ANSI input into HTML output.
      *
      * @param txt The input text.
      * @param options The options.
      * @returns The HTML output.
      */
    def ansiToHtml(txt: String): String = js.native
    def ansiToHtml(txt: String, options: AnserOptions): String = js.native
    
    /**
      * Converts ANSI input into HTML output.
      *
      * @param txt The input text.
      * @param options The options.
      * @returns The JSON output.
      */
    def ansiToJson(txt: String): js.Array[AnserJsonEntry] = js.native
    def ansiToJson(txt: String, options: AnserOptions): js.Array[AnserJsonEntry] = js.native
    
    /**
      * Converts ANSI input into HTML output.
      *
      * @param txt The input text.
      * @returns The text output.
      */
    def ansiToText(txt: String): String = js.native
    def ansiToText(txt: String, options: AnserOptions): String = js.native
    
    /**
      * Escapes the input text.
      *
      * @param txt The input text.
      * @returns The escpaed HTML output.
      */
    def escapeForHtml(txt: String): String = js.native
    
    /**
      * Adds HTML link elements.
      *
      * @param txt The input text.
      * @returns The HTML output containing link elements.
      */
    def linkify(txt: String): String = js.native
    
    def process(txt: String): String = js.native
    def process(txt: String, options: Unit, markup: Boolean): String = js.native
    def process(txt: String, options: AnserOptions): String = js.native
    def process(txt: String, options: AnserOptions, markup: Boolean): String = js.native
    /**
      * Processes the input.
      *
      * @param txt The input text.
      * @param options The options.
      * @param markup If false, the colors will not be parsed.
      */
    def process(txt: String, options: OptionsWithJson): js.Array[AnserJsonEntry] = js.native
    def process(txt: String, options: OptionsWithJson, markup: Boolean): js.Array[AnserJsonEntry] = js.native
    
    def processChunk(text: String): String = js.native
    def processChunk(text: String, options: Unit, markup: Boolean): String = js.native
    def processChunk(text: String, options: AnserOptions): String = js.native
    def processChunk(text: String, options: AnserOptions, markup: Boolean): String = js.native
    /**
      * Processes the current chunk of text.
      *
      * @param text The input text.
      * @param options The options.
      * @param markup If false, the colors will not be parsed.
      * @return The result (object if `json` is wanted back or string otherwise).
      */
    def processChunk(text: String, options: OptionsWithJson): AnserJsonEntry = js.native
    def processChunk(text: String, options: OptionsWithJson, markup: Boolean): AnserJsonEntry = js.native
    
    /**
      * Processes the current chunk into json output.
      *
      * @param text The input text.
      * @param options The options.
      * @param markup If false, the colors will not be parsed.
      * @return The JSON output.
      */
    def processChunkJson(text: String): AnserJsonEntry = js.native
    def processChunkJson(text: String, options: Unit, markup: Boolean): AnserJsonEntry = js.native
    def processChunkJson(text: String, options: AnserOptions): AnserJsonEntry = js.native
    def processChunkJson(text: String, options: AnserOptions, markup: Boolean): AnserJsonEntry = js.native
    
    /**
      * Sets up the palette.
      */
    def setupPalette(): Unit = js.native
  }
  
  trait AnserJsonEntry extends StObject {
    
    /** The background color. */
    var bg: String
    
    /** The background true color (if 16m color is enabled). */
    var bg_truecolor: String
    
    /** `true` if a carriageReturn \r was fount at end of line. */
    var clearLine: Boolean
    
    /** The text. */
    var content: String
    
    /** The decoration last declared before the text. */
    var decoration: Null | DecorationName
    
    /** All decorations that apply to the text. */
    var decorations: js.Array[DecorationName]
    
    /** The foreground color. */
    var fg: String
    
    /** The foreground true color (if 16m color is enabled). */
    var fg_truecolor: String
    
    /** A function returning `true` if the content is empty, or `false` otherwise. */
    def isEmpty(): Boolean
    
    /** `true` if the colors were processed, `false` otherwise. */
    var was_processed: Boolean
  }
  object AnserJsonEntry {
    
    inline def apply(
      bg: String,
      bg_truecolor: String,
      clearLine: Boolean,
      content: String,
      decorations: js.Array[DecorationName],
      fg: String,
      fg_truecolor: String,
      isEmpty: () => Boolean,
      was_processed: Boolean
    ): AnserJsonEntry = {
      val __obj = js.Dynamic.literal(bg = bg.asInstanceOf[js.Any], bg_truecolor = bg_truecolor.asInstanceOf[js.Any], clearLine = clearLine.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], decorations = decorations.asInstanceOf[js.Any], fg = fg.asInstanceOf[js.Any], fg_truecolor = fg_truecolor.asInstanceOf[js.Any], isEmpty = js.Any.fromFunction0(isEmpty), was_processed = was_processed.asInstanceOf[js.Any], decoration = null)
      __obj.asInstanceOf[AnserJsonEntry]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnserJsonEntry] (val x: Self) extends AnyVal {
      
      inline def setBg(value: String): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      inline def setBg_truecolor(value: String): Self = StObject.set(x, "bg_truecolor", value.asInstanceOf[js.Any])
      
      inline def setClearLine(value: Boolean): Self = StObject.set(x, "clearLine", value.asInstanceOf[js.Any])
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDecoration(value: DecorationName): Self = StObject.set(x, "decoration", value.asInstanceOf[js.Any])
      
      inline def setDecorationNull: Self = StObject.set(x, "decoration", null)
      
      inline def setDecorations(value: js.Array[DecorationName]): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
      
      inline def setDecorationsVarargs(value: DecorationName*): Self = StObject.set(x, "decorations", js.Array(value*))
      
      inline def setFg(value: String): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      inline def setFg_truecolor(value: String): Self = StObject.set(x, "fg_truecolor", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setWas_processed(value: Boolean): Self = StObject.set(x, "was_processed", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnserOptions extends StObject {
    
    /** If `true`, the result will be an object. */
    var json: js.UndefOr[Boolean] = js.undefined
    
    var remove_empty: js.UndefOr[Boolean] = js.undefined
    
    /** If `true`, HTML classes will be appended to the HTML output. */
    var use_classes: js.UndefOr[Boolean] = js.undefined
  }
  object AnserOptions {
    
    inline def apply(): AnserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnserOptions] (val x: Self) extends AnyVal {
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setRemove_empty(value: Boolean): Self = StObject.set(x, "remove_empty", value.asInstanceOf[js.Any])
      
      inline def setRemove_emptyUndefined: Self = StObject.set(x, "remove_empty", js.undefined)
      
      inline def setUse_classes(value: Boolean): Self = StObject.set(x, "use_classes", value.asInstanceOf[js.Any])
      
      inline def setUse_classesUndefined: Self = StObject.set(x, "use_classes", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.anser.anserStrings.bold
    - typings.anser.anserStrings.dim
    - typings.anser.anserStrings.italic
    - typings.anser.anserStrings.underline
    - typings.anser.anserStrings.blink
    - typings.anser.anserStrings.reverse
    - typings.anser.anserStrings.hidden
    - typings.anser.anserStrings.strikethrough
  */
  trait DecorationName extends StObject
  object DecorationName {
    
    inline def blink: typings.anser.anserStrings.blink = "blink".asInstanceOf[typings.anser.anserStrings.blink]
    
    inline def bold: typings.anser.anserStrings.bold = "bold".asInstanceOf[typings.anser.anserStrings.bold]
    
    inline def dim: typings.anser.anserStrings.dim = "dim".asInstanceOf[typings.anser.anserStrings.dim]
    
    inline def hidden: typings.anser.anserStrings.hidden = "hidden".asInstanceOf[typings.anser.anserStrings.hidden]
    
    inline def italic: typings.anser.anserStrings.italic = "italic".asInstanceOf[typings.anser.anserStrings.italic]
    
    inline def reverse: typings.anser.anserStrings.reverse = "reverse".asInstanceOf[typings.anser.anserStrings.reverse]
    
    inline def strikethrough: typings.anser.anserStrings.strikethrough = "strikethrough".asInstanceOf[typings.anser.anserStrings.strikethrough]
    
    inline def underline: typings.anser.anserStrings.underline = "underline".asInstanceOf[typings.anser.anserStrings.underline]
  }
  
  trait OptionsWithJson
    extends StObject
       with AnserOptions {
    
    @JSName("json")
    var json_OptionsWithJson: `true`
  }
  object OptionsWithJson {
    
    inline def apply(): OptionsWithJson = {
      val __obj = js.Dynamic.literal(json = true)
      __obj.asInstanceOf[OptionsWithJson]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OptionsWithJson] (val x: Self) extends AnyVal {
      
      inline def setJson(value: `true`): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    }
  }
}
