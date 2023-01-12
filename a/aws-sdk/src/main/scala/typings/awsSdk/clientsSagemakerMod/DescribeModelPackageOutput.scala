package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelPackageOutput extends StObject {
  
  /**
    * An array of additional Inference Specification objects. Each additional Inference Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
    */
  var AdditionalInferenceSpecifications: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AdditionalInferenceSpecifications] = js.undefined
  
  /**
    * A description provided for the model approval.
    */
  var ApprovalDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ApprovalDescription] = js.undefined
  
  /**
    * Whether the model package is certified for listing on Amazon Web Services Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CertifyForMarketplace] = js.undefined
  
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * A timestamp specifying when the model package was created.
    */
  var CreationTime: js.Date
  
  /**
    * The metadata properties associated with the model package versions.
    */
  var CustomerMetadataProperties: js.UndefOr[CustomerMetadataMap] = js.undefined
  
  /**
    * The machine learning domain of the model package you specified. Common machine learning domains include computer vision and natural language processing.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the drift check baselines that can be used when the model monitor is set using the model package. For more information, see the topic on Drift Detection against Previous Baselines in SageMaker Pipelines in the Amazon SageMaker Developer Guide. 
    */
  var DriftCheckBaselines: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DriftCheckBaselines] = js.undefined
  
  /**
    * Details about inference jobs that can be run with models based on this model package.
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceSpecification] = js.undefined
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The last time that the model package was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * The approval status of the model package.
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * Metrics for the model.
    */
  var ModelMetrics: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelMetrics] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.clientsSagemakerMod.ModelPackageArn
  
  /**
    * A brief summary of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * If the model is a versioned model, the name of the model group that the versioned model belongs to.
    */
  var ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the model package being described.
    */
  var ModelPackageName: EntityName
  
  /**
    * The current status of the model package.
    */
  var ModelPackageStatus: typings.awsSdk.clientsSagemakerMod.ModelPackageStatus
  
  /**
    * Details about the current status of the model package.
    */
  var ModelPackageStatusDetails: typings.awsSdk.clientsSagemakerMod.ModelPackageStatusDetails
  
  /**
    * The version of the model package.
    */
  var ModelPackageVersion: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageVersion] = js.undefined
  
  /**
    * The Amazon Simple Storage Service (Amazon S3) path where the sample payload are stored. This path points to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var SamplePayloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Details about the algorithm that was used to create the model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceAlgorithmSpecification] = js.undefined
  
  /**
    * The machine learning task you specified that your model package accomplishes. Common machine learning tasks include object detection and image classification.
    */
  var Task: js.UndefOr[String] = js.undefined
  
  /**
    * Configurations for one or more transform jobs that SageMaker runs to test the model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
}
object DescribeModelPackageOutput {
  
  inline def apply(
    CreationTime: js.Date,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageStatusDetails: ModelPackageStatusDetails
  ): DescribeModelPackageOutput = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any], ModelPackageStatusDetails = ModelPackageStatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelPackageOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeModelPackageOutput] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInferenceSpecifications(value: AdditionalInferenceSpecifications): Self = StObject.set(x, "AdditionalInferenceSpecifications", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInferenceSpecificationsUndefined: Self = StObject.set(x, "AdditionalInferenceSpecifications", js.undefined)
    
    inline def setAdditionalInferenceSpecificationsVarargs(value: AdditionalInferenceSpecificationDefinition*): Self = StObject.set(x, "AdditionalInferenceSpecifications", js.Array(value*))
    
    inline def setApprovalDescription(value: ApprovalDescription): Self = StObject.set(x, "ApprovalDescription", value.asInstanceOf[js.Any])
    
    inline def setApprovalDescriptionUndefined: Self = StObject.set(x, "ApprovalDescription", js.undefined)
    
    inline def setCertifyForMarketplace(value: CertifyForMarketplace): Self = StObject.set(x, "CertifyForMarketplace", value.asInstanceOf[js.Any])
    
    inline def setCertifyForMarketplaceUndefined: Self = StObject.set(x, "CertifyForMarketplace", js.undefined)
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCustomerMetadataProperties(value: CustomerMetadataMap): Self = StObject.set(x, "CustomerMetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomerMetadataPropertiesUndefined: Self = StObject.set(x, "CustomerMetadataProperties", js.undefined)
    
    inline def setDomain(value: String): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    inline def setDriftCheckBaselines(value: DriftCheckBaselines): Self = StObject.set(x, "DriftCheckBaselines", value.asInstanceOf[js.Any])
    
    inline def setDriftCheckBaselinesUndefined: Self = StObject.set(x, "DriftCheckBaselines", js.undefined)
    
    inline def setInferenceSpecification(value: InferenceSpecification): Self = StObject.set(x, "InferenceSpecification", value.asInstanceOf[js.Any])
    
    inline def setInferenceSpecificationUndefined: Self = StObject.set(x, "InferenceSpecification", js.undefined)
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setMetadataProperties(value: MetadataProperties): Self = StObject.set(x, "MetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setMetadataPropertiesUndefined: Self = StObject.set(x, "MetadataProperties", js.undefined)
    
    inline def setModelApprovalStatus(value: ModelApprovalStatus): Self = StObject.set(x, "ModelApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatusUndefined: Self = StObject.set(x, "ModelApprovalStatus", js.undefined)
    
    inline def setModelMetrics(value: ModelMetrics): Self = StObject.set(x, "ModelMetrics", value.asInstanceOf[js.Any])
    
    inline def setModelMetricsUndefined: Self = StObject.set(x, "ModelMetrics", js.undefined)
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatusDetails(value: ModelPackageStatusDetails): Self = StObject.set(x, "ModelPackageStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersion(value: ModelPackageVersion): Self = StObject.set(x, "ModelPackageVersion", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersionUndefined: Self = StObject.set(x, "ModelPackageVersion", js.undefined)
    
    inline def setSamplePayloadUrl(value: String): Self = StObject.set(x, "SamplePayloadUrl", value.asInstanceOf[js.Any])
    
    inline def setSamplePayloadUrlUndefined: Self = StObject.set(x, "SamplePayloadUrl", js.undefined)
    
    inline def setSourceAlgorithmSpecification(value: SourceAlgorithmSpecification): Self = StObject.set(x, "SourceAlgorithmSpecification", value.asInstanceOf[js.Any])
    
    inline def setSourceAlgorithmSpecificationUndefined: Self = StObject.set(x, "SourceAlgorithmSpecification", js.undefined)
    
    inline def setTask(value: String): Self = StObject.set(x, "Task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "Task", js.undefined)
    
    inline def setValidationSpecification(value: ModelPackageValidationSpecification): Self = StObject.set(x, "ValidationSpecification", value.asInstanceOf[js.Any])
    
    inline def setValidationSpecificationUndefined: Self = StObject.set(x, "ValidationSpecification", js.undefined)
  }
}
