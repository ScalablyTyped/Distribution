package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorFormat extends js.Object {
  val Application: js.Any
  var Brightness: Double
  val Creator: Double
  @JSName("Excel.ColorFormat_typekey")
  var ExcelDotColorFormat_typekey: ColorFormat
  var ObjectThemeColor: MsoThemeColorIndex
  val Parent: js.Any
  var RGB: MsoRGBType
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
    ExcelDotColorFormat_typekey: ColorFormat,
    ObjectThemeColor: MsoThemeColorIndex,
    Parent: js.Any,
    RGB: MsoRGBType,
    SchemeColor: Double,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.ColorFormat_typekey")(ExcelDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
}

