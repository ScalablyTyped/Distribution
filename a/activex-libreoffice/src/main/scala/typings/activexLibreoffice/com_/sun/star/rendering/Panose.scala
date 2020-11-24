package typings.activexLibreoffice.com_.sun.star.rendering

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panose extends js.Object {
  
  var ArmStyle: Double = js.native
  
  var Contrast: Double = js.native
  
  var FamilyType: Double = js.native
  
  var Letterform: Double = js.native
  
  var Midline: Double = js.native
  
  var Proportion: Double = js.native
  
  var SerifStyle: Double = js.native
  
  var StrokeVariation: Double = js.native
  
  var Weight: Double = js.native
  
  var XHeight: Double = js.native
}
object Panose {
  
  @scala.inline
  def apply(
    ArmStyle: Double,
    Contrast: Double,
    FamilyType: Double,
    Letterform: Double,
    Midline: Double,
    Proportion: Double,
    SerifStyle: Double,
    StrokeVariation: Double,
    Weight: Double,
    XHeight: Double
  ): Panose = {
    val __obj = js.Dynamic.literal(ArmStyle = ArmStyle.asInstanceOf[js.Any], Contrast = Contrast.asInstanceOf[js.Any], FamilyType = FamilyType.asInstanceOf[js.Any], Letterform = Letterform.asInstanceOf[js.Any], Midline = Midline.asInstanceOf[js.Any], Proportion = Proportion.asInstanceOf[js.Any], SerifStyle = SerifStyle.asInstanceOf[js.Any], StrokeVariation = StrokeVariation.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any], XHeight = XHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Panose]
  }
  
  @scala.inline
  implicit class PanoseOps[Self <: Panose] (val x: Self) extends AnyVal {
    
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
    def setArmStyle(value: Double): Self = this.set("ArmStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = this.set("Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyType(value: Double): Self = this.set("FamilyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterform(value: Double): Self = this.set("Letterform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidline(value: Double): Self = this.set("Midline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProportion(value: Double): Self = this.set("Proportion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerifStyle(value: Double): Self = this.set("SerifStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeVariation(value: Double): Self = this.set("StrokeVariation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = this.set("Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeight(value: Double): Self = this.set("XHeight", value.asInstanceOf[js.Any])
  }
}
