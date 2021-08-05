package typings.awsSdk.batchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsRequest extends StObject {
  
  /**
    * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the specified array.
    */
  var arrayJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The name or full Amazon Resource Name (ARN) of the job queue with which to list jobs.
    */
  var jobQueue: js.UndefOr[String] = js.undefined
  
  /**
    * The job status with which to filter jobs in the specified queue. If you do not specify a status, only RUNNING jobs are returned.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * The maximum number of results returned by ListJobs in paginated output. When this parameter is used, ListJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListJobs request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListJobs returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all nodes that are associated with the specified job.
    */
  var multiNodeJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListJobsRequest {
  
  inline def apply(): ListJobsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobsRequest]
  }
  
  extension [Self <: ListJobsRequest](x: Self) {
    
    inline def setArrayJobId(value: String): Self = StObject.set(x, "arrayJobId", value.asInstanceOf[js.Any])
    
    inline def setArrayJobIdUndefined: Self = StObject.set(x, "arrayJobId", js.undefined)
    
    inline def setJobQueue(value: String): Self = StObject.set(x, "jobQueue", value.asInstanceOf[js.Any])
    
    inline def setJobQueueUndefined: Self = StObject.set(x, "jobQueue", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "jobStatus", js.undefined)
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setMultiNodeJobId(value: String): Self = StObject.set(x, "multiNodeJobId", value.asInstanceOf[js.Any])
    
    inline def setMultiNodeJobIdUndefined: Self = StObject.set(x, "multiNodeJobId", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
