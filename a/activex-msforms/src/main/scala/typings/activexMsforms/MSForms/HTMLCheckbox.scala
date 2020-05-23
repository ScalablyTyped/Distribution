package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLCheckbox extends js.Object {
  var Checked: Boolean
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLCheckbox_typekey")
  var MSFormsDotHTMLCheckbox_typekey: HTMLCheckbox
  var Value: String
}

object HTMLCheckbox {
  @scala.inline
  def apply(
    Checked: Boolean,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLCheckbox_typekey: HTMLCheckbox,
    Value: String
  ): HTMLCheckbox = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLCheckbox_typekey")(MSFormsDotHTMLCheckbox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCheckbox]
  }
}

