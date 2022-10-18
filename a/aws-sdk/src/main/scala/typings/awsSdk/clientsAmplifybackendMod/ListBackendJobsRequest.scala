package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackendJobsRequest extends StObject {
  
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
  var JobId: js.UndefOr[string] = js.undefined
  
  /**
    * The maximum number of results that you want in the response.
    */
  var MaxResults: js.UndefOr[integerMin1Max25] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * Filters the list of response objects to include only those with the specified operation name.
    */
  var Operation: js.UndefOr[string] = js.undefined
  
  /**
    * Filters the list of response objects to include only those with the specified status.
    */
  var Status: js.UndefOr[string] = js.undefined
}
object ListBackendJobsRequest {
  
  inline def apply(AppId: string, BackendEnvironmentName: string): ListBackendJobsRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackendJobsRequest]
  }
  
  extension [Self <: ListBackendJobsRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: string): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setMaxResults(value: integerMin1Max25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOperation(value: string): Self = StObject.set(x, "Operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "Operation", js.undefined)
    
    inline def setStatus(value: string): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
