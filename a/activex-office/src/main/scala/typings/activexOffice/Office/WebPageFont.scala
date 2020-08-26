package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebPageFont extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  var FixedWidthFont: String = js.native
  var FixedWidthFontSize: Double = js.native
  @JSName("Office.WebPageFont_typekey")
  var OfficeDotWebPageFont_typekey: WebPageFont = js.native
  var ProportionalFont: String = js.native
  var ProportionalFontSize: Double = js.native
}

object WebPageFont {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    FixedWidthFont: String,
    FixedWidthFontSize: Double,
    OfficeDotWebPageFont_typekey: WebPageFont,
    ProportionalFont: String,
    ProportionalFontSize: Double
  ): WebPageFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FixedWidthFont = FixedWidthFont.asInstanceOf[js.Any], FixedWidthFontSize = FixedWidthFontSize.asInstanceOf[js.Any], ProportionalFont = ProportionalFont.asInstanceOf[js.Any], ProportionalFontSize = ProportionalFontSize.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.WebPageFont_typekey")(OfficeDotWebPageFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebPageFont]
  }
  @scala.inline
  implicit class WebPageFontOps[Self <: WebPageFont] (val x: Self) extends AnyVal {
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
    def setFixedWidthFont(value: String): Self = this.set("FixedWidthFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixedWidthFontSize(value: Double): Self = this.set("FixedWidthFontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotWebPageFont_typekey(value: WebPageFont): Self = this.set("Office.WebPageFont_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setProportionalFont(value: String): Self = this.set("ProportionalFont", value.asInstanceOf[js.Any])
    @scala.inline
    def setProportionalFontSize(value: Double): Self = this.set("ProportionalFontSize", value.asInstanceOf[js.Any])
  }
  
}

