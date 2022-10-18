package typings.awsSdk.clientsMigrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyApplicationStateRequest extends StObject {
  
  /**
    * The configurationId in Application Discovery Service that uniquely identifies the grouped application.
    */
  var ApplicationId: typings.awsSdk.clientsMigrationhubMod.ApplicationId
  
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[typings.awsSdk.clientsMigrationhubMod.DryRun] = js.undefined
  
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var Status: ApplicationStatus
  
  /**
    * The timestamp when the application state changed.
    */
  var UpdateDateTime: js.UndefOr[js.Date] = js.undefined
}
object NotifyApplicationStateRequest {
  
  inline def apply(ApplicationId: ApplicationId, Status: ApplicationStatus): NotifyApplicationStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyApplicationStateRequest]
  }
  
  extension [Self <: NotifyApplicationStateRequest](x: Self) {
    
    inline def setApplicationId(value: ApplicationId): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: DryRun): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setStatus(value: ApplicationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "UpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTimeUndefined: Self = StObject.set(x, "UpdateDateTime", js.undefined)
  }
}
