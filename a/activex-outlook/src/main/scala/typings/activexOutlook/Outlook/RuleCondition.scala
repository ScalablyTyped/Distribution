package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleCondition extends js.Object {
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.RuleCondition_typekey")
  var OutlookDotRuleCondition_typekey: RuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object RuleCondition {
  @scala.inline
  def apply(
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotRuleCondition_typekey: RuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): RuleCondition = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.RuleCondition_typekey")(OutlookDotRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleCondition]
  }
}

