package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssignToCategoryRuleAction extends js.Object {
  val ActionType: OlRuleActionType
  val Application: typings.activexOutlook.Outlook.Application
  var Categories: js.Any
  val Class: OlObjectClass
  var Enabled: Boolean
  @JSName("Outlook.AssignToCategoryRuleAction_typekey")
  var OutlookDotAssignToCategoryRuleAction_typekey: AssignToCategoryRuleAction
  val Parent: js.Any
  val Session: NameSpace
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
}

