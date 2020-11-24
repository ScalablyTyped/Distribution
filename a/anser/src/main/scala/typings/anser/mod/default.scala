package typings.anser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("anser", JSImport.Default)
@js.native
class default () extends Anser
/* static members */
@JSImport("anser", JSImport.Default)
@js.native
object default extends js.Object {
  
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
  def ansiToHtml(txt: String): String = js.native
  def ansiToHtml(txt: String, options: AnserOptions): String = js.native
  
  /**
    * Converts ANSI input into JSON output.
    *
    * @param txt The input text.
    * @param options The options.
    * @returns The HTML output.
    */
  def ansiToJson(txt: String): js.Array[AnserJsonEntry] = js.native
  def ansiToJson(txt: String, options: AnserOptions): js.Array[AnserJsonEntry] = js.native
  
  /**
    * Converts ANSI input into text output.
    *
    * @param txt The input text.
    * @returns The text output.
    */
  def ansiToText(txt: String): String = js.native
  def ansiToText(txt: String, options: AnserOptions): String = js.native
  
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
  def escapeForHtml(txt: String): String = js.native
  
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
  def linkify(txt: String): String = js.native
}
