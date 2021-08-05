package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeJobQueuesResponse extends StObject {
  
  /**
    * The list of job queues.
    */
  var jobQueues: js.UndefOr[JobQueueDetailList] = js.undefined
  
  /**
    * The nextToken value to include in a future DescribeJobQueues request. When the results of a DescribeJobQueues request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object DescribeJobQueuesResponse {
  
  inline def apply(): DescribeJobQueuesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobQueuesResponse]
  }
  
  extension [Self <: DescribeJobQueuesResponse](x: Self) {
    
    inline def setJobQueues(value: JobQueueDetailList): Self = StObject.set(x, "jobQueues", value.asInstanceOf[js.Any])
    
    inline def setJobQueuesUndefined: Self = StObject.set(x, "jobQueues", js.undefined)
    
    inline def setJobQueuesVarargs(value: JobQueueDetail*): Self = StObject.set(x, "jobQueues", js.Array(value :_*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
