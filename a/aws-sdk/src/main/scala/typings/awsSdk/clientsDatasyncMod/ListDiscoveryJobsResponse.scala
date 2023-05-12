package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveryJobsResponse extends StObject {
  
  /**
    * The discovery jobs that you've run.
    */
  var DiscoveryJobs: js.UndefOr[DiscoveryJobList] = js.undefined
  
  /**
    * The opaque string that indicates the position to begin the next list of results in the response.
    */
  var NextToken: js.UndefOr[DiscoveryNextToken] = js.undefined
}
object ListDiscoveryJobsResponse {
  
  inline def apply(): ListDiscoveryJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDiscoveryJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDiscoveryJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setDiscoveryJobs(value: DiscoveryJobList): Self = StObject.set(x, "DiscoveryJobs", value.asInstanceOf[js.Any])
    
    inline def setDiscoveryJobsUndefined: Self = StObject.set(x, "DiscoveryJobs", js.undefined)
    
    inline def setDiscoveryJobsVarargs(value: DiscoveryJobListEntry*): Self = StObject.set(x, "DiscoveryJobs", js.Array(value*))
    
    inline def setNextToken(value: DiscoveryNextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
