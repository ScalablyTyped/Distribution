package typings.activexMsforms.MSForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tab extends js.Object {
  var Accelerator: String = js.native
  var Caption: String = js.native
  var ControlTipText: String = js.native
  var Enabled: Boolean = js.native
  var Index: Double = js.native
  @JSName("MSForms.Tab_typekey")
  var MSFormsDotTab_typekey: Tab = js.native
  var Name: String = js.native
  var Tag: String = js.native
  var Visible: Boolean = js.native
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
  @scala.inline
  implicit class TabOps[Self <: Tab] (val x: Self) extends AnyVal {
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
    def setAccelerator(value: String): Self = this.set("Accelerator", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaption(value: String): Self = this.set("Caption", value.asInstanceOf[js.Any])
    @scala.inline
    def setControlTipText(value: String): Self = this.set("ControlTipText", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("Index", value.asInstanceOf[js.Any])
    @scala.inline
    def setMSFormsDotTab_typekey(value: Tab): Self = this.set("MSForms.Tab_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: String): Self = this.set("Tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

