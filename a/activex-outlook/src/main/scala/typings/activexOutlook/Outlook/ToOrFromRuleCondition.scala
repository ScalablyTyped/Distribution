package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToOrFromRuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.ToOrFromRuleCondition_typekey")
  var OutlookDotToOrFromRuleCondition_typekey: ToOrFromRuleCondition
  val Parent: js.Any
  val Recipients: typings.activexOutlook.Outlook.Recipients
  val Session: NameSpace
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
}

