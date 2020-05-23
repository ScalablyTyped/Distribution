package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeColor extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.ThemeColor_typekey")
  var OfficeDotThemeColor_typekey: ThemeColor
  val Parent: js.Any
  var RGB: Double
  val ThemeColorSchemeIndex: MsoThemeColorSchemeIndex
}

object ThemeColor {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotThemeColor_typekey: ThemeColor,
    Parent: js.Any,
    RGB: Double,
    ThemeColorSchemeIndex: MsoThemeColorSchemeIndex
  ): ThemeColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], ThemeColorSchemeIndex = ThemeColorSchemeIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeColor_typekey")(OfficeDotThemeColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeColor]
  }
}

