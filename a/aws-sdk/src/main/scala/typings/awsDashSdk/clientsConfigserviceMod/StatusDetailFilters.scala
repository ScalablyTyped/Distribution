package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusDetailFilters extends js.Object {
  /**
    * The 12-digit account ID of the member account within an organization.
    */
  var AccountId: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.AccountId] = js.native
  /**
    * Indicates deployment status for config rule in the member account. When master account calls PutOrganizationConfigRule action for the first time, config rule status is created in the member account. When master account calls PutOrganizationConfigRule action for the second time, config rule status is updated in the member account. Config rule status is deleted when the master account deletes OrganizationConfigRule and disables service access for config-multiaccountsetup.amazonaws.com.  AWS Config sets the state of the rule to:    CREATE_SUCCESSFUL when config rule has been created in the member account.    CREATE_IN_PROGRESS when config rule is being created in the member account.    CREATE_FAILED when config rule creation has failed in the member account.    DELETE_FAILED when config rule deletion has failed in the member account.    DELETE_IN_PROGRESS when config rule is being deleted in the member account.    DELETE_SUCCESSFUL when config rule has been deleted in the member account.    UPDATE_SUCCESSFUL when config rule has been updated in the member account.    UPDATE_IN_PROGRESS when config rule is being updated in the member account.    UPDATE_FAILED when config rule deletion has failed in the member account.  
    */
  var MemberAccountRuleStatus: js.UndefOr[typings.awsDashSdk.clientsConfigserviceMod.MemberAccountRuleStatus] = js.native
}

object StatusDetailFilters {
  @scala.inline
  def apply(AccountId: AccountId = null, MemberAccountRuleStatus: MemberAccountRuleStatus = null): StatusDetailFilters = {
    val __obj = js.Dynamic.literal()
    if (AccountId != null) __obj.updateDynamic("AccountId")(AccountId.asInstanceOf[js.Any])
    if (MemberAccountRuleStatus != null) __obj.updateDynamic("MemberAccountRuleStatus")(MemberAccountRuleStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusDetailFilters]
  }
}

