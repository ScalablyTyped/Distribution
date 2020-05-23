package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorFormat extends js.Object {
  val Application: js.Any
  var Brightness: Double
  val Creator: Double
  var ObjectThemeColor: MsoThemeColorIndex
  @JSName("Office.ColorFormat_typekey")
  var OfficeDotColorFormat_typekey: ColorFormat
  val Parent: js.Any
  var RGB: Double
  var SchemeColor: Double
  var TintAndShade: Double
  val Type: MsoColorType
}

object ColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Brightness: Double,
    Creator: Double,
    ObjectThemeColor: MsoThemeColorIndex,
    OfficeDotColorFormat_typekey: ColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ColorFormat_typekey")(OfficeDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
}

