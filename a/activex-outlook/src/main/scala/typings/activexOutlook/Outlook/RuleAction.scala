package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleAction extends js.Object {
  val ActionType: OlRuleActionType
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Enabled: Boolean
  @JSName("Outlook.RuleAction_typekey")
  var OutlookDotRuleAction_typekey: RuleAction
  val Parent: js.Any
  val Session: NameSpace
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
}

