package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignToCategoryRuleAction extends js.Object {
  val ActionType: OlRuleActionType = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  var Categories: js.Any = js.native
  val Class: OlObjectClass = js.native
  var Enabled: Boolean = js.native
  @JSName("Outlook.AssignToCategoryRuleAction_typekey")
  var OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
}

object AssignToCategoryRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Categories: js.Any,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction,
    Parent: js.Any,
    Session: NameSpace
  ): AssignToCategoryRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Categories = Categories.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AssignToCategoryRuleAction_typekey")(OutlookDotAssignToCategoryRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignToCategoryRuleAction]
  }
  @scala.inline
  implicit class AssignToCategoryRuleActionOps[Self <: AssignToCategoryRuleAction] (val x: Self) extends AnyVal {
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
    def setCategories(value: js.Any): Self = this.set("Categories", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAssignToCategoryRuleAction_typekey(value: AssignToCategoryRuleAction): Self = this.set("Outlook.AssignToCategoryRuleAction_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

