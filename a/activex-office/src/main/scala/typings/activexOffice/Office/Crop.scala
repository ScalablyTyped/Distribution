package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Crop extends StObject {
  
  val Application: js.Any
  
  val Creator: Double
  
  @JSName("Office.Crop_typekey")
  var OfficeDotCrop_typekey: Crop
  
  var PictureHeight: Double
  
  var PictureOffsetX: Double
  
  var PictureOffsetY: Double
  
  var PictureWidth: Double
  
  var ShapeHeight: Double
  
  var ShapeLeft: Double
  
  var ShapeTop: Double
  
  var ShapeWidth: Double
}
object Crop {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotCrop_typekey: Crop,
    PictureHeight: Double,
    PictureOffsetX: Double,
    PictureOffsetY: Double,
    PictureWidth: Double,
    ShapeHeight: Double,
    ShapeLeft: Double,
    ShapeTop: Double,
    ShapeWidth: Double
  ): Crop = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PictureHeight = PictureHeight.asInstanceOf[js.Any], PictureOffsetX = PictureOffsetX.asInstanceOf[js.Any], PictureOffsetY = PictureOffsetY.asInstanceOf[js.Any], PictureWidth = PictureWidth.asInstanceOf[js.Any], ShapeHeight = ShapeHeight.asInstanceOf[js.Any], ShapeLeft = ShapeLeft.asInstanceOf[js.Any], ShapeTop = ShapeTop.asInstanceOf[js.Any], ShapeWidth = ShapeWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.Crop_typekey")(OfficeDotCrop_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crop]
  }
  
  @scala.inline
  implicit class CropMutableBuilder[Self <: Crop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCrop_typekey(value: Crop): Self = StObject.set(x, "Office.Crop_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureHeight(value: Double): Self = StObject.set(x, "PictureHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureOffsetX(value: Double): Self = StObject.set(x, "PictureOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureOffsetY(value: Double): Self = StObject.set(x, "PictureOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureWidth(value: Double): Self = StObject.set(x, "PictureWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeHeight(value: Double): Self = StObject.set(x, "ShapeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeLeft(value: Double): Self = StObject.set(x, "ShapeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeTop(value: Double): Self = StObject.set(x, "ShapeTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeWidth(value: Double): Self = StObject.set(x, "ShapeWidth", value.asInstanceOf[js.Any])
  }
}
