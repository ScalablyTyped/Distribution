package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackendResponse extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: js.UndefOr[string] = js.undefined
  
  /**
    * If the request fails, this error is returned.
    */
  var Error: js.UndefOr[string] = js.undefined
  
  /**
    * The ID for the job.
    */
  var JobId: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the operation.
    */
  var Operation: js.UndefOr[string] = js.undefined
  
  /**
    * The current status of the request.
    */
  var Status: js.UndefOr[string] = js.undefined
}
object DeleteBackendResponse {
  
  inline def apply(): DeleteBackendResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBackendResponse]
  }
  
  extension [Self <: DeleteBackendResponse](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setAppIdUndefined: Self = StObject.set(x, "AppId", js.undefined)
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentNameUndefined: Self = StObject.set(x, "BackendEnvironmentName", js.undefined)
    
    inline def setError(value: string): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setOperation(value: string): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setStatus(value: string): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
