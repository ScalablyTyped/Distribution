package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToOrFromRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConditionType: OlRuleConditionType = js.native
  var Enabled: Boolean = js.native
  @JSName("Outlook.ToOrFromRuleCondition_typekey")
  var OutlookDotToOrFromRuleCondition_typekey: ToOrFromRuleCondition = js.native
  val Parent: js.Any = js.native
  val Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  val Session: NameSpace = js.native
}

object ToOrFromRuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotToOrFromRuleCondition_typekey: ToOrFromRuleCondition,
    Parent: js.Any,
    Recipients: Recipients,
    Session: NameSpace
  ): ToOrFromRuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.ToOrFromRuleCondition_typekey")(OutlookDotToOrFromRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToOrFromRuleCondition]
  }
  @scala.inline
  implicit class ToOrFromRuleConditionOps[Self <: ToOrFromRuleCondition] (val x: Self) extends AnyVal {
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
    def setOutlookDotToOrFromRuleCondition_typekey(value: ToOrFromRuleCondition): Self = this.set("Outlook.ToOrFromRuleCondition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecipients(value: Recipients): Self = this.set("Recipients", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

