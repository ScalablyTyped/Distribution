package typings.ansiStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForegroundColor extends js.Object {
  
  val black: CSPair = js.native
  
  val blackBright: CSPair = js.native
  
  val blue: CSPair = js.native
  
  val blueBright: CSPair = js.native
  
  val cyan: CSPair = js.native
  
  val cyanBright: CSPair = js.native
  
  /**
  		Alias for `blackBright`.
  		*/
  val gray: CSPair = js.native
  
  val green: CSPair = js.native
  
  val greenBright: CSPair = js.native
  
  /**
  		Alias for `blackBright`.
  		*/
  val grey: CSPair = js.native
  
  val magenta: CSPair = js.native
  
  val magentaBright: CSPair = js.native
  
  val red: CSPair = js.native
  
  val redBright: CSPair = js.native
  
  val white: CSPair = js.native
  
  val whiteBright: CSPair = js.native
  
  val yellow: CSPair = js.native
  
  val yellowBright: CSPair = js.native
}
object ForegroundColor {
  
  @scala.inline
  def apply(
    black: CSPair,
    blackBright: CSPair,
    blue: CSPair,
    blueBright: CSPair,
    cyan: CSPair,
    cyanBright: CSPair,
    gray: CSPair,
    green: CSPair,
    greenBright: CSPair,
    grey: CSPair,
    magenta: CSPair,
    magentaBright: CSPair,
    red: CSPair,
    redBright: CSPair,
    white: CSPair,
    whiteBright: CSPair,
    yellow: CSPair,
    yellowBright: CSPair
  ): ForegroundColor = {
    val __obj = js.Dynamic.literal(black = black.asInstanceOf[js.Any], blackBright = blackBright.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueBright = blueBright.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], cyanBright = cyanBright.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], greenBright = greenBright.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], magentaBright = magentaBright.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redBright = redBright.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], whiteBright = whiteBright.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any], yellowBright = yellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForegroundColor]
  }
  
  @scala.inline
  implicit class ForegroundColorOps[Self <: ForegroundColor] (val x: Self) extends AnyVal {
    
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
    def setBlack(value: CSPair): Self = this.set("black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackBright(value: CSPair): Self = this.set("blackBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: CSPair): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueBright(value: CSPair): Self = this.set("blueBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyan(value: CSPair): Self = this.set("cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyanBright(value: CSPair): Self = this.set("cyanBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGray(value: CSPair): Self = this.set("gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: CSPair): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenBright(value: CSPair): Self = this.set("greenBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey(value: CSPair): Self = this.set("grey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagenta(value: CSPair): Self = this.set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagentaBright(value: CSPair): Self = this.set("magentaBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: CSPair): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedBright(value: CSPair): Self = this.set("redBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhite(value: CSPair): Self = this.set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBright(value: CSPair): Self = this.set("whiteBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellow(value: CSPair): Self = this.set("yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowBright(value: CSPair): Self = this.set("yellowBright", value.asInstanceOf[js.Any])
  }
}
