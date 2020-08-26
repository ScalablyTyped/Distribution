package typings.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Color extends js.Object {
  var black: CodePair = js.native
  var blue: CodePair = js.native
  var blueBright: CodePair = js.native
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
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueBright = blueBright.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], cyanBright = cyanBright.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], greenBright = greenBright.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], magentaBright = magentaBright.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redBright = redBright.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], whiteBright = whiteBright.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any], yellowBright = yellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlack(value: CodePair): Self = this.set("black", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlue(value: CodePair): Self = this.set("blue", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlueBright(value: CodePair): Self = this.set("blueBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setCyan(value: CodePair): Self = this.set("cyan", value.asInstanceOf[js.Any])
    @scala.inline
    def setCyanBright(value: CodePair): Self = this.set("cyanBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setGray(value: CodePair): Self = this.set("gray", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreen(value: CodePair): Self = this.set("green", value.asInstanceOf[js.Any])
    @scala.inline
    def setGreenBright(value: CodePair): Self = this.set("greenBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setGrey(value: CodePair): Self = this.set("grey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagenta(value: CodePair): Self = this.set("magenta", value.asInstanceOf[js.Any])
    @scala.inline
    def setMagentaBright(value: CodePair): Self = this.set("magentaBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setRed(value: CodePair): Self = this.set("red", value.asInstanceOf[js.Any])
    @scala.inline
    def setRedBright(value: CodePair): Self = this.set("redBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhite(value: CodePair): Self = this.set("white", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteBright(value: CodePair): Self = this.set("whiteBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellow(value: CodePair): Self = this.set("yellow", value.asInstanceOf[js.Any])
    @scala.inline
    def setYellowBright(value: CodePair): Self = this.set("yellowBright", value.asInstanceOf[js.Any])
  }
  
}

