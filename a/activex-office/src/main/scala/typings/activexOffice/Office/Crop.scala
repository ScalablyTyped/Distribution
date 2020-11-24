package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Crop extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  @JSName("Office.Crop_typekey")
  var OfficeDotCrop_typekey: Crop = js.native
  
  var PictureHeight: Double = js.native
  
  var PictureOffsetX: Double = js.native
  
  var PictureOffsetY: Double = js.native
  
  var PictureWidth: Double = js.native
  
  var ShapeHeight: Double = js.native
  
  var ShapeLeft: Double = js.native
  
  var ShapeTop: Double = js.native
  
  var ShapeWidth: Double = js.native
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
  implicit class CropOps[Self <: Crop] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCrop_typekey(value: Crop): Self = this.set("Office.Crop_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureHeight(value: Double): Self = this.set("PictureHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureOffsetX(value: Double): Self = this.set("PictureOffsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureOffsetY(value: Double): Self = this.set("PictureOffsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureWidth(value: Double): Self = this.set("PictureWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeHeight(value: Double): Self = this.set("ShapeHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeLeft(value: Double): Self = this.set("ShapeLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeTop(value: Double): Self = this.set("ShapeTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeWidth(value: Double): Self = this.set("ShapeWidth", value.asInstanceOf[js.Any])
  }
}
