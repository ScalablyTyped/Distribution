package typings.ansiEscapeSequences

import typings.ansiEscapeSequences.ansiEscapeSequencesNumbers.`0`
import typings.ansiEscapeSequences.ansiEscapeSequencesNumbers.`1`
import typings.ansiEscapeSequences.ansiEscapeSequencesNumbers.`2`
import typings.ansiEscapeSequences.ansiEscapeSequencesNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ansi-escape-sequences", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object cursor {
    
    @JSImport("ansi-escape-sequences", "cursor")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Moves the cursor `lines` cells back. If the cursor is already at the edge
      * of the screen, this has no effect.
      * @param lines default=1
      */
    inline def back(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("back")().asInstanceOf[String]
    inline def back(lines: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("back")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Moves the cursor `lines` cells down. If the cursor is already at the edge
      * of the screen, this has no effect.
      * @param lines default=1
      */
    inline def down(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")().asInstanceOf[String]
    inline def down(lines: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Moves the cursor `lines` cells forward. If the cursor is already at the
      * edge of the screen, this has no effect.
      * @param lines default=1
      */
    inline def forward(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")().asInstanceOf[String]
    inline def forward(lines: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("forward")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Hides the cursor
      */
    @JSImport("ansi-escape-sequences", "cursor.hide")
    @js.native
    val hide: String = js.native
    
    /**
      * Moves the cursor to column n.
      * @param n column number
      */
    inline def horizontalAbsolute(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("horizontalAbsolute")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Moves cursor to beginning of the line n lines down.
      * @param lines default=1
      */
    inline def nextLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nextLine")().asInstanceOf[String]
    inline def nextLine(lines: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("nextLine")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Moves the cursor to row n, column m. The values are 1-based, and default
      * to 1 (top left corner) if omitted.
      *
      * @param n row number, default=1
      * @param m column number, default=1
      */
    inline def position(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("position")().asInstanceOf[String]
    inline def position(n: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def position(n: Double, m: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("position")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def position(n: Unit, m: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("position")(n.asInstanceOf[js.Any], m.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Moves cursor to beginning of the line n lines up.
      * @param lines default=1
      */
    inline def previousLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("previousLine")().asInstanceOf[String]
    inline def previousLine(lines: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("previousLine")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Shows the cursor
      */
    @JSImport("ansi-escape-sequences", "cursor.show")
    @js.native
    val show: String = js.native
    
    /**
      * Moves the cursor `lines` cells up. If the cursor is already at the edge
      * of the screen, this has no effect.
      * @param lines default=1
      */
    inline def up(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")().asInstanceOf[String]
    inline def up(lines: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(lines.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  object erase {
    
    @JSImport("ansi-escape-sequences", "erase")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Clears part of the screen. If n is 0 (or missing), clear from cursor to
      * end of screen. If n is 1, clear from cursor to beginning of the screen.
      * If n is 2, clear entire screen. If n is 3, clear entire screen and delete
      * all lines saved in the scrollback buffer (some terminals only).
      */
    inline def display(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("display")().asInstanceOf[String]
    
    inline def display_0(n: `0`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def display_1(n: `1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def display_2(n: `2`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def display_3(n: `3`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("display")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Erases part of the line. If n is zero (or missing), clear from cursor to
      * the end of the line. If n is one, clear from cursor to beginning of the
      * line. If n is two, clear entire line. Cursor position does not change.
      */
    inline def inLine(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inLine")().asInstanceOf[String]
    
    inline def inLine_0(n: `0`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inLine")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def inLine_1(n: `1`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inLine")(n.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def inLine_2(n: `2`): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inLine")(n.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  inline def format(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def format(str: String, styles: js.Array[Style_]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(str: String, styles: Style_): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(str.asInstanceOf[js.Any], styles.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* Inlined {[ K in ansi-escape-sequences.ansi-escape-sequences.Style ]: string} */
  object style {
    
    @JSImport("ansi-escape-sequences", "style")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ansi-escape-sequences", "style.bg-black")
    @js.native
    def bgBlack: String = js.native
    
    inline def bgBlack_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-black")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-blue")
    @js.native
    def bgBlue: String = js.native
    
    inline def bgBlue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-blue")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-cyan")
    @js.native
    def bgCyan: String = js.native
    
    inline def bgCyan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-cyan")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-gray")
    @js.native
    def bgGray: String = js.native
    
    inline def bgGray_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-gray")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-green")
    @js.native
    def bgGreen: String = js.native
    
    inline def bgGreen_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-green")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-grey")
    @js.native
    def bgGrey: String = js.native
    
    inline def bgGrey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-grey")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-magenta")
    @js.native
    def bgMagenta: String = js.native
    
    inline def bgMagenta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-magenta")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-red")
    @js.native
    def bgRed: String = js.native
    
    inline def bgRed_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-red")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-white")
    @js.native
    def bgWhite: String = js.native
    
    inline def bgWhite_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-white")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bg-yellow")
    @js.native
    def bgYellow: String = js.native
    
    inline def bgYellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bg-yellow")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.black")
    @js.native
    def black: String = js.native
    inline def black_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("black")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.blue")
    @js.native
    def blue: String = js.native
    inline def blue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.bold")
    @js.native
    def bold: String = js.native
    inline def bold_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bold")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.cyan")
    @js.native
    def cyan: String = js.native
    inline def cyan_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cyan")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font2")
    @js.native
    def font2: String = js.native
    inline def font2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font2")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font3")
    @js.native
    def font3: String = js.native
    inline def font3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font3")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font4")
    @js.native
    def font4: String = js.native
    inline def font4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font4")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font5")
    @js.native
    def font5: String = js.native
    inline def font5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font5")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.font6")
    @js.native
    def font6: String = js.native
    inline def font6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font6")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.fontDefault")
    @js.native
    def fontDefault: String = js.native
    inline def fontDefault_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.gray")
    @js.native
    def gray: String = js.native
    inline def gray_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.green")
    @js.native
    def green: String = js.native
    inline def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.grey")
    @js.native
    def grey: String = js.native
    inline def grey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("grey")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.imageNegative")
    @js.native
    def imageNegative: String = js.native
    inline def imageNegative_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imageNegative")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.imagePositive")
    @js.native
    def imagePositive: String = js.native
    inline def imagePositive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagePositive")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.italic")
    @js.native
    def italic: String = js.native
    inline def italic_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("italic")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.magenta")
    @js.native
    def magenta: String = js.native
    inline def magenta_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("magenta")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.red")
    @js.native
    def red: String = js.native
    inline def red_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.reset")
    @js.native
    def reset: String = js.native
    inline def reset_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("reset")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.underline")
    @js.native
    def underline: String = js.native
    inline def underline_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("underline")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.white")
    @js.native
    def white: String = js.native
    inline def white_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("white")(x.asInstanceOf[js.Any])
    
    @JSImport("ansi-escape-sequences", "style.yellow")
    @js.native
    def yellow: String = js.native
    inline def yellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
  }
  
  inline def styles(styles: js.Array[Style_]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styles")(styles.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def styles(styles: Style_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("styles")(styles.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.reset
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.bold
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.italic
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.underline
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.fontDefault
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font2
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font3
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font4
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font5
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font6
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.imageNegative
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.imagePositive
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.black
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.red
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.green
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.yellow
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.blue
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.magenta
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.cyan
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.white
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.grey
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.gray
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-black`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-red`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-green`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-yellow`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-blue`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-magenta`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-cyan`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-white`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-grey`
    - typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-gray`
  */
  trait Style_ extends StObject
  object Style_ {
    
    inline def `bg-black`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-black` = "bg-black".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-black`]
    
    inline def `bg-blue`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-blue` = "bg-blue".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-blue`]
    
    inline def `bg-cyan`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-cyan` = "bg-cyan".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-cyan`]
    
    inline def `bg-gray`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-gray` = "bg-gray".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-gray`]
    
    inline def `bg-green`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-green` = "bg-green".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-green`]
    
    inline def `bg-grey`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-grey` = "bg-grey".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-grey`]
    
    inline def `bg-magenta`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-magenta` = "bg-magenta".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-magenta`]
    
    inline def `bg-red`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-red` = "bg-red".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-red`]
    
    inline def `bg-white`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-white` = "bg-white".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-white`]
    
    inline def `bg-yellow`: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-yellow` = "bg-yellow".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.`bg-yellow`]
    
    inline def black: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.black = "black".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.black]
    
    inline def blue: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.blue = "blue".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.blue]
    
    inline def bold: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.bold = "bold".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.bold]
    
    inline def cyan: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.cyan = "cyan".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.cyan]
    
    inline def font2: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font2 = "font2".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font2]
    
    inline def font3: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font3 = "font3".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font3]
    
    inline def font4: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font4 = "font4".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font4]
    
    inline def font5: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font5 = "font5".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font5]
    
    inline def font6: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font6 = "font6".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.font6]
    
    inline def fontDefault: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.fontDefault = "fontDefault".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.fontDefault]
    
    inline def gray: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.gray = "gray".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.gray]
    
    inline def green: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.green = "green".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.green]
    
    inline def grey: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.grey = "grey".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.grey]
    
    inline def imageNegative: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.imageNegative = "imageNegative".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.imageNegative]
    
    inline def imagePositive: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.imagePositive = "imagePositive".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.imagePositive]
    
    inline def italic: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.italic = "italic".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.italic]
    
    inline def magenta: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.magenta = "magenta".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.magenta]
    
    inline def red: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.red = "red".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.red]
    
    inline def reset: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.reset = "reset".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.reset]
    
    inline def underline: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.underline = "underline".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.underline]
    
    inline def white: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.white = "white".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.white]
    
    inline def yellow: typings.ansiEscapeSequences.ansiEscapeSequencesStrings.yellow = "yellow".asInstanceOf[typings.ansiEscapeSequences.ansiEscapeSequencesStrings.yellow]
  }
}
