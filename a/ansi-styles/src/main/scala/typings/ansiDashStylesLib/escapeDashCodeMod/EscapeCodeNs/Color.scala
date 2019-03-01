package typings
package ansiDashStylesLib.escapeDashCodeMod.EscapeCodeNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("black")(black)
    __obj.updateDynamic("blue")(blue)
    __obj.updateDynamic("blueBright")(blueBright)
    __obj.updateDynamic("cyan")(cyan)
    __obj.updateDynamic("cyanBright")(cyanBright)
    __obj.updateDynamic("gray")(gray)
    __obj.updateDynamic("green")(green)
    __obj.updateDynamic("greenBright")(greenBright)
    __obj.updateDynamic("grey")(grey)
    __obj.updateDynamic("magenta")(magenta)
    __obj.updateDynamic("magentaBright")(magentaBright)
    __obj.updateDynamic("red")(red)
    __obj.updateDynamic("redBright")(redBright)
    __obj.updateDynamic("white")(white)
    __obj.updateDynamic("whiteBright")(whiteBright)
    __obj.updateDynamic("yellow")(yellow)
    __obj.updateDynamic("yellowBright")(yellowBright)
    __obj.asInstanceOf[Color]
  }
}

