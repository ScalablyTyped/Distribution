package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLText extends js.Object {
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLText_typekey")
  var MSFormsDotHTMLText_typekey: HTMLText
  var MaxLength: Double
  var Value: String
  var Width: Double
}

object HTMLText {
  @scala.inline
  def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLText_typekey: HTMLText,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLText = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLText_typekey")(MSFormsDotHTMLText_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLText]
  }
}

