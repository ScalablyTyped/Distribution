package typings.ansiStyles.escapeCodeMod.EscapeCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackgroundColor extends js.Object {
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
}

object BackgroundColor {
  @scala.inline
  def apply(
    bgBlack: CodePair,
    bgBlackBright: CodePair,
    bgBlue: CodePair,
    bgBlueBright: CodePair,
    bgCyan: CodePair,
    bgCyanBright: CodePair,
    bgGreen: CodePair,
    bgGreenBright: CodePair,
    bgMagenta: CodePair,
    bgMagentaBright: CodePair,
    bgRed: CodePair,
    bgRedBright: CodePair,
    bgWhite: CodePair,
    bgWhiteBright: CodePair,
    bgYellow: CodePair,
    bgYellowBright: CodePair
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(bgBlack = bgBlack.asInstanceOf[js.Any], bgBlackBright = bgBlackBright.asInstanceOf[js.Any], bgBlue = bgBlue.asInstanceOf[js.Any], bgBlueBright = bgBlueBright.asInstanceOf[js.Any], bgCyan = bgCyan.asInstanceOf[js.Any], bgCyanBright = bgCyanBright.asInstanceOf[js.Any], bgGreen = bgGreen.asInstanceOf[js.Any], bgGreenBright = bgGreenBright.asInstanceOf[js.Any], bgMagenta = bgMagenta.asInstanceOf[js.Any], bgMagentaBright = bgMagentaBright.asInstanceOf[js.Any], bgRed = bgRed.asInstanceOf[js.Any], bgRedBright = bgRedBright.asInstanceOf[js.Any], bgWhite = bgWhite.asInstanceOf[js.Any], bgWhiteBright = bgWhiteBright.asInstanceOf[js.Any], bgYellow = bgYellow.asInstanceOf[js.Any], bgYellowBright = bgYellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
  @scala.inline
  implicit class BackgroundColorOps[Self <: BackgroundColor] (val x: Self) extends AnyVal {
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
    def setBgBlack(value: CodePair): Self = this.set("bgBlack", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgBlackBright(value: CodePair): Self = this.set("bgBlackBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgBlue(value: CodePair): Self = this.set("bgBlue", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgBlueBright(value: CodePair): Self = this.set("bgBlueBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgCyan(value: CodePair): Self = this.set("bgCyan", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgCyanBright(value: CodePair): Self = this.set("bgCyanBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgGreen(value: CodePair): Self = this.set("bgGreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgGreenBright(value: CodePair): Self = this.set("bgGreenBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgMagenta(value: CodePair): Self = this.set("bgMagenta", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgMagentaBright(value: CodePair): Self = this.set("bgMagentaBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgRed(value: CodePair): Self = this.set("bgRed", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgRedBright(value: CodePair): Self = this.set("bgRedBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgWhite(value: CodePair): Self = this.set("bgWhite", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgWhiteBright(value: CodePair): Self = this.set("bgWhiteBright", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgYellow(value: CodePair): Self = this.set("bgYellow", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgYellowBright(value: CodePair): Self = this.set("bgYellowBright", value.asInstanceOf[js.Any])
  }
  
}

