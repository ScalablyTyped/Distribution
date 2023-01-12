package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBackendJobsResponse extends StObject {
  
  /**
    * An array of jobs and their properties.
    */
  var Jobs: js.UndefOr[ListOfBackendJobRespObj] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListBackendJobsResponse {
  
  inline def apply(): ListBackendJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBackendJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBackendJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setJobs(value: ListOfBackendJobRespObj): Self = StObject.set(x, "Jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsUndefined: Self = StObject.set(x, "Jobs", js.undefined)
    
    inline def setJobsVarargs(value: BackendJobRespObj*): Self = StObject.set(x, "Jobs", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
