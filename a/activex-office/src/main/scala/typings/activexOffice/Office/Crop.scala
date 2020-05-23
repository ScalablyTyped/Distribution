package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crop extends js.Object {
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
}

