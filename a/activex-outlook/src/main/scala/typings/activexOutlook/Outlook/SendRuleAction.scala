package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendRuleAction extends js.Object {
  val ActionType: OlRuleActionType
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Enabled: Boolean
  @JSName("Outlook.SendRuleAction_typekey")
  var OutlookDotSendRuleAction_typekey: SendRuleAction
  val Parent: js.Any
  val Recipients: typings.activexOutlook.Outlook.Recipients
  val Session: NameSpace
}

object SendRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotSendRuleAction_typekey: SendRuleAction,
    Parent: js.Any,
    Recipients: Recipients,
    Session: NameSpace
  ): SendRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.SendRuleAction_typekey")(OutlookDotSendRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendRuleAction]
  }
}

