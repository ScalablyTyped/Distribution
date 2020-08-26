package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkAsTaskRuleAction extends js.Object {
  val ActionType: OlRuleActionType = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  var FlagTo: String = js.native
  var MarkInterval: OlMarkInterval = js.native
  @JSName("Outlook.MarkAsTaskRuleAction_typekey")
  var OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object MarkAsTaskRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    FlagTo: String,
    MarkInterval: OlMarkInterval,
    OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): MarkAsTaskRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], FlagTo = FlagTo.asInstanceOf[js.Any], MarkInterval = MarkInterval.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.MarkAsTaskRuleAction_typekey")(OutlookDotMarkAsTaskRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkAsTaskRuleAction]
  }
  @scala.inline
  implicit class MarkAsTaskRuleActionOps[Self <: MarkAsTaskRuleAction] (val x: Self) extends AnyVal {
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
    def setFlagTo(value: String): Self = this.set("FlagTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setMarkInterval(value: OlMarkInterval): Self = this.set("MarkInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotMarkAsTaskRuleAction_typekey(value: MarkAsTaskRuleAction): Self = this.set("Outlook.MarkAsTaskRuleAction_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

