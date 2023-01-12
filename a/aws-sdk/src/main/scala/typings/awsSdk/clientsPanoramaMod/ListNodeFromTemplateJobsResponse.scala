package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListNodeFromTemplateJobsResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
  
  /**
    * A list of jobs.
    */
  var NodeFromTemplateJobs: NodeFromTemplateJobList
}
object ListNodeFromTemplateJobsResponse {
  
  inline def apply(NodeFromTemplateJobs: NodeFromTemplateJobList): ListNodeFromTemplateJobsResponse = {
    val __obj = js.Dynamic.literal(NodeFromTemplateJobs = NodeFromTemplateJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNodeFromTemplateJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListNodeFromTemplateJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setNodeFromTemplateJobs(value: NodeFromTemplateJobList): Self = StObject.set(x, "NodeFromTemplateJobs", value.asInstanceOf[js.Any])
    
    inline def setNodeFromTemplateJobsVarargs(value: NodeFromTemplateJob*): Self = StObject.set(x, "NodeFromTemplateJobs", js.Array(value*))
  }
}
