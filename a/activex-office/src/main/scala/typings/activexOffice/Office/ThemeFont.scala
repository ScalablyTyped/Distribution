package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThemeFont extends js.Object {
  val Application: js.Any
  val Creator: Double
  var Name: String
  @JSName("Office.ThemeFont_typekey")
  var OfficeDotThemeFont_typekey: ThemeFont
  val Parent: js.Any
}

object ThemeFont {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Name: String,
    OfficeDotThemeFont_typekey: ThemeFont,
    Parent: js.Any
  ): ThemeFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ThemeFont_typekey")(OfficeDotThemeFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeFont]
  }
}

