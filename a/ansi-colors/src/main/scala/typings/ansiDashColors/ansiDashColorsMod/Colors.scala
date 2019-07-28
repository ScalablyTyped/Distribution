package typings.ansiDashColors.ansiDashColorsMod

import typings.ansiDashColors.Anon_Other
import typings.ansiDashColors.ansiDashColorsStrings.bg
import typings.ansiDashColors.ansiDashColorsStrings.bgBright
import typings.ansiDashColors.ansiDashColorsStrings.bright
import typings.ansiDashColors.ansiDashColorsStrings.color
import typings.ansiDashColors.ansiDashColorsStrings.modifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Colors extends js.Object {
  @JSName("bgBlackBright")
  var bgBlackBright_Original: ColorFn = js.native
  @JSName("bgBlack")
  var bgBlack_Original: ColorFn = js.native
  @JSName("bgBlueBright")
  var bgBlueBright_Original: ColorFn = js.native
  @JSName("bgBlue")
  var bgBlue_Original: ColorFn = js.native
  @JSName("bgCyanBright")
  var bgCyanBright_Original: ColorFn = js.native
  @JSName("bgCyan")
  var bgCyan_Original: ColorFn = js.native
  @JSName("bgGreenBright")
  var bgGreenBright_Original: ColorFn = js.native
  @JSName("bgGreen")
  var bgGreen_Original: ColorFn = js.native
  @JSName("bgMagentaBright")
  var bgMagentaBright_Original: ColorFn = js.native
  @JSName("bgMagenta")
  var bgMagenta_Original: ColorFn = js.native
  @JSName("bgRedBright")
  var bgRedBright_Original: ColorFn = js.native
  @JSName("bgRed")
  var bgRed_Original: ColorFn = js.native
  @JSName("bgWhiteBright")
  var bgWhiteBright_Original: ColorFn = js.native
  @JSName("bgWhite")
  var bgWhite_Original: ColorFn = js.native
  @JSName("bgYellowBright")
  var bgYellowBright_Original: ColorFn = js.native
  @JSName("bgYellow")
  var bgYellow_Original: ColorFn = js.native
  @JSName("blackBright")
  var blackBright_Original: ColorFn = js.native
  @JSName("black")
  var black_Original: ColorFn = js.native
  @JSName("blueBright")
  var blueBright_Original: ColorFn = js.native
  @JSName("blue")
  var blue_Original: ColorFn = js.native
  @JSName("bold")
  var bold_Original: ColorFn = js.native
  @JSName("cyanBright")
  var cyanBright_Original: ColorFn = js.native
  @JSName("cyan")
  var cyan_Original: ColorFn = js.native
  @JSName("dim")
  var dim_Original: ColorFn = js.native
  var enabled: Boolean = js.native
  @JSName("gray")
  var gray_Original: ColorFn = js.native
  @JSName("greenBright")
  var greenBright_Original: ColorFn = js.native
  @JSName("green")
  var green_Original: ColorFn = js.native
  @JSName("grey")
  var grey_Original: ColorFn = js.native
  @JSName("hidden")
  var hidden_Original: ColorFn = js.native
  @JSName("inverse")
  var inverse_Original: ColorFn = js.native
  @JSName("italic")
  var italic_Original: ColorFn = js.native
  @JSName("magentaBright")
  var magentaBright_Original: ColorFn = js.native
  @JSName("magenta")
  var magenta_Original: ColorFn = js.native
  @JSName("redBright")
  var redBright_Original: ColorFn = js.native
  @JSName("red")
  var red_Original: ColorFn = js.native
  @JSName("reset")
  var reset_Original: ColorFn = js.native
  @JSName("strikethrough")
  var strikethrough_Original: ColorFn = js.native
  var symbols: Symbols with Anon_Other = js.native
  @JSName("underline")
  var underline_Original: ColorFn = js.native
  var visible: Boolean = js.native
  @JSName("whiteBright")
  var whiteBright_Original: ColorFn = js.native
  @JSName("white")
  var white_Original: ColorFn = js.native
  @JSName("yellowBright")
  var yellowBright_Original: ColorFn = js.native
  @JSName("yellow")
  var yellow_Original: ColorFn = js.native
  def bgBlack(text: String): String = js.native
  def bgBlackBright(text: String): String = js.native
  def bgBlue(text: String): String = js.native
  def bgBlueBright(text: String): String = js.native
  def bgCyan(text: String): String = js.native
  def bgCyanBright(text: String): String = js.native
  def bgGreen(text: String): String = js.native
  def bgGreenBright(text: String): String = js.native
  def bgMagenta(text: String): String = js.native
  def bgMagentaBright(text: String): String = js.native
  def bgRed(text: String): String = js.native
  def bgRedBright(text: String): String = js.native
  def bgWhite(text: String): String = js.native
  def bgWhiteBright(text: String): String = js.native
  def bgYellow(text: String): String = js.native
  def bgYellowBright(text: String): String = js.native
  def black(text: String): String = js.native
  def blackBright(text: String): String = js.native
  def blue(text: String): String = js.native
  def blueBright(text: String): String = js.native
  def bold(text: String): String = js.native
  def clear(text: String): String = js.native
  def cyan(text: String): String = js.native
  def cyanBright(text: String): String = js.native
  @JSName("define")
  def define_bg(name: String, codes: js.Tuple2[Double, Double], `type`: bg): Unit = js.native
  @JSName("define")
  def define_bgBright(name: String, codes: js.Tuple2[Double, Double], `type`: bgBright): Unit = js.native
  @JSName("define")
  def define_bright(name: String, codes: js.Tuple2[Double, Double], `type`: bright): Unit = js.native
  @JSName("define")
  def define_color(name: String, codes: js.Tuple2[Double, Double], `type`: color): Unit = js.native
  @JSName("define")
  def define_modifier(name: String, codes: js.Tuple2[Double, Double], `type`: modifier): Unit = js.native
  def dim(text: String): String = js.native
  def gray(text: String): String = js.native
  def green(text: String): String = js.native
  def greenBright(text: String): String = js.native
  def grey(text: String): String = js.native
  def hasAnsi(text: String): Boolean = js.native
  def hasColor(text: String): Boolean = js.native
  def hidden(text: String): String = js.native
  def inverse(text: String): String = js.native
  def italic(text: String): String = js.native
  def magenta(text: String): String = js.native
  def magentaBright(text: String): String = js.native
  def none(text: String): String = js.native
  def noop(text: String): String = js.native
  def red(text: String): String = js.native
  def redBright(text: String): String = js.native
  def reset(text: String): String = js.native
  def strikethrough(text: String): String = js.native
  def stripColor(text: String): String = js.native
  def underline(text: String): String = js.native
  def unstyle(text: String): String = js.native
  def white(text: String): String = js.native
  def whiteBright(text: String): String = js.native
  def yellow(text: String): String = js.native
  def yellowBright(text: String): String = js.native
}

