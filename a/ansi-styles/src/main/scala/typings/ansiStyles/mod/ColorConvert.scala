package typings.ansiStyles.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorConvert extends js.Object {
  
  /**
  		Use a [4-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#3/4-bit) to set text color.
  		*/
  def ansi(ansi: Double): String = js.native
  
  /**
  		Use an [8-bit unsigned number](https://en.wikipedia.org/wiki/ANSI_escape_code#8-bit) to set text color.
  		*/
  def ansi256(ansi: Double): String = js.native
  
  /**
  		The RGB HEX color space.
  		@param hex - A hexadecimal string containing RGB data.
  		*/
  def hex(hex: String): String = js.native
  
  /**
  		The HSL color space.
  		@param hue - (`0`-`360`)
  		@param saturation - (`0`-`100`)
  		@param lightness - (`0`-`100`)
  		*/
  def hsl(hue: Double, saturation: Double, lightness: Double): String = js.native
  
  /**
  		The HSV color space.
  		@param hue - (`0`-`360`)
  		@param saturation - (`0`-`100`)
  		@param value - (`0`-`100`)
  		*/
  def hsv(hue: Double, saturation: Double, value: Double): String = js.native
  
  /**
  		The HSV color space.
  		@param hue - (`0`-`360`)
  		@param whiteness - (`0`-`100`)
  		@param blackness - (`0`-`100`)
  		*/
  def hwb(hue: Double, whiteness: Double, blackness: Double): String = js.native
  
  /**
  		@param keyword - A CSS color name.
  		*/
  def keyword(keyword: CSSColor): String = js.native
  
  /**
  		The RGB color space.
  		@param red - (`0`-`255`)
  		@param green - (`0`-`255`)
  		@param blue - (`0`-`255`)
  		*/
  def rgb(red: Double, green: Double, blue: Double): String = js.native
}
object ColorConvert {
  
  @scala.inline
  def apply(
    ansi: Double => String,
    ansi256: Double => String,
    hex: String => String,
    hsl: (Double, Double, Double) => String,
    hsv: (Double, Double, Double) => String,
    hwb: (Double, Double, Double) => String,
    keyword: CSSColor => String,
    rgb: (Double, Double, Double) => String
  ): ColorConvert = {
    val __obj = js.Dynamic.literal(ansi = js.Any.fromFunction1(ansi), ansi256 = js.Any.fromFunction1(ansi256), hex = js.Any.fromFunction1(hex), hsl = js.Any.fromFunction3(hsl), hsv = js.Any.fromFunction3(hsv), hwb = js.Any.fromFunction3(hwb), keyword = js.Any.fromFunction1(keyword), rgb = js.Any.fromFunction3(rgb))
    __obj.asInstanceOf[ColorConvert]
  }
  
  @scala.inline
  implicit class ColorConvertOps[Self <: ColorConvert] (val x: Self) extends AnyVal {
    
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
    def setAnsi(value: Double => String): Self = this.set("ansi", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAnsi256(value: Double => String): Self = this.set("ansi256", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHex(value: String => String): Self = this.set("hex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHsl(value: (Double, Double, Double) => String): Self = this.set("hsl", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHsv(value: (Double, Double, Double) => String): Self = this.set("hsv", js.Any.fromFunction3(value))
    
    @scala.inline
    def setHwb(value: (Double, Double, Double) => String): Self = this.set("hwb", js.Any.fromFunction3(value))
    
    @scala.inline
    def setKeyword(value: CSSColor => String): Self = this.set("keyword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRgb(value: (Double, Double, Double) => String): Self = this.set("rgb", js.Any.fromFunction3(value))
  }
}
