package typings.activexLibreoffice.com_.sun.star.rendering

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Panose extends StObject {
  
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
  implicit class PanoseMutableBuilder[Self <: Panose] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArmStyle(value: Double): Self = StObject.set(x, "ArmStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContrast(value: Double): Self = StObject.set(x, "Contrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFamilyType(value: Double): Self = StObject.set(x, "FamilyType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLetterform(value: Double): Self = StObject.set(x, "Letterform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMidline(value: Double): Self = StObject.set(x, "Midline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProportion(value: Double): Self = StObject.set(x, "Proportion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerifStyle(value: Double): Self = StObject.set(x, "SerifStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeVariation(value: Double): Self = StObject.set(x, "StrokeVariation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXHeight(value: Double): Self = StObject.set(x, "XHeight", value.asInstanceOf[js.Any])
  }
}
