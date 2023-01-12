package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusDetailFilters extends StObject {
  
  /**
    * The 12-digit account ID of the member account within an organization.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.AccountId] = js.undefined
  
  /**
    * Indicates deployment status for Config rule in the member account. When management account calls PutOrganizationConfigRule action for the first time, Config rule status is created in the member account. When management account calls PutOrganizationConfigRule action for the second time, Config rule status is updated in the member account. Config rule status is deleted when the management account deletes OrganizationConfigRule and disables service access for config-multiaccountsetup.amazonaws.com.  Config sets the state of the rule to:    CREATE_SUCCESSFUL when Config rule has been created in the member account.    CREATE_IN_PROGRESS when Config rule is being created in the member account.    CREATE_FAILED when Config rule creation has failed in the member account.    DELETE_FAILED when Config rule deletion has failed in the member account.    DELETE_IN_PROGRESS when Config rule is being deleted in the member account.    DELETE_SUCCESSFUL when Config rule has been deleted in the member account.    UPDATE_SUCCESSFUL when Config rule has been updated in the member account.    UPDATE_IN_PROGRESS when Config rule is being updated in the member account.    UPDATE_FAILED when Config rule deletion has failed in the member account.  
    */
  var MemberAccountRuleStatus: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.MemberAccountRuleStatus] = js.undefined
}
object StatusDetailFilters {
  
  inline def apply(): StatusDetailFilters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusDetailFilters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusDetailFilters] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setMemberAccountRuleStatus(value: MemberAccountRuleStatus): Self = StObject.set(x, "MemberAccountRuleStatus", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountRuleStatusUndefined: Self = StObject.set(x, "MemberAccountRuleStatus", js.undefined)
  }
}
