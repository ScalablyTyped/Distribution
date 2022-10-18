package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBackendJobRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * The ID for the job.
    */
  var JobId: string
  
  /**
    * Filters the list of response objects to include only those with the specified operation name.
    */
  var Operation: js.UndefOr[string] = js.undefined
  
  /**
    * Filters the list of response objects to include only those with the specified status.
    */
  var Status: js.UndefOr[string] = js.undefined
}
object UpdateBackendJobRequest {
  
  inline def apply(AppId: string, BackendEnvironmentName: string, JobId: string): UpdateBackendJobRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackendJobRequest]
  }
  
  extension [Self <: UpdateBackendJobRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: string): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setStatus(value: string): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
