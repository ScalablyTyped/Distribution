package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBulkImportJobResponse extends StObject {
  
  /**
    * The ID of the job.
    */
  var jobId: ID
  
  /**
    * The unique name that helps identify the job request.
    */
  var jobName: Name
  
  /**
    * The status of the bulk import job can be one of following values.    PENDING – IoT SiteWise is waiting for the current bulk import job to finish.    CANCELLED – The bulk import job has been canceled.    RUNNING – IoT SiteWise is processing your request to import your data from Amazon S3.    COMPLETED – IoT SiteWise successfully completed your request to import data from Amazon S3.    FAILED – IoT SiteWise couldn't process your request to import data from Amazon S3. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.    COMPLETED_WITH_FAILURES – IoT SiteWise completed your request to import data from Amazon S3 with errors. You can use logs saved in the specified error report location in Amazon S3 to troubleshoot issues.  
    */
  var jobStatus: JobStatus
}
object CreateBulkImportJobResponse {
  
  inline def apply(jobId: ID, jobName: Name, jobStatus: JobStatus): CreateBulkImportJobResponse = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobName = jobName.asInstanceOf[js.Any], jobStatus = jobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBulkImportJobResponse]
  }
  
  extension [Self <: CreateBulkImportJobResponse](x: Self) {
    
    inline def setJobId(value: ID): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobName(value: Name): Self = StObject.set(x, "jobName", value.asInstanceOf[js.Any])
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "jobStatus", value.asInstanceOf[js.Any])
  }
}
