package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInferenceExperimentResponse extends StObject {
  
  /**
    * The ARN of the inference experiment being described.
    */
  var Arn: InferenceExperimentArn
  
  /**
    *  The timestamp at which the inference experiment was completed. 
    */
  var CompletionTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp at which you created the inference experiment.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon S3 location and configuration for storing inference request and response data.
    */
  var DataStorageConfig: js.UndefOr[InferenceExperimentDataStorageConfig] = js.undefined
  
  /**
    * The description of the inference experiment.
    */
  var Description: js.UndefOr[InferenceExperimentDescription] = js.undefined
  
  /**
    * The metadata of the endpoint on which the inference experiment ran.
    */
  var EndpointMetadata: typings.awsSdk.clientsSagemakerMod.EndpointMetadata
  
  /**
    *  The Amazon Web Services Key Management Service (Amazon Web Services KMS) key that Amazon SageMaker uses to encrypt data on the storage volume attached to the ML compute instance that hosts the endpoint. For more information, see CreateInferenceExperiment. 
    */
  var KmsKey: js.UndefOr[KmsKeyId] = js.undefined
  
  /**
    * The timestamp at which you last modified the inference experiment.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  An array of ModelVariantConfigSummary objects. There is one for each variant in the inference experiment. Each ModelVariantConfigSummary object in the array describes the infrastructure configuration for deploying the corresponding variant. 
    */
  var ModelVariants: ModelVariantConfigSummaryList
  
  /**
    * The name of the inference experiment.
    */
  var Name: InferenceExperimentName
  
  /**
    *  The ARN of the IAM role that Amazon SageMaker can assume to access model artifacts and container images, and manage Amazon SageMaker Inference endpoints for model deployment. 
    */
  var RoleArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RoleArn] = js.undefined
  
  /**
    * The duration for which the inference experiment ran or will run.
    */
  var Schedule: js.UndefOr[InferenceExperimentSchedule] = js.undefined
  
  /**
    *  The configuration of ShadowMode inference experiment type, which shows the production variant that takes all the inference requests, and the shadow variant to which Amazon SageMaker replicates a percentage of the inference requests. For the shadow variant it also shows the percentage of requests that Amazon SageMaker replicates. 
    */
  var ShadowModeConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ShadowModeConfig] = js.undefined
  
  /**
    *  The status of the inference experiment. The following are the possible statuses for an inference experiment:     Creating - Amazon SageMaker is creating your experiment.     Created - Amazon SageMaker has finished the creation of your experiment and will begin the experiment at the scheduled time.     Updating - When you make changes to your experiment, your experiment shows as updating.     Starting - Amazon SageMaker is beginning your experiment.     Running - Your experiment is in progress.     Stopping - Amazon SageMaker is stopping your experiment.     Completed - Your experiment has completed.     Cancelled - When you conclude your experiment early using the StopInferenceExperiment API, or if any operation fails with an unexpected error, it shows as cancelled.   
    */
  var Status: InferenceExperimentStatus
  
  /**
    *  The error message or client-specified Reason from the StopInferenceExperiment API, that explains the status of the inference experiment. 
    */
  var StatusReason: js.UndefOr[InferenceExperimentStatusReason] = js.undefined
  
  /**
    * The type of the inference experiment.
    */
  var Type: InferenceExperimentType
}
object DescribeInferenceExperimentResponse {
  
  inline def apply(
    Arn: InferenceExperimentArn,
    EndpointMetadata: EndpointMetadata,
    ModelVariants: ModelVariantConfigSummaryList,
    Name: InferenceExperimentName,
    Status: InferenceExperimentStatus,
    Type: InferenceExperimentType
  ): DescribeInferenceExperimentResponse = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], EndpointMetadata = EndpointMetadata.asInstanceOf[js.Any], ModelVariants = ModelVariants.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInferenceExperimentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInferenceExperimentResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: InferenceExperimentArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCompletionTime(value: js.Date): Self = StObject.set(x, "CompletionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "CompletionTime", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataStorageConfig(value: InferenceExperimentDataStorageConfig): Self = StObject.set(x, "DataStorageConfig", value.asInstanceOf[js.Any])
    
    inline def setDataStorageConfigUndefined: Self = StObject.set(x, "DataStorageConfig", js.undefined)
    
    inline def setDescription(value: InferenceExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEndpointMetadata(value: EndpointMetadata): Self = StObject.set(x, "EndpointMetadata", value.asInstanceOf[js.Any])
    
    inline def setKmsKey(value: KmsKeyId): Self = StObject.set(x, "KmsKey", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyUndefined: Self = StObject.set(x, "KmsKey", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelVariants(value: ModelVariantConfigSummaryList): Self = StObject.set(x, "ModelVariants", value.asInstanceOf[js.Any])
    
    inline def setModelVariantsVarargs(value: ModelVariantConfigSummary*): Self = StObject.set(x, "ModelVariants", js.Array(value*))
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setSchedule(value: InferenceExperimentSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setShadowModeConfig(value: ShadowModeConfig): Self = StObject.set(x, "ShadowModeConfig", value.asInstanceOf[js.Any])
    
    inline def setShadowModeConfigUndefined: Self = StObject.set(x, "ShadowModeConfig", js.undefined)
    
    inline def setStatus(value: InferenceExperimentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusReason(value: InferenceExperimentStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
    
    inline def setType(value: InferenceExperimentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
