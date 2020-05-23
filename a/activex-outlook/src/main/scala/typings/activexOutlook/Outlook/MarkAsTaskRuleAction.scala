package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkAsTaskRuleAction extends js.Object {
  val ActionType: OlRuleActionType
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  var Enabled: Boolean
  var FlagTo: String
  var MarkInterval: OlMarkInterval
  @JSName("Outlook.MarkAsTaskRuleAction_typekey")
  var OutlookDotMarkAsTaskRuleAction_typekey: MarkAsTaskRuleAction
  val Parent: js.Any
  val Session: NameSpace
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
}

