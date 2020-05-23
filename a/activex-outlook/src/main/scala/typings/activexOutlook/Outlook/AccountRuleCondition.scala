package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRuleCondition extends js.Object {
  var Account: typings.activexOutlook.Outlook.Account
  val Application: typings.activexOutlook.Outlook.Application
  val Class: OlObjectClass
  val ConditionType: OlRuleConditionType
  var Enabled: Boolean
  @JSName("Outlook.AccountRuleCondition_typekey")
  var OutlookDotAccountRuleCondition_typekey: AccountRuleCondition
  val Parent: js.Any
  val Session: NameSpace
}

object AccountRuleCondition {
  @scala.inline
  def apply(
    Account: Account,
    Application: Application,
    Class: OlObjectClass,
    ConditionType: OlRuleConditionType,
    Enabled: Boolean,
    OutlookDotAccountRuleCondition_typekey: AccountRuleCondition,
    Parent: js.Any,
    Session: NameSpace
  ): AccountRuleCondition = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], ConditionType = ConditionType.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.AccountRuleCondition_typekey")(OutlookDotAccountRuleCondition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRuleCondition]
  }
}

