package typings.activexPowerpoint.PowerPoint

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
  var ObjectThemeColor: MsoThemeColorIndex
  val Parent: js.Any
  @JSName("PowerPoint.ColorFormat_typekey")
  var PowerPointDotColorFormat_typekey: ColorFormat
  var RGB: MsoRGBType
  var SchemeColor: PpColorSchemeIndex
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
    Parent: js.Any,
    PowerPointDotColorFormat_typekey: ColorFormat,
    RGB: MsoRGBType,
    SchemeColor: PpColorSchemeIndex,
    TintAndShade: Double,
    Type: MsoColorType
  ): ColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Brightness = Brightness.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], ObjectThemeColor = ObjectThemeColor.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], TintAndShade = TintAndShade.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ColorFormat_typekey")(PowerPointDotColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorFormat]
  }
}

