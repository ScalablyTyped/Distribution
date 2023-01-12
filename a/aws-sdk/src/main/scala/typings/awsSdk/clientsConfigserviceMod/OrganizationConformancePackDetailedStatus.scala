package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConformancePackDetailedStatus extends StObject {
  
  /**
    * The 12-digit account ID of a member account.
    */
  var AccountId: typings.awsSdk.clientsConfigserviceMod.AccountId
  
  /**
    * The name of conformance pack deployed in the member account.
    */
  var ConformancePackName: StringWithCharLimit256
  
  /**
    * An error code that is returned when conformance pack creation or deletion failed in the member account. 
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * An error message indicating that conformance pack account creation or deletion has failed due to an error in the member account. 
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last status update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Indicates deployment status for conformance pack in a member account. When management account calls PutOrganizationConformancePack action for the first time, conformance pack status is created in the member account. When management account calls PutOrganizationConformancePack action for the second time, conformance pack status is updated in the member account. Conformance pack status is deleted when the management account deletes OrganizationConformancePack and disables service access for config-multiaccountsetup.amazonaws.com.   Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when conformance pack has been created in the member account.     CREATE_IN_PROGRESS when conformance pack is being created in the member account.    CREATE_FAILED when conformance pack creation has failed in the member account.    DELETE_FAILED when conformance pack deletion has failed in the member account.    DELETE_IN_PROGRESS when conformance pack is being deleted in the member account.    DELETE_SUCCESSFUL when conformance pack has been deleted in the member account.     UPDATE_SUCCESSFUL when conformance pack has been updated in the member account.    UPDATE_IN_PROGRESS when conformance pack is being updated in the member account.    UPDATE_FAILED when conformance pack deletion has failed in the member account.  
    */
  var Status: OrganizationResourceDetailedStatus
}
object OrganizationConformancePackDetailedStatus {
  
  inline def apply(
    AccountId: AccountId,
    ConformancePackName: StringWithCharLimit256,
    Status: OrganizationResourceDetailedStatus
  ): OrganizationConformancePackDetailedStatus = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ConformancePackName = ConformancePackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePackDetailedStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationConformancePackDetailedStatus] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setConformancePackName(value: StringWithCharLimit256): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setStatus(value: OrganizationResourceDetailedStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
