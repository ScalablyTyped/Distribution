package typings.ansiStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackgroundColor extends js.Object {
  
  val bgBlack: CSPair = js.native
  
  val bgBlackBright: CSPair = js.native
  
  val bgBlue: CSPair = js.native
  
  val bgBlueBright: CSPair = js.native
  
  val bgCyan: CSPair = js.native
  
  val bgCyanBright: CSPair = js.native
  
  /**
  		Alias for `bgBlackBright`.
  		*/
  val bgGray: CSPair = js.native
  
  val bgGreen: CSPair = js.native
  
  val bgGreenBright: CSPair = js.native
  
  /**
  		Alias for `bgBlackBright`.
  		*/
  val bgGrey: CSPair = js.native
  
  val bgMagenta: CSPair = js.native
  
  val bgMagentaBright: CSPair = js.native
  
  val bgRed: CSPair = js.native
  
  val bgRedBright: CSPair = js.native
  
  val bgWhite: CSPair = js.native
  
  val bgWhiteBright: CSPair = js.native
  
  val bgYellow: CSPair = js.native
  
  val bgYellowBright: CSPair = js.native
}
object BackgroundColor {
  
  @scala.inline
  def apply(
    bgBlack: CSPair,
    bgBlackBright: CSPair,
    bgBlue: CSPair,
    bgBlueBright: CSPair,
    bgCyan: CSPair,
    bgCyanBright: CSPair,
    bgGray: CSPair,
    bgGreen: CSPair,
    bgGreenBright: CSPair,
    bgGrey: CSPair,
    bgMagenta: CSPair,
    bgMagentaBright: CSPair,
    bgRed: CSPair,
    bgRedBright: CSPair,
    bgWhite: CSPair,
    bgWhiteBright: CSPair,
    bgYellow: CSPair,
    bgYellowBright: CSPair
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(bgBlack = bgBlack.asInstanceOf[js.Any], bgBlackBright = bgBlackBright.asInstanceOf[js.Any], bgBlue = bgBlue.asInstanceOf[js.Any], bgBlueBright = bgBlueBright.asInstanceOf[js.Any], bgCyan = bgCyan.asInstanceOf[js.Any], bgCyanBright = bgCyanBright.asInstanceOf[js.Any], bgGray = bgGray.asInstanceOf[js.Any], bgGreen = bgGreen.asInstanceOf[js.Any], bgGreenBright = bgGreenBright.asInstanceOf[js.Any], bgGrey = bgGrey.asInstanceOf[js.Any], bgMagenta = bgMagenta.asInstanceOf[js.Any], bgMagentaBright = bgMagentaBright.asInstanceOf[js.Any], bgRed = bgRed.asInstanceOf[js.Any], bgRedBright = bgRedBright.asInstanceOf[js.Any], bgWhite = bgWhite.asInstanceOf[js.Any], bgWhiteBright = bgWhiteBright.asInstanceOf[js.Any], bgYellow = bgYellow.asInstanceOf[js.Any], bgYellowBright = bgYellowBright.asInstanceOf[js.Any])
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
    def setBgBlack(value: CSPair): Self = this.set("bgBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBlackBright(value: CSPair): Self = this.set("bgBlackBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBlue(value: CSPair): Self = this.set("bgBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBlueBright(value: CSPair): Self = this.set("bgBlueBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgCyan(value: CSPair): Self = this.set("bgCyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgCyanBright(value: CSPair): Self = this.set("bgCyanBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgGray(value: CSPair): Self = this.set("bgGray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgGreen(value: CSPair): Self = this.set("bgGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgGreenBright(value: CSPair): Self = this.set("bgGreenBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgGrey(value: CSPair): Self = this.set("bgGrey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgMagenta(value: CSPair): Self = this.set("bgMagenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgMagentaBright(value: CSPair): Self = this.set("bgMagentaBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRed(value: CSPair): Self = this.set("bgRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRedBright(value: CSPair): Self = this.set("bgRedBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWhite(value: CSPair): Self = this.set("bgWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWhiteBright(value: CSPair): Self = this.set("bgWhiteBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgYellow(value: CSPair): Self = this.set("bgYellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgYellowBright(value: CSPair): Self = this.set("bgYellowBright", value.asInstanceOf[js.Any])
  }
}
