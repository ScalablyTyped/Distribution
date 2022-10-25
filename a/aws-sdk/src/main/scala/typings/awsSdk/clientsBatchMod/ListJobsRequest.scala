package typings.awsSdk.clientsBatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobsRequest extends StObject {
  
  /**
    * The job ID for an array job. Specifying an array job ID with this parameter lists all child jobs from within the specified array.
    */
  var arrayJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The filter to apply to the query. Only one filter can be used at a time. When the filter is used, jobStatus is ignored. The filter doesn't apply to child jobs in an array or multi-node parallel (MNP) jobs. The results are sorted by the createdAt field, with the most recent jobs being first.  JOB_NAME  The value of the filter is a case-insensitive match for the job name. If the value ends with an asterisk (*), the filter matches any job name that begins with the string before the '*'. This corresponds to the jobName value. For example, test1 matches both Test1 and test1, and test1* matches both test1 and Test10. When the JOB_NAME filter is used, the results are grouped by the job name and version.  JOB_DEFINITION  The value for the filter is the name or Amazon Resource Name (ARN) of the job definition. This corresponds to the jobDefinition value. The value is case sensitive. When the value for the filter is the job definition name, the results include all the jobs that used any revision of that job definition name. If the value ends with an asterisk (*), the filter matches any job definition name that begins with the string before the '*'. For example, jd1 matches only jd1, and jd1* matches both jd1 and jd1A. The version of the job definition that's used doesn't affect the sort order. When the JOB_DEFINITION filter is used and the ARN is used (which is in the form arn:${Partition}:batch:${Region}:${Account}:job-definition/${JobDefinitionName}:${Revision}), the results include jobs that used the specified revision of the job definition. Asterisk (*) isn't supported when the ARN is used.  BEFORE_CREATED_AT  The value for the filter is the time that's before the job was created. This corresponds to the createdAt value. The value is a string representation of the number of milliseconds since 00:00:00 UTC (midnight) on January 1, 1970.  AFTER_CREATED_AT  The value for the filter is the time that's after the job was created. This corresponds to the createdAt value. The value is a string representation of the number of milliseconds since 00:00:00 UTC (midnight) on January 1, 1970.  
    */
  var filters: js.UndefOr[ListJobsFilterList] = js.undefined
  
  /**
    * The name or full Amazon Resource Name (ARN) of the job queue used to list jobs.
    */
  var jobQueue: js.UndefOr[String] = js.undefined
  
  /**
    * The job status used to filter jobs in the specified queue. If the filters parameter is specified, the jobStatus parameter is ignored and jobs with any status are returned. If you don't specify a status, only RUNNING jobs are returned.
    */
  var jobStatus: js.UndefOr[JobStatus] = js.undefined
  
  /**
    * The maximum number of results returned by ListJobs in paginated output. When this parameter is used, ListJobs only returns maxResults results in a single page and a nextToken response element. The remaining results of the initial request can be seen by sending another ListJobs request with the returned nextToken value. This value can be between 1 and 100. If this parameter isn't used, then ListJobs returns up to 100 results and a nextToken value if applicable.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The job ID for a multi-node parallel job. Specifying a multi-node parallel job ID with this parameter lists all nodes that are associated with the specified job.
    */
  var multiNodeJobId: js.UndefOr[String] = js.undefined
  
  /**
    * The nextToken value returned from a previous paginated ListJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value. This value is null when there are no more results to return.  Treat this token as an opaque identifier that's only used to retrieve the next items in a list and not for other programmatic purposes. 
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
    
    inline def setFilters(value: ListJobsFilterList): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: KeyValuesPair*): Self = StObject.set(x, "filters", js.Array(value*))
    
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
