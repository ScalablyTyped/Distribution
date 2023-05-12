package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetActivationJobsResponse extends StObject {
  
  /**
    * A list of jobs.
    */
  var activationJobs: js.UndefOr[ActivateReadSetJobList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListReadSetActivationJobsResponse {
  
  inline def apply(): ListReadSetActivationJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReadSetActivationJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetActivationJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setActivationJobs(value: ActivateReadSetJobList): Self = StObject.set(x, "activationJobs", value.asInstanceOf[js.Any])
    
    inline def setActivationJobsUndefined: Self = StObject.set(x, "activationJobs", js.undefined)
    
    inline def setActivationJobsVarargs(value: ActivateReadSetJobItem*): Self = StObject.set(x, "activationJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
