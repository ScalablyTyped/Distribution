package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPrediction extends StObject {
  
  /**
    * The ARN of batch prediction job.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * Timestamp of when the batch prediction job completed.
    */
  var completionTime: js.UndefOr[time] = js.undefined
  
  /**
    * The name of the detector.
    */
  var detectorName: js.UndefOr[identifier] = js.undefined
  
  /**
    * The detector version. 
    */
  var detectorVersion: js.UndefOr[floatVersionString] = js.undefined
  
  /**
    * The name of the event type.
    */
  var eventTypeName: js.UndefOr[identifier] = js.undefined
  
  /**
    * The reason a batch prediction job failed.
    */
  var failureReason: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role to use for this job request.
    */
  var iamRoleArn: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.iamRoleArn] = js.undefined
  
  /**
    * The Amazon S3 location of your training file.
    */
  var inputPath: js.UndefOr[s3BucketLocation] = js.undefined
  
  /**
    * The job ID for the batch prediction.
    */
  var jobId: js.UndefOr[identifier] = js.undefined
  
  /**
    * Timestamp of most recent heartbeat indicating the batch prediction job was making progress.
    */
  var lastHeartbeatTime: js.UndefOr[time] = js.undefined
  
  /**
    * The Amazon S3 location of your output file.
    */
  var outputPath: js.UndefOr[s3BucketLocation] = js.undefined
  
  /**
    * The number of records processed by the batch prediction job.
    */
  var processedRecordsCount: js.UndefOr[Integer_] = js.undefined
  
  /**
    * Timestamp of when the batch prediction job started.
    */
  var startTime: js.UndefOr[time] = js.undefined
  
  /**
    * The batch prediction status.
    */
  var status: js.UndefOr[AsyncJobStatus] = js.undefined
  
  /**
    * The total number of records in the batch prediction job.
    */
  var totalRecordsCount: js.UndefOr[Integer_] = js.undefined
}
object BatchPrediction {
  
  inline def apply(): BatchPrediction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPrediction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchPrediction] (val x: Self) extends AnyVal {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCompletionTime(value: time): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setDetectorName(value: identifier): Self = StObject.set(x, "detectorName", value.asInstanceOf[js.Any])
    
    inline def setDetectorNameUndefined: Self = StObject.set(x, "detectorName", js.undefined)
    
    inline def setDetectorVersion(value: floatVersionString): Self = StObject.set(x, "detectorVersion", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionUndefined: Self = StObject.set(x, "detectorVersion", js.undefined)
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "eventTypeName", js.undefined)
    
    inline def setFailureReason(value: String): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setIamRoleArn(value: iamRoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArnUndefined: Self = StObject.set(x, "iamRoleArn", js.undefined)
    
    inline def setInputPath(value: s3BucketLocation): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    inline def setInputPathUndefined: Self = StObject.set(x, "inputPath", js.undefined)
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLastHeartbeatTime(value: time): Self = StObject.set(x, "lastHeartbeatTime", value.asInstanceOf[js.Any])
    
    inline def setLastHeartbeatTimeUndefined: Self = StObject.set(x, "lastHeartbeatTime", js.undefined)
    
    inline def setOutputPath(value: s3BucketLocation): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setProcessedRecordsCount(value: Integer_): Self = StObject.set(x, "processedRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setProcessedRecordsCountUndefined: Self = StObject.set(x, "processedRecordsCount", js.undefined)
    
    inline def setStartTime(value: time): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStatus(value: AsyncJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTotalRecordsCount(value: Integer_): Self = StObject.set(x, "totalRecordsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalRecordsCountUndefined: Self = StObject.set(x, "totalRecordsCount", js.undefined)
  }
}
