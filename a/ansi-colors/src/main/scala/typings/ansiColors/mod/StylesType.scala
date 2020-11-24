package typings.ansiColors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylesType[T] extends js.Object {
  
  // background colors
  var bgBlack: T = js.native
  
  // bright background colors
  var bgBlackBright: T = js.native
  
  var bgBlue: T = js.native
  
  var bgBlueBright: T = js.native
  
  var bgCyan: T = js.native
  
  var bgCyanBright: T = js.native
  
  var bgGreen: T = js.native
  
  var bgGreenBright: T = js.native
  
  var bgMagenta: T = js.native
  
  var bgMagentaBright: T = js.native
  
  var bgRed: T = js.native
  
  var bgRedBright: T = js.native
  
  var bgWhite: T = js.native
  
  var bgWhiteBright: T = js.native
  
  var bgYellow: T = js.native
  
  var bgYellowBright: T = js.native
  
  // colors
  var black: T = js.native
  
  // bright colors
  var blackBright: T = js.native
  
  var blue: T = js.native
  
  var blueBright: T = js.native
  
  var bold: T = js.native
  
  var cyan: T = js.native
  
  var cyanBright: T = js.native
  
  var dim: T = js.native
  
  var gray: T = js.native
  
  var green: T = js.native
  
  var greenBright: T = js.native
  
  var grey: T = js.native
  
  var hidden: T = js.native
  
  var inverse: T = js.native
  
  var italic: T = js.native
  
  var magenta: T = js.native
  
  var magentaBright: T = js.native
  
  var red: T = js.native
  
  var redBright: T = js.native
  
  // modifiers
  var reset: T = js.native
  
  var strikethrough: T = js.native
  
  var underline: T = js.native
  
  var white: T = js.native
  
  var whiteBright: T = js.native
  
  var yellow: T = js.native
  
  var yellowBright: T = js.native
}
object StylesType {
  
  @scala.inline
  def apply[T](
    bgBlack: T,
    bgBlackBright: T,
    bgBlue: T,
    bgBlueBright: T,
    bgCyan: T,
    bgCyanBright: T,
    bgGreen: T,
    bgGreenBright: T,
    bgMagenta: T,
    bgMagentaBright: T,
    bgRed: T,
    bgRedBright: T,
    bgWhite: T,
    bgWhiteBright: T,
    bgYellow: T,
    bgYellowBright: T,
    black: T,
    blackBright: T,
    blue: T,
    blueBright: T,
    bold: T,
    cyan: T,
    cyanBright: T,
    dim: T,
    gray: T,
    green: T,
    greenBright: T,
    grey: T,
    hidden: T,
    inverse: T,
    italic: T,
    magenta: T,
    magentaBright: T,
    red: T,
    redBright: T,
    reset: T,
    strikethrough: T,
    underline: T,
    white: T,
    whiteBright: T,
    yellow: T,
    yellowBright: T
  ): StylesType[T] = {
    val __obj = js.Dynamic.literal(bgBlack = bgBlack.asInstanceOf[js.Any], bgBlackBright = bgBlackBright.asInstanceOf[js.Any], bgBlue = bgBlue.asInstanceOf[js.Any], bgBlueBright = bgBlueBright.asInstanceOf[js.Any], bgCyan = bgCyan.asInstanceOf[js.Any], bgCyanBright = bgCyanBright.asInstanceOf[js.Any], bgGreen = bgGreen.asInstanceOf[js.Any], bgGreenBright = bgGreenBright.asInstanceOf[js.Any], bgMagenta = bgMagenta.asInstanceOf[js.Any], bgMagentaBright = bgMagentaBright.asInstanceOf[js.Any], bgRed = bgRed.asInstanceOf[js.Any], bgRedBright = bgRedBright.asInstanceOf[js.Any], bgWhite = bgWhite.asInstanceOf[js.Any], bgWhiteBright = bgWhiteBright.asInstanceOf[js.Any], bgYellow = bgYellow.asInstanceOf[js.Any], bgYellowBright = bgYellowBright.asInstanceOf[js.Any], black = black.asInstanceOf[js.Any], blackBright = blackBright.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], blueBright = blueBright.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], cyanBright = cyanBright.asInstanceOf[js.Any], dim = dim.asInstanceOf[js.Any], gray = gray.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], greenBright = greenBright.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any], italic = italic.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], magentaBright = magentaBright.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], redBright = redBright.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], strikethrough = strikethrough.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], whiteBright = whiteBright.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any], yellowBright = yellowBright.asInstanceOf[js.Any])
    __obj.asInstanceOf[StylesType[T]]
  }
  
  @scala.inline
  implicit class StylesTypeOps[Self <: StylesType[_], T] (val x: Self with StylesType[T]) extends AnyVal {
    
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
    def setBgBlack(value: T): Self = this.set("bgBlack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBlackBright(value: T): Self = this.set("bgBlackBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBlue(value: T): Self = this.set("bgBlue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgBlueBright(value: T): Self = this.set("bgBlueBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgCyan(value: T): Self = this.set("bgCyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgCyanBright(value: T): Self = this.set("bgCyanBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgGreen(value: T): Self = this.set("bgGreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgGreenBright(value: T): Self = this.set("bgGreenBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgMagenta(value: T): Self = this.set("bgMagenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgMagentaBright(value: T): Self = this.set("bgMagentaBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRed(value: T): Self = this.set("bgRed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgRedBright(value: T): Self = this.set("bgRedBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWhite(value: T): Self = this.set("bgWhite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgWhiteBright(value: T): Self = this.set("bgWhiteBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgYellow(value: T): Self = this.set("bgYellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBgYellowBright(value: T): Self = this.set("bgYellowBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlack(value: T): Self = this.set("black", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlackBright(value: T): Self = this.set("blackBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlue(value: T): Self = this.set("blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlueBright(value: T): Self = this.set("blueBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBold(value: T): Self = this.set("bold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyan(value: T): Self = this.set("cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyanBright(value: T): Self = this.set("cyanBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDim(value: T): Self = this.set("dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGray(value: T): Self = this.set("gray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: T): Self = this.set("green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreenBright(value: T): Self = this.set("greenBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey(value: T): Self = this.set("grey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: T): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverse(value: T): Self = this.set("inverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItalic(value: T): Self = this.set("italic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagenta(value: T): Self = this.set("magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagentaBright(value: T): Self = this.set("magentaBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: T): Self = this.set("red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedBright(value: T): Self = this.set("redBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: T): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrikethrough(value: T): Self = this.set("strikethrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnderline(value: T): Self = this.set("underline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhite(value: T): Self = this.set("white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhiteBright(value: T): Self = this.set("whiteBright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellow(value: T): Self = this.set("yellow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellowBright(value: T): Self = this.set("yellowBright", value.asInstanceOf[js.Any])
  }
}
