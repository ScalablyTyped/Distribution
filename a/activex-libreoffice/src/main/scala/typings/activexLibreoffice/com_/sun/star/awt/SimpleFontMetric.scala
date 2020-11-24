package typings.activexLibreoffice.com_.sun.star.awt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes the general metrics of a certain font. */
@js.native
trait SimpleFontMetric extends js.Object {
  
  /**
    * specifies the portion of a lower case character that rises above the height of the character "x" of the font.
    *
    * For example, the letters "b", "d", "h", "k" and "l" have an ascent unequal to 0.
    *
    * The ascent is measured in pixels, thus the font metric is device dependent.
    */
  var Ascent: Double = js.native
  
  /**
    * specifies the portion of a letter falling below the baseline.
    *
    * For example, the letters "g", "p", and "y" have a descent unequal to 0.
    *
    * The descent is measured in pixels, thus the font metric is device dependent.
    */
  var Descent: Double = js.native
  
  /** specifies the code of the first printable character in the font. */
  var FirstChar: String = js.native
  
  /** specifies the code of the last printable character in the font. */
  var LastChar: String = js.native
  
  /**
    * specifies the vertical space between lines of this font; it is also called internal line spacing.
    *
    * The leading is measured in pixels, thus the font metric is device dependent.
    */
  var Leading: Double = js.native
  
  /**
    * specifies the slant of the characters (italic).
    *
    * The slant is measured in degrees from 0 to 359.
    */
  var Slant: Double = js.native
}
object SimpleFontMetric {
  
  @scala.inline
  def apply(
    Ascent: Double,
    Descent: Double,
    FirstChar: String,
    LastChar: String,
    Leading: Double,
    Slant: Double
  ): SimpleFontMetric = {
    val __obj = js.Dynamic.literal(Ascent = Ascent.asInstanceOf[js.Any], Descent = Descent.asInstanceOf[js.Any], FirstChar = FirstChar.asInstanceOf[js.Any], LastChar = LastChar.asInstanceOf[js.Any], Leading = Leading.asInstanceOf[js.Any], Slant = Slant.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleFontMetric]
  }
  
  @scala.inline
  implicit class SimpleFontMetricOps[Self <: SimpleFontMetric] (val x: Self) extends AnyVal {
    
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
    def setAscent(value: Double): Self = this.set("Ascent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescent(value: Double): Self = this.set("Descent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstChar(value: String): Self = this.set("FirstChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastChar(value: String): Self = this.set("LastChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeading(value: Double): Self = this.set("Leading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlant(value: Double): Self = this.set("Slant", value.asInstanceOf[js.Any])
  }
}
