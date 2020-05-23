package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tab extends js.Object {
  var Accelerator: String
  var Caption: String
  var ControlTipText: String
  var Enabled: Boolean
  var Index: Double
  @JSName("MSForms.Tab_typekey")
  var MSFormsDotTab_typekey: Tab
  var Name: String
  var Tag: String
  var Visible: Boolean
}

object Tab {
  @scala.inline
  def apply(
    Accelerator: String,
    Caption: String,
    ControlTipText: String,
    Enabled: Boolean,
    Index: Double,
    MSFormsDotTab_typekey: Tab,
    Name: String,
    Tag: String,
    Visible: Boolean
  ): Tab = {
    val __obj = js.Dynamic.literal(Accelerator = Accelerator.asInstanceOf[js.Any], Caption = Caption.asInstanceOf[js.Any], ControlTipText = ControlTipText.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.Tab_typekey")(MSFormsDotTab_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tab]
  }
}

