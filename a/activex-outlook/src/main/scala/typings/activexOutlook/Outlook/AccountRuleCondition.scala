package typings.activexOutlook.Outlook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountRuleCondition extends js.Object {
  var Account: typings.activexOutlook.Outlook.Account = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Class: OlObjectClass = js.native
  val ConditionType: OlRuleConditionType = js.native
  var Enabled: Boolean = js.native
  @JSName("Outlook.AccountRuleCondition_typekey")
  var OutlookDotAccountRuleCondition_typekey: AccountRuleCondition = js.native
  val Parent: js.Any = js.native
  val Session: NameSpace = js.native
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
  @scala.inline
  implicit class AccountRuleConditionOps[Self <: AccountRuleCondition] (val x: Self) extends AnyVal {
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
    def setAccount(value: Account): Self = this.set("Account", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setClass(value: OlObjectClass): Self = this.set("Class", value.asInstanceOf[js.Any])
    @scala.inline
    def setConditionType(value: OlRuleConditionType): Self = this.set("ConditionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutlookDotAccountRuleCondition_typekey(value: AccountRuleCondition): Self = this.set("Outlook.AccountRuleCondition_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession(value: NameSpace): Self = this.set("Session", value.asInstanceOf[js.Any])
  }
  
}

