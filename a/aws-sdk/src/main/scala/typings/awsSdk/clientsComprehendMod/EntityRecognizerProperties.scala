package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityRecognizerProperties extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend read access to your input data.
    */
  var DataAccessRoleArn: js.UndefOr[IamRoleArn] = js.undefined
  
  /**
    * The time that the recognizer creation completed.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) that identifies the entity recognizer.
    */
  var EntityRecognizerArn: js.UndefOr[typings.awsSdk.clientsComprehendMod.EntityRecognizerArn] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the flywheel
    */
  var FlywheelArn: js.UndefOr[ComprehendFlywheelArn] = js.undefined
  
  /**
    * The input data properties of an entity recognizer.
    */
  var InputDataConfig: js.UndefOr[EntityRecognizerInputDataConfig] = js.undefined
  
  /**
    *  The language of the input documents. All documents must be in the same language. Only English ("en") is currently supported.
    */
  var LanguageCode: js.UndefOr[typings.awsSdk.clientsComprehendMod.LanguageCode] = js.undefined
  
  /**
    *  A description of the status of the recognizer.
    */
  var Message: js.UndefOr[AnyLengthString] = js.undefined
  
  /**
    * ID for the KMS key that Amazon Comprehend uses to encrypt trained custom models. The ModelKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var ModelKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * Output data configuration.
    */
  var OutputDataConfig: js.UndefOr[EntityRecognizerOutputDataConfig] = js.undefined
  
  /**
    *  Provides information about an entity recognizer.
    */
  var RecognizerMetadata: js.UndefOr[EntityRecognizerMetadata] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the source model. This model was imported from a different Amazon Web Services account to create the entity recognizer model in your Amazon Web Services account.
    */
  var SourceModelArn: js.UndefOr[EntityRecognizerArn] = js.undefined
  
  /**
    * Provides the status of the entity recognizer.
    */
  var Status: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * The time that the recognizer was submitted for processing.
    */
  var SubmitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that training of the entity recognizer was completed.
    */
  var TrainingEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time that training of the entity recognizer started.
    */
  var TrainingStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version name you assigned to the entity recognizer.
    */
  var VersionName: js.UndefOr[typings.awsSdk.clientsComprehendMod.VersionName] = js.undefined
  
  /**
    * ID for the Amazon Web Services Key Management Service (KMS) key that Amazon Comprehend uses to encrypt data on the storage volume attached to the ML compute instance(s) that process the analysis job. The VolumeKmsKeyId can be either of the following formats:   KMS Key ID: "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS Key: "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"   
    */
  var VolumeKmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    *  Configuration parameters for a private Virtual Private Cloud (VPC) containing the resources you are using for your custom entity recognizer. For more information, see Amazon VPC. 
    */
  var VpcConfig: js.UndefOr[typings.awsSdk.clientsComprehendMod.VpcConfig] = js.undefined
}
object EntityRecognizerProperties {
  
  inline def apply(): EntityRecognizerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityRecognizerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityRecognizerProperties] (val x: Self) extends AnyVal {
    
    inline def setDataAccessRoleArn(value: IamRoleArn): Self = StObject.set(x, "DataAccessRoleArn", value.asInstanceOf[js.Any])
    
    inline def setDataAccessRoleArnUndefined: Self = StObject.set(x, "DataAccessRoleArn", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setEntityRecognizerArn(value: EntityRecognizerArn): Self = StObject.set(x, "EntityRecognizerArn", value.asInstanceOf[js.Any])
    
    inline def setEntityRecognizerArnUndefined: Self = StObject.set(x, "EntityRecognizerArn", js.undefined)
    
    inline def setFlywheelArn(value: ComprehendFlywheelArn): Self = StObject.set(x, "FlywheelArn", value.asInstanceOf[js.Any])
    
    inline def setFlywheelArnUndefined: Self = StObject.set(x, "FlywheelArn", js.undefined)
    
    inline def setInputDataConfig(value: EntityRecognizerInputDataConfig): Self = StObject.set(x, "InputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setInputDataConfigUndefined: Self = StObject.set(x, "InputDataConfig", js.undefined)
    
    inline def setLanguageCode(value: LanguageCode): Self = StObject.set(x, "LanguageCode", value.asInstanceOf[js.Any])
    
    inline def setLanguageCodeUndefined: Self = StObject.set(x, "LanguageCode", js.undefined)
    
    inline def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setModelKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "ModelKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setModelKmsKeyIdUndefined: Self = StObject.set(x, "ModelKmsKeyId", js.undefined)
    
    inline def setOutputDataConfig(value: EntityRecognizerOutputDataConfig): Self = StObject.set(x, "OutputDataConfig", value.asInstanceOf[js.Any])
    
    inline def setOutputDataConfigUndefined: Self = StObject.set(x, "OutputDataConfig", js.undefined)
    
    inline def setRecognizerMetadata(value: EntityRecognizerMetadata): Self = StObject.set(x, "RecognizerMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecognizerMetadataUndefined: Self = StObject.set(x, "RecognizerMetadata", js.undefined)
    
    inline def setSourceModelArn(value: EntityRecognizerArn): Self = StObject.set(x, "SourceModelArn", value.asInstanceOf[js.Any])
    
    inline def setSourceModelArnUndefined: Self = StObject.set(x, "SourceModelArn", js.undefined)
    
    inline def setStatus(value: ModelStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSubmitTime(value: js.Date): Self = StObject.set(x, "SubmitTime", value.asInstanceOf[js.Any])
    
    inline def setSubmitTimeUndefined: Self = StObject.set(x, "SubmitTime", js.undefined)
    
    inline def setTrainingEndTime(value: js.Date): Self = StObject.set(x, "TrainingEndTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingEndTimeUndefined: Self = StObject.set(x, "TrainingEndTime", js.undefined)
    
    inline def setTrainingStartTime(value: js.Date): Self = StObject.set(x, "TrainingStartTime", value.asInstanceOf[js.Any])
    
    inline def setTrainingStartTimeUndefined: Self = StObject.set(x, "TrainingStartTime", js.undefined)
    
    inline def setVersionName(value: VersionName): Self = StObject.set(x, "VersionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "VersionName", js.undefined)
    
    inline def setVolumeKmsKeyId(value: KmsKeyId): Self = StObject.set(x, "VolumeKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setVolumeKmsKeyIdUndefined: Self = StObject.set(x, "VolumeKmsKeyId", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
