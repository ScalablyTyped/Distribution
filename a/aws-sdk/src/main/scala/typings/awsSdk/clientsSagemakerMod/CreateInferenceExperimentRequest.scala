package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateInferenceExperimentRequest extends StObject {
  
  /**
    *  The Amazon S3 location and configuration for storing inference request and response data.   This is an optional parameter that you can use for data capture. For more information, see Capture data. 
    */
  var DataStorageConfig: js.UndefOr[InferenceExperimentDataStorageConfig] = js.undefined
  
  /**
    * A description for the inference experiment.
    */
  var Description: js.UndefOr[InferenceExperimentDescription] = js.undefined
  
  /**
    *  The name of the Amazon SageMaker endpoint on which you want to run the inference experiment. 
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
  
  /**
    *  The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. The KmsKey can be any of the following formats:    KMS key ID  "1234abcd-12ab-34cd-56ef-1234567890ab"    Amazon Resource Name (ARN) of a KMS key  "arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"    KMS key Alias  "alias/ExampleAlias"    Amazon Resource Name (ARN) of a KMS key Alias  "arn:aws:kms:us-west-2:111122223333:alias/ExampleAlias"     If you use a KMS key ID or an alias of your KMS key, the Amazon SageMaker execution role must include permissions to call kms:Encrypt. If you don't provide a KMS key ID, Amazon SageMaker uses the default KMS key for Amazon S3 for your role's account. Amazon SageMaker uses server-side encryption with KMS managed keys for OutputDataConfig. If you use a bucket policy with an s3:PutObject permission that only allows objects with server-side encryption, set the condition key of s3:x-amz-server-side-encryption to "aws:kms". For more information, see KMS managed Encryption Keys in the Amazon Simple Storage Service Developer Guide.   The KMS key policy must grant permission to the IAM role that you specify in your CreateEndpoint and UpdateEndpoint requests. For more information, see Using Key Policies in Amazon Web Services KMS in the Amazon Web Services Key Management Service Developer Guide. 
    */
  var KmsKey: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    *  An array of ModelVariantConfig objects. There is one for each variant in the inference experiment. Each ModelVariantConfig object in the array describes the infrastructure configuration for the corresponding variant. 
    */
  var ModelVariants: ModelVariantConfigList
  
  /**
    * The name for the inference experiment.
    */
  var Name: InferenceExperimentName
  
  /**
    *  The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and manage Amazon SageMaker Inference endpoints for model deployment. 
    */
  var RoleArn: typings.awsSdk.clientsSagemakerMod.RoleArn
  
  /**
    *  The duration for which you want the inference experiment to run. If you don't specify this field, the experiment automatically starts immediately upon creation and concludes after 7 days. 
    */
  var Schedule: js.UndefOr[InferenceExperimentSchedule] = js.undefined
  
  /**
    *  The configuration of ShadowMode inference experiment type. Use this field to specify a production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon SageMaker replicates. 
    */
  var ShadowModeConfig: typings.awsSdk.clientsSagemakerMod.ShadowModeConfig
  
  /**
    *  Array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. For more information, see Tagging your Amazon Web Services Resources. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    *  The type of the inference experiment that you want to run. The following types of experiments are possible:     ShadowMode: You can use this type to validate a shadow variant. For more information, see Shadow tests.   
    */
  var Type: InferenceExperimentType
}
object CreateInferenceExperimentRequest {
  
  inline def apply(
    EndpointName: EndpointName,
    ModelVariants: ModelVariantConfigList,
    Name: InferenceExperimentName,
    RoleArn: RoleArn,
    ShadowModeConfig: ShadowModeConfig,
    Type: InferenceExperimentType
  ): CreateInferenceExperimentRequest = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any], ModelVariants = ModelVariants.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any], ShadowModeConfig = ShadowModeConfig.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInferenceExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateInferenceExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setDataStorageConfig(value: InferenceExperimentDataStorageConfig): Self = StObject.set(x, "DataStorageConfig", value.asInstanceOf[js.Any])
    
    inline def setDataStorageConfigUndefined: Self = StObject.set(x, "DataStorageConfig", js.undefined)
    
    inline def setDescription(value: InferenceExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
    
    inline def setKmsKey(value: KmsKeyId): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
    
    inline def setModelVariants(value: ModelVariantConfigList): Self = StObject.set(x, "ModelVariants", value.asInstanceOf[js.Any])
    
    inline def setModelVariantsVarargs(value: ModelVariantConfig*): Self = StObject.set(x, "ModelVariants", js.Array(value*))
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: InferenceExperimentSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setShadowModeConfig(value: ShadowModeConfig): Self = StObject.set(x, "ShadowModeConfig", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: InferenceExperimentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
