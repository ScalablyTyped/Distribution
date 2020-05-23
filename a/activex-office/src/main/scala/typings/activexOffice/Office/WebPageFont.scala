package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebPageFont extends js.Object {
  val Application: js.Any
  val Creator: Double
  var FixedWidthFont: String
  var FixedWidthFontSize: Double
  @JSName("Office.WebPageFont_typekey")
  var OfficeDotWebPageFont_typekey: WebPageFont
  var ProportionalFont: String
  var ProportionalFontSize: Double
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
}

