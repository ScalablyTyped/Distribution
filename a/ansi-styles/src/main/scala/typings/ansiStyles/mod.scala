package typings.ansiStyles

import typings.ansiStyles.escapeCodeMod.EscapeCode.CodePair
import typings.ansiStyles.escapeCodeMod.EscapeCode.Conversions
import typings.ansiStyles.escapeCodeMod.EscapeCode.Modifier
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ansi-styles", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val bgBlack: CodePair = js.native
  val bgBlackBright: CodePair = js.native
  val bgBlue: CodePair = js.native
  val bgBlueBright: CodePair = js.native
  val bgCyan: CodePair = js.native
  val bgCyanBright: CodePair = js.native
  val bgGreen: CodePair = js.native
  val bgGreenBright: CodePair = js.native
  val bgMagenta: CodePair = js.native
  val bgMagentaBright: CodePair = js.native
  val bgRed: CodePair = js.native
  val bgRedBright: CodePair = js.native
  val bgWhite: CodePair = js.native
  val bgWhiteBright: CodePair = js.native
  val bgYellow: CodePair = js.native
  val bgYellowBright: CodePair = js.native
  val black: CodePair = js.native
  val blue: CodePair = js.native
  val blueBright: CodePair = js.native
  val bold: CodePair = js.native
  val codes: Map[Double, Double] = js.native
  val cyan: CodePair = js.native
  val cyanBright: CodePair = js.native
  val dim: CodePair = js.native
  val gray: CodePair = js.native
  val green: CodePair = js.native
  val greenBright: CodePair = js.native
  val grey: CodePair = js.native
  val hidden: CodePair = js.native
  val inverse: CodePair = js.native
  val italic: CodePair = js.native
  val magenta: CodePair = js.native
  val magentaBright: CodePair = js.native
  val modifier: Modifier = js.native
  val red: CodePair = js.native
  val redBright: CodePair = js.native
  val reset: CodePair = js.native
  val strikethrough: CodePair = js.native
  val underline: CodePair = js.native
  val white: CodePair = js.native
  val whiteBright: CodePair = js.native
  val yellow: CodePair = js.native
  val yellowBright: CodePair = js.native
  @js.native
  object bgColor extends js.Object {
    /**
      * 16 color ansi code
      */
    var ansi: Conversions = js.native
    /**
      * truecolor(16 million color) ansi code
      */
    var ansi16m: Conversions = js.native
    /**
      * 256 color ansi code
      */
    var ansi256: Conversions = js.native
    var bgBlack: CodePair = js.native
    var bgBlackBright: CodePair = js.native
    var bgBlue: CodePair = js.native
    var bgBlueBright: CodePair = js.native
    var bgCyan: CodePair = js.native
    var bgCyanBright: CodePair = js.native
    var bgGreen: CodePair = js.native
    var bgGreenBright: CodePair = js.native
    var bgMagenta: CodePair = js.native
    var bgMagentaBright: CodePair = js.native
    var bgRed: CodePair = js.native
    var bgRedBright: CodePair = js.native
    var bgWhite: CodePair = js.native
    var bgWhiteBright: CodePair = js.native
    var bgYellow: CodePair = js.native
    var bgYellowBright: CodePair = js.native
    var close: String = js.native
  }
  
  @js.native
  object color extends js.Object {
    /**
      * 16 color ansi code
      */
    var ansi: Conversions = js.native
    /**
      * truecolor(16 million color) ansi code
      */
    var ansi16m: Conversions = js.native
    /**
      * 256 color ansi code
      */
    var ansi256: Conversions = js.native
    var black: CodePair = js.native
    var blue: CodePair = js.native
    var blueBright: CodePair = js.native
    var close: String = js.native
    var cyan: CodePair = js.native
    var cyanBright: CodePair = js.native
    /**
      * bright black
      */
    var gray: CodePair = js.native
    var green: CodePair = js.native
    var greenBright: CodePair = js.native
    var grey: CodePair = js.native
    var magenta: CodePair = js.native
    var magentaBright: CodePair = js.native
    var red: CodePair = js.native
    var redBright: CodePair = js.native
    var white: CodePair = js.native
    var whiteBright: CodePair = js.native
    var yellow: CodePair = js.native
    var yellowBright: CodePair = js.native
  }
  
}

