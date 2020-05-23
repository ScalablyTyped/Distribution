package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLOption extends js.Object {
  var Checked: Boolean
  val DisplayStyle: fmDisplayStyle
  var HTMLName: String
  var HTMLType: String
  @JSName("MSForms.HTMLOption_typekey")
  var MSFormsDotHTMLOption_typekey: HTMLOption
  var Value: String
}

object HTMLOption {
  @scala.inline
  def apply(
    Checked: Boolean,
    DisplayStyle: fmDisplayStyle,
    HTMLName: String,
    HTMLType: String,
    MSFormsDotHTMLOption_typekey: HTMLOption,
    Value: String
  ): HTMLOption = {
    val __obj = js.Dynamic.literal(Checked = Checked.asInstanceOf[js.Any], DisplayStyle = DisplayStyle.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], HTMLType = HTMLType.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLOption_typekey")(MSFormsDotHTMLOption_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLOption]
  }
}

