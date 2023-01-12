package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelPackageInput extends StObject {
  
  /**
    * An array of additional Inference Specification objects. Each additional Inference Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts. 
    */
  var AdditionalInferenceSpecifications: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AdditionalInferenceSpecifications] = js.undefined
  
  /**
    * Whether to certify the model package for listing on Amazon Web Services Marketplace. This parameter is optional for unversioned models, and does not apply to versioned models.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CertifyForMarketplace] = js.undefined
  
  /**
    * A unique token that guarantees that the call to this API is idempotent.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ClientToken] = js.undefined
  
  /**
    * The metadata properties associated with the model package versions.
    */
  var CustomerMetadataProperties: js.UndefOr[CustomerMetadataMap] = js.undefined
  
  /**
    * The machine learning domain of your model package and its components. Common machine learning domains include computer vision and natural language processing.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the drift check baselines that can be used when the model monitor is set using the model package. For more information, see the topic on Drift Detection against Previous Baselines in SageMaker Pipelines in the Amazon SageMaker Developer Guide. 
    */
  var DriftCheckBaselines: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DriftCheckBaselines] = js.undefined
  
  /**
    * Specifies details about inference jobs that can be run with models based on this model package, including the following:   The Amazon ECR paths of containers that contain the inference code and model artifacts.   The instance types that the model package supports for transform jobs and real-time endpoints used for inference.   The input and output content formats that the model package supports for inference.  
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceSpecification] = js.undefined
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * Whether the model is approved for deployment. This parameter is optional for versioned models, and does not apply to unversioned models. For versioned models, the value of this parameter must be set to Approved to deploy the model.
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * A structure that contains model metrics reports.
    */
  var ModelMetrics: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelMetrics] = js.undefined
  
  /**
    * A description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name or Amazon Resource Name (ARN) of the model package group that this model version belongs to. This parameter is required for versioned models, and does not apply to unversioned models.
    */
  var ModelPackageGroupName: js.UndefOr[ArnOrName] = js.undefined
  
  /**
    * The name of the model package. The name must have 1 to 63 characters. Valid characters are a-z, A-Z, 0-9, and - (hyphen). This parameter is required for unversioned models. It is not applicable to versioned models.
    */
  var ModelPackageName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var SamplePayloadUrl: js.UndefOr[S3Uri] = js.undefined
  
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceAlgorithmSpecification] = js.undefined
  
  /**
    * A list of key value pairs associated with the model. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The machine learning task your model package accomplishes. Common machine learning tasks include object detection and image classification. The following tasks are supported by Inference Recommender: "IMAGE_CLASSIFICATION" | "OBJECT_DETECTION" | "TEXT_GENERATION" |"IMAGE_SEGMENTATION" | "FILL_MASK" | "CLASSIFICATION" | "REGRESSION" | "OTHER". Specify "OTHER" if none of the tasks listed fit your use case.
    */
  var Task: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies configurations for one or more transform jobs that SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
}
object CreateModelPackageInput {
  
  inline def apply(): CreateModelPackageInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateModelPackageInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateModelPackageInput] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInferenceSpecifications(value: AdditionalInferenceSpecifications): Self = StObject.set(x, "AdditionalInferenceSpecifications", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInferenceSpecificationsUndefined: Self = StObject.set(x, "AdditionalInferenceSpecifications", js.undefined)
    
    inline def setAdditionalInferenceSpecificationsVarargs(value: AdditionalInferenceSpecificationDefinition*): Self = StObject.set(x, "AdditionalInferenceSpecifications", js.Array(value*))
    
    inline def setCertifyForMarketplace(value: CertifyForMarketplace): Self = StObject.set(x, "CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    inline def setCertifyForMarketplaceUndefined: Self = StObject.set(x, "CertifyForMarketplace", js.undefined)
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setCustomerMetadataProperties(value: CustomerMetadataMap): Self = StObject.set(x, "CustomerMetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomerMetadataPropertiesUndefined: Self = StObject.set(x, "CustomerMetadataProperties", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setDriftCheckBaselines(value: DriftCheckBaselines): Self = StObject.set(x, "DriftCheckBaselines", value.asInstanceOf[js.Any])
    
    inline def setDriftCheckBaselinesUndefined: Self = StObject.set(x, "DriftCheckBaselines", js.undefined)
    
    inline def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecificationUndefined: Self = StObject.set(x, "InferenceSpecification", js.undefined)
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setModelApprovalStatus(value: ModelApprovalStatus): Self = StObject.set(x, "ModelApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatusUndefined: Self = StObject.set(x, "ModelApprovalStatus", js.undefined)
    
    inline def setModelMetrics(value: ModelMetrics): Self = StObject.set(x, "ModelMetrics", value.asInstanceOf[js.Any])
    
    inline def setModelMetricsUndefined: Self = StObject.set(x, "ModelMetrics", js.undefined)
    
    inline def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: ArnOrName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageNameUndefined: Self = StObject.set(x, "ModelPackageName", js.undefined)
    
    inline def setSamplePayloadUrl(value: S3Uri): Self = StObject.set(x, "SamplePayloadUrl", value.asInstanceOf[js.Any])
    
    inline def setSamplePayloadUrlUndefined: Self = StObject.set(x, "SamplePayloadUrl", js.undefined)
    
    inline def setSourceAlgorithmSpecification(value: SourceAlgorithmSpecification): Self = StObject.set(x, "SourceAlgorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setSourceAlgorithmSpecificationUndefined: Self = StObject.set(x, "SourceAlgorithmSpecification", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTask(value: String): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "Task", js.undefined)
    
    inline def setValidationSpecification(value: ModelPackageValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    inline def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
