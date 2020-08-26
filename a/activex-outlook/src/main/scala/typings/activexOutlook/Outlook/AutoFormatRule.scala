package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoFormatRule extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  var Filter: String = js.native
  var Font: ViewFont = js.native
  var Name: String = js.native
  @JSName("Outlook.AutoFormatRule_typekey")
  var OutlookDotAutoFormatRule_typekey: AutoFormatRule = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
  val Standard: Boolean = js.native
}

object AutoFormatRule {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    Filter: String,
    Font: ViewFont,
    Name: String,
    OutlookDotAutoFormatRule_typekey: AutoFormatRule,
    Parent: js.Any,
    Session: NameSpace,
    Standard: Boolean
  ): AutoFormatRule = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Standard = Standard.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AutoFormatRule_typekey")(OutlookDotAutoFormatRule_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFormatRule]
  }
  @scala.inline
  implicit class AutoFormatRuleOps[Self <: AutoFormatRule] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: String): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFont(value: ViewFont): Self = this.set("Font", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAutoFormatRule_typekey(value: AutoFormatRule): Self = this.set("Outlook.AutoFormatRule_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
    @scala.inline
    def setStandard(value: Boolean): Self = this.set("Standard", value.asInstanceOf[js.Any])
  }
  
}

