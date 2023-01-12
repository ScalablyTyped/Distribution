package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBatchPredictionJobRequest extends StObject {
  
  /**
    * The name of the detector.
    */
  var detectorName: identifier
  
  /**
    * The detector version.
    */
  var detectorVersion: js.UndefOr[wholeNumberVersionString] = js.undefined
  
  /**
    * The name of the event type.
    */
  var eventTypeName: identifier
  
  /**
    * The ARN of the IAM role to use for this job request. The IAM Role must have read permissions to your input S3 bucket and write permissions to your output S3 bucket. For more information about bucket permissions, see User policy examples in the Amazon S3 User Guide.
    */
  var iamRoleArn: typings.awsSdk.clientsFrauddetectorMod.iamRoleArn
  
  /**
    * The Amazon S3 location of your training file.
    */
  var inputPath: s3BucketLocation
  
  /**
    * The ID of the batch prediction job.
    */
  var jobId: identifier
  
  /**
    * The Amazon S3 location of your output file.
    */
  var outputPath: s3BucketLocation
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object CreateBatchPredictionJobRequest {
  
  inline def apply(
    detectorName: identifier,
    eventTypeName: identifier,
    iamRoleArn: iamRoleArn,
    inputPath: s3BucketLocation,
    jobId: identifier,
    outputPath: s3BucketLocation
  ): CreateBatchPredictionJobRequest = {
    val __obj = js.Dynamic.literal(detectorName = detectorName.asInstanceOf[js.Any], eventTypeName = eventTypeName.asInstanceOf[js.Any], iamRoleArn = iamRoleArn.asInstanceOf[js.Any], inputPath = inputPath.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], outputPath = outputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBatchPredictionJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateBatchPredictionJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorName(value: identifier): Self = StObject.set(x, "detectorName", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersion(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersion", value.asInstanceOf[js.Any])
    
    inline def setDetectorVersionUndefined: Self = StObject.set(x, "detectorVersion", js.undefined)
    
    inline def setEventTypeName(value: identifier): Self = StObject.set(x, "eventTypeName", value.asInstanceOf[js.Any])
    
    inline def setIamRoleArn(value: iamRoleArn): Self = StObject.set(x, "iamRoleArn", value.asInstanceOf[js.Any])
    
    inline def setInputPath(value: s3BucketLocation): Self = StObject.set(x, "inputPath", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: identifier): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setOutputPath(value: s3BucketLocation): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
