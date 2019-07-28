package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusDetailFilters extends js.Object {
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.undefined
  var MemberAccountRuleStatus: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.MemberAccountRuleStatus] = js.undefined
}

object StatusDetailFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, MemberAccountRuleStatus: MemberAccountRuleStatus = null): StatusDetailFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId)
    if (MemberAccountRuleStatus != null) __obj.updateDynamic("MemberAccountRuleStatus")(MemberAccountRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusDetailFilters]
  }
}

