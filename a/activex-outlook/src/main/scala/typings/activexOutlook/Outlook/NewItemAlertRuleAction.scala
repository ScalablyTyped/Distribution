package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewItemAlertRuleAction extends js.Object {
  val ActionType: OlRuleActionType
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Enabled: Boolean
  @JSName("Outlook.NewItemAlertRuleAction_typekey")
  var OutlookDotNewItemAlertRuleAction_typekey: NewItemAlertRuleAction
  val Parent: js.Any
  val Session: NameSpace
  var Text: String
}

object NewItemAlertRuleAction {
  @scala.inline
  def apply(
    ActionType: OlRuleActionType,
    Application: Application,
    Class: OlObjectClass,
    Enabled: Boolean,
    OutlookDotNewItemAlertRuleAction_typekey: NewItemAlertRuleAction,
    Parent: js.Any,
    Session: NameSpace,
    Text: String
  ): NewItemAlertRuleAction = {
    val __obj = js.Dynamic.literal(ActionType = ActionType.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.NewItemAlertRuleAction_typekey")(OutlookDotNewItemAlertRuleAction_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewItemAlertRuleAction]
  }
}

