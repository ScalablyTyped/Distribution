package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLPassword extends js.Object {
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLPassword_typekey")
  var MSFormsDotHTMLPassword_typekey: HTMLPassword
  var MaxLength: Double
  var Value: String
  var Width: Double
}

object HTMLPassword {
  @scala.inline
  def apply(
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLPassword_typekey: HTMLPassword,
    MaxLength: Double,
    Value: String,
    Width: Double
  ): HTMLPassword = {
    val __obj = js.Dynamic.literal(HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], MaxLength = MaxLength.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLPassword_typekey")(MSFormsDotHTMLPassword_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLPassword]
  }
}

