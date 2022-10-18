package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelingJobOutputConfig extends StObject {
  
  /**
    * The Amazon Web Services Key Management Service ID of the key used to encrypt the output data, if any. If you provide your own KMS key ID, you must add the required permissions to your KMS key described in Encrypt Output Data and Storage Volume with Amazon Web Services KMS. If you don't provide a KMS key ID, Amazon SageMaker uses the default Amazon Web Services KMS key for Amazon S3 for your role's account to encrypt your output data. If you use a bucket policy with an s3:PutObject permission that only allows objects with server-side encryption, set the condition key of s3:x-amz-server-side-encryption to "aws:kms". For more information, see KMS-Managed Encryption Keys in the Amazon Simple Storage Service Developer Guide. 
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsSagemakerMod.KmsKeyId] = js.undefined
  
  /**
    * The Amazon S3 location to write output data.
    */
  var S3OutputPath: S3Uri
  
  /**
    * An Amazon Simple Notification Service (Amazon SNS) output topic ARN. Provide a SnsTopicArn if you want to do real time chaining to another streaming job and receive an Amazon SNS notifications each time a data object is submitted by a worker. If you provide an SnsTopicArn in OutputConfig, when workers complete labeling tasks, Ground Truth will send labeling task output data to the SNS output topic you specify here.  To learn more, see Receive Output Data from a Streaming Labeling Job. 
    */
  var SnsTopicArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SnsTopicArn] = js.undefined
}
object LabelingJobOutputConfig {
  
  inline def apply(S3OutputPath: S3Uri): LabelingJobOutputConfig = {
    val __obj = js.Dynamic.literal(S3OutputPath = S3OutputPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobOutputConfig]
  }
  
  extension [Self <: LabelingJobOutputConfig](x: Self) {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setS3OutputPath(value: S3Uri): Self = StObject.set(x, "S3OutputPath", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
