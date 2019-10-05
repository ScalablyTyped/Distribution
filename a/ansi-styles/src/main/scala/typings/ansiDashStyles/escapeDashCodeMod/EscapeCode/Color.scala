package typings.ansiDashStyles.escapeDashCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var black: CodePair
  var blue: CodePair
  var blueBright: CodePair
  var cyan: CodePair
  var cyanBright: CodePair
  /**
    * bright black
    */
  var gray: CodePair
  var green: CodePair
  var greenBright: CodePair
  var grey: CodePair
  var magenta: CodePair
  var magentaBright: CodePair
  var red: CodePair
  var redBright: CodePair
  var white: CodePair
  var whiteBright: CodePair
  var yellow: CodePair
  var yellowBright: CodePair
}

object Color {
  @scala.inline
  def apply(
    black: CodePair,
    blue: CodePair,
    blueBright: CodePair,
    cyan: CodePair,
    cyanBright: CodePair,
    gray: CodePair,
    green: CodePair,
    greenBright: CodePair,
    grey: CodePair,
    magenta: CodePair,
    magentaBright: CodePair,
    red: CodePair,
    redBright: CodePair,
    white: CodePair,
    whiteBright: CodePair,
    yellow: CodePair,
    yellowBright: CodePair
  ): Color = {
    val __obj = js.Dynamic.literal(black = black, blue = blue, blueBright = blueBright, cyan = cyan, cyanBright = cyanBright, gray = gray, green = green, greenBright = greenBright, grey = grey, magenta = magenta, magentaBright = magentaBright, red = red, redBright = redBright, white = white, whiteBright = whiteBright, yellow = yellow, yellowBright = yellowBright)
  
    __obj.asInstanceOf[Color]
  }
}

