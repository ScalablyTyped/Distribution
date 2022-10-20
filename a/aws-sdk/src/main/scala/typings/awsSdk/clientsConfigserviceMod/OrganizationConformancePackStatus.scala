package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationConformancePackStatus extends StObject {
  
  /**
    * An error code that is returned when organization conformance pack creation or deletion has failed in a member account. 
    */
  var ErrorCode: js.UndefOr[String] = js.undefined
  
  /**
    * An error message indicating that organization conformance pack creation or deletion failed due to an error. 
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp of the last update.
    */
  var LastUpdateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name that you assign to organization conformance pack.
    */
  var OrganizationConformancePackName: typings.awsSdk.clientsConfigserviceMod.OrganizationConformancePackName
  
  /**
    * Indicates deployment status of an organization conformance pack. When management account calls PutOrganizationConformancePack for the first time, conformance pack status is created in all the member accounts. When management account calls PutOrganizationConformancePack for the second time, conformance pack status is updated in all the member accounts. Additionally, conformance pack status is updated when one or more member accounts join or leave an organization. Conformance pack status is deleted when the management account deletes OrganizationConformancePack in all the member accounts and disables service access for config-multiaccountsetup.amazonaws.com. Config sets the state of the conformance pack to:    CREATE_SUCCESSFUL when an organization conformance pack has been successfully created in all the member accounts.     CREATE_IN_PROGRESS when an organization conformance pack creation is in progress.    CREATE_FAILED when an organization conformance pack creation failed in one or more member accounts within that organization.    DELETE_FAILED when an organization conformance pack deletion failed in one or more member accounts within that organization.    DELETE_IN_PROGRESS when an organization conformance pack deletion is in progress.    DELETE_SUCCESSFUL when an organization conformance pack has been successfully deleted from all the member accounts.    UPDATE_SUCCESSFUL when an organization conformance pack has been successfully updated in all the member accounts.    UPDATE_IN_PROGRESS when an organization conformance pack update is in progress.    UPDATE_FAILED when an organization conformance pack update failed in one or more member accounts within that organization.  
    */
  var Status: OrganizationResourceStatus
}
object OrganizationConformancePackStatus {
  
  inline def apply(
    OrganizationConformancePackName: OrganizationConformancePackName,
    Status: OrganizationResourceStatus
  ): OrganizationConformancePackStatus = {
    val __obj = js.Dynamic.literal(OrganizationConformancePackName = OrganizationConformancePackName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationConformancePackStatus]
  }
  
  extension [Self <: OrganizationConformancePackStatus](x: Self) {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setLastUpdateTime(value: js.Date): Self = StObject.set(x, "LastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "LastUpdateTime", js.undefined)
    
    inline def setOrganizationConformancePackName(value: OrganizationConformancePackName): Self = StObject.set(x, "OrganizationConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: OrganizationResourceStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
