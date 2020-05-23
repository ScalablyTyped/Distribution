package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HTMLSelect extends js.Object {
  var DisplayValues: js.Any
  var HTMLName: String
  @JSName("MSForms.HTMLSelect_typekey")
  var MSFormsDotHTMLSelect_typekey: HTMLSelect
  var MultiSelect: Boolean
  var Selected: String
  var Size: Double
  var Values: js.Any
}

object HTMLSelect {
  @scala.inline
  def apply(
    DisplayValues: js.Any,
    HTMLName: String,
    MSFormsDotHTMLSelect_typekey: HTMLSelect,
    MultiSelect: Boolean,
    Selected: String,
    Size: Double,
    Values: js.Any
  ): HTMLSelect = {
    val __obj = js.Dynamic.literal(DisplayValues = DisplayValues.asInstanceOf[js.Any], HTMLName = HTMLName.asInstanceOf[js.Any], MultiSelect = MultiSelect.asInstanceOf[js.Any], Selected = Selected.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.HTMLSelect_typekey")(MSFormsDotHTMLSelect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLSelect]
  }
}

