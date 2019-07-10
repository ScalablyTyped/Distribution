package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemberAccountStatus extends js.Object {
  var AccountId: awsDashSdkLib.clientsConfigserviceMod.AccountId
  var ConfigRuleName: StringWithCharLimit64
  var ErrorCode: js.UndefOr[String] = js.undefined
  var ErrorMessage: js.UndefOr[String] = js.undefined
  var LastUpdateTime: js.UndefOr[_Date] = js.undefined
  var MemberAccountRuleStatus: awsDashSdkLib.clientsConfigserviceMod.MemberAccountRuleStatus
}

object MemberAccountStatus {
  @scala.inline
  def apply(
    AccountId: AccountId,
    ConfigRuleName: StringWithCharLimit64,
    MemberAccountRuleStatus: MemberAccountRuleStatus,
    ErrorCode: String = null,
    ErrorMessage: String = null,
    LastUpdateTime: _Date = null
  ): MemberAccountStatus = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, ConfigRuleName = ConfigRuleName, MemberAccountRuleStatus = MemberAccountRuleStatus.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (LastUpdateTime != null) __obj.updateDynamic("LastUpdateTime")(LastUpdateTime)
    __obj.asInstanceOf[MemberAccountStatus]
  }
}

