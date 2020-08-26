package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeFont extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var Name: String = js.native
  @JSName("Office.ThemeFont_typekey")
  var OfficeDotThemeFont_typekey: ThemeFont = js.native
  val Parent: js.Any = js.native
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
  @scala.inline
  implicit class ThemeFontOps[Self <: ThemeFont] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotThemeFont_typekey(value: ThemeFont): Self = this.set("Office.ThemeFont_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

