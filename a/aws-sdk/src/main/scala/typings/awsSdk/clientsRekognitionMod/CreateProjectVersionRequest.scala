package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectVersionRequest extends StObject {
  
  /**
    * The identifier for your AWS Key Management Service key (AWS KMS key). You can supply the Amazon Resource Name (ARN) of your KMS key, the ID of your KMS key, an alias for your KMS key, or an alias ARN. The key is used to encrypt training and test images copied into the service for model training. Your source images are unaffected. The key is also used to encrypt training results and manifest files written to the output Amazon S3 bucket (OutputConfig). If you choose to use your own KMS key, you need the following permissions on the KMS key.   kms:CreateGrant   kms:DescribeKey   kms:GenerateDataKey   kms:Decrypt   If you don't specify a value for KmsKeyId, images copied into the service are encrypted using a key that AWS owns and manages.
    */
  var KmsKeyId: js.UndefOr[typings.awsSdk.clientsRekognitionMod.KmsKeyId] = js.undefined
  
  /**
    * The Amazon S3 bucket location to store the results of training. The S3 bucket can be in any AWS account as long as the caller has s3:PutObject permissions on the S3 bucket.
    */
  var OutputConfig: typings.awsSdk.clientsRekognitionMod.OutputConfig
  
  /**
    * The ARN of the Amazon Rekognition Custom Labels project that manages the model that you want to train.
    */
  var ProjectArn: typings.awsSdk.clientsRekognitionMod.ProjectArn
  
  /**
    *  A set of tags (key-value pairs) that you want to attach to the model. 
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * Specifies an external manifest that the service uses to test the model. If you specify TestingData you must also specify TrainingData. The project must not have any associated datasets.
    */
  var TestingData: js.UndefOr[typings.awsSdk.clientsRekognitionMod.TestingData] = js.undefined
  
  /**
    * Specifies an external manifest that the services uses to train the model. If you specify TrainingData you must also specify TestingData. The project must not have any associated datasets. 
    */
  var TrainingData: js.UndefOr[typings.awsSdk.clientsRekognitionMod.TrainingData] = js.undefined
  
  /**
    * A name for the version of the model. This value must be unique.
    */
  var VersionName: typings.awsSdk.clientsRekognitionMod.VersionName
}
object CreateProjectVersionRequest {
  
  inline def apply(OutputConfig: OutputConfig, ProjectArn: ProjectArn, VersionName: VersionName): CreateProjectVersionRequest = {
    val __obj = js.Dynamic.literal(OutputConfig = OutputConfig.asInstanceOf[js.Any], ProjectArn = ProjectArn.asInstanceOf[js.Any], VersionName = VersionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectVersionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateProjectVersionRequest] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setOutputConfig(value: OutputConfig): Self = StObject.set(x, "OutputConfig", value.asInstanceOf[js.Any])
    
    inline def setProjectArn(value: ProjectArn): Self = StObject.set(x, "ProjectArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTestingData(value: TestingData): Self = StObject.set(x, "TestingData", value.asInstanceOf[js.Any])
    
    inline def setTestingDataUndefined: Self = StObject.set(x, "TestingData", js.undefined)
    
    inline def setTrainingData(value: TrainingData): Self = StObject.set(x, "TrainingData", value.asInstanceOf[js.Any])
    
    inline def setTrainingDataUndefined: Self = StObject.set(x, "TrainingData", js.undefined)
    
    inline def setVersionName(value: VersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
  }
}
