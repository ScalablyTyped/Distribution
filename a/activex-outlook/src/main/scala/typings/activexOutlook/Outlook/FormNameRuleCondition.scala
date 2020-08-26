package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormNameRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConditionType: OlRuleConditionType = js.native
  var Enabled: Boolean = js.native
  var FormName: js.Any = js.native
  @JSName("Outlook.FormNameRuleCondition_typekey")
  var OutlookDotFormNameRuleCondition_typekey: FormNameRuleCondition = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object FormNameRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    FormName: js.Any,
    OutlookDotFormNameRuleCondition_typekey: FormNameRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): FormNameRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FormName = FormName.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.FormNameRuleCondition_typekey")(OutlookDotFormNameRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormNameRuleCondition]
  }
  @scala.inline
  implicit class FormNameRuleConditionOps[Self <: FormNameRuleCondition] (val x: Self) extends AnyVal {
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
    def setConditionType(value: OlRuleConditionType): Self = this.set("ConditionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormName(value: js.Any): Self = this.set("FormName", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotFormNameRuleCondition_typekey(value: FormNameRuleCondition): Self = this.set("Outlook.FormNameRuleCondition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

