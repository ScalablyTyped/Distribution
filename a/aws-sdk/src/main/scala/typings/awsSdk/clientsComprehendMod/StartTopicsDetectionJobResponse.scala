package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTopicsDetectionJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the topics detection job. It is a unique, fully qualified identifier for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:  arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:topics-detection-job/&lt;job-id&gt;  The following is an example job ARN:  arn:aws:comprehend:us-west-2:111122223333:document-classification-job/1234abcd12ab34cd56ef1234567890ab 
    */
  var JobArn: js.UndefOr[ComprehendArn] = js.undefined
  
  /**
    * The identifier generated for the job. To get the status of the job, use this identifier with the DescribeTopicDetectionJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * The status of the job:    SUBMITTED - The job has been received and is queued for processing.   IN_PROGRESS - Amazon Comprehend is processing the job.   COMPLETED - The job was successfully completed and the output is available.   FAILED - The job did not complete. To get details, use the DescribeTopicDetectionJob operation.  
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
}
object StartTopicsDetectionJobResponse {
  
  inline def apply(): StartTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTopicsDetectionJobResponse]
  }
  
  extension [Self <: StartTopicsDetectionJobResponse](x: Self) {
    
    inline def setJobArn(value: ComprehendArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "JobArn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
