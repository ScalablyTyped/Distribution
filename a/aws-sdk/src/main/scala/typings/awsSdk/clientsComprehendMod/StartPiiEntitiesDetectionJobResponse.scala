package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartPiiEntitiesDetectionJobResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the PII entity detection job. It is a unique, fully qualified identifier for the job. It includes the AWS account, Region, and the job ID. The format of the ARN is as follows:  arn:&lt;partition&gt;:comprehend:&lt;region&gt;:&lt;account-id&gt;:pii-entities-detection-job/&lt;job-id&gt;  The following is an example job ARN:  arn:aws:comprehend:us-west-2:111122223333:pii-entities-detection-job/1234abcd12ab34cd56ef1234567890ab 
    */
  var JobArn: js.UndefOr[ComprehendArn] = js.undefined
  
  /**
    * The identifier generated for the job.
    */
  var JobId: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobId] = js.undefined
  
  /**
    * The status of the job.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.clientsComprehendMod.JobStatus] = js.undefined
}
object StartPiiEntitiesDetectionJobResponse {
  
  inline def apply(): StartPiiEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartPiiEntitiesDetectionJobResponse]
  }
  
  extension [Self <: StartPiiEntitiesDetectionJobResponse](x: Self) {
    
    inline def setJobArn(value: ComprehendArn): Self = StObject.set(x, "JobArn", value.asInstanceOf[js.Any])
    
    inline def setJobArnUndefined: Self = StObject.set(x, "JobArn", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobStatus(value: JobStatus): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
    
    inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
  }
}
