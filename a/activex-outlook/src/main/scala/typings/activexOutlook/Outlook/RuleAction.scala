package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleAction extends js.Object {
  val ActionType: OlRuleActionType = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  @JSName("Outlook.RuleAction_typekey")
  var OutlookDotRuleAction_typekey: RuleAction = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object RuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotRuleAction_typekey: RuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): RuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleAction_typekey")(OutlookDotRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleAction]
  }
  @scala.inline
  implicit class RuleActionOps[Self <: RuleAction] (val x: Self) extends AnyVal {
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
    def setActionType(value: OlRuleActionType): Self = this.set("ActionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotRuleAction_typekey(value: RuleAction): Self = this.set("Outlook.RuleAction_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

