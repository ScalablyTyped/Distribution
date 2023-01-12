package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelPackage extends StObject {
  
  /**
    * An array of additional Inference Specification objects.
    */
  var AdditionalInferenceSpecifications: js.UndefOr[typings.awsSdk.clientsSagemakerMod.AdditionalInferenceSpecifications] = js.undefined
  
  /**
    * A description provided when the model approval is set.
    */
  var ApprovalDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ApprovalDescription] = js.undefined
  
  /**
    * Whether the model package is to be certified to be listed on Amazon Web Services Marketplace. For information about listing model packages on Amazon Web Services Marketplace, see List Your Algorithm or Model Package on Amazon Web Services Marketplace.
    */
  var CertifyForMarketplace: js.UndefOr[typings.awsSdk.clientsSagemakerMod.CertifyForMarketplace] = js.undefined
  
  /**
    * Information about the user who created or modified an experiment, trial, trial component, lineage group, or project.
    */
  var CreatedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The time that the model package was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The metadata properties for the model package. 
    */
  var CustomerMetadataProperties: js.UndefOr[CustomerMetadataMap] = js.undefined
  
  /**
    * The machine learning domain of your model package and its components. Common machine learning domains include computer vision and natural language processing.
    */
  var Domain: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the drift check baselines that can be used when the model monitor is set using the model package.
    */
  var DriftCheckBaselines: js.UndefOr[typings.awsSdk.clientsSagemakerMod.DriftCheckBaselines] = js.undefined
  
  /**
    * Defines how to perform inference generation after a training job is run.
    */
  var InferenceSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.InferenceSpecification] = js.undefined
  
  /**
    * Information about the user who created or modified an experiment, trial, trial component, lineage group, or project.
    */
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The last time the model package was modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Metadata properties of the tracking entity, trial, or trial component.
    */
  var MetadataProperties: js.UndefOr[typings.awsSdk.clientsSagemakerMod.MetadataProperties] = js.undefined
  
  /**
    * The approval status of the model. This can be one of the following values.    APPROVED - The model is approved    REJECTED - The model is rejected.    PENDING_MANUAL_APPROVAL - The model is waiting for manual approval.  
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * Metrics for the model.
    */
  var ModelMetrics: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelMetrics] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageArn] = js.undefined
  
  /**
    * The description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The model group to which the model belongs.
    */
  var ModelPackageGroupName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelPackageName: js.UndefOr[EntityName] = js.undefined
  
  /**
    * The status of the model package. This can be one of the following values.    PENDING - The model package is pending being created.    IN_PROGRESS - The model package is in the process of being created.    COMPLETED - The model package was successfully created.    FAILED - The model package failed.    DELETING - The model package is in the process of being deleted.  
    */
  var ModelPackageStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageStatus] = js.undefined
  
  /**
    * Specifies the validation and image scan statuses of the model package.
    */
  var ModelPackageStatusDetails: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageStatusDetails] = js.undefined
  
  /**
    * The version number of a versioned model.
    */
  var ModelPackageVersion: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelPackageVersion] = js.undefined
  
  /**
    * The Amazon Simple Storage Service path where the sample payload are stored. This path must point to a single gzip compressed tar archive (.tar.gz suffix).
    */
  var SamplePayloadUrl: js.UndefOr[String] = js.undefined
  
  /**
    * A list of algorithms that were used to create a model package.
    */
  var SourceAlgorithmSpecification: js.UndefOr[typings.awsSdk.clientsSagemakerMod.SourceAlgorithmSpecification] = js.undefined
  
  /**
    * A list of the tags associated with the model package. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The machine learning task your model package accomplishes. Common machine learning tasks include object detection and image classification.
    */
  var Task: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies batch transform jobs that SageMaker runs to validate your model package.
    */
  var ValidationSpecification: js.UndefOr[ModelPackageValidationSpecification] = js.undefined
}
object ModelPackage {
  
  inline def apply(): ModelPackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelPackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelPackage] (val x: Self) extends AnyVal {
    
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
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
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
    
    inline def setModelPackageArnUndefined: Self = StObject.set(x, "ModelPackageArn", js.undefined)
    
    inline def setModelPackageDescription(value: EntityDescription): Self = StObject.set(x, "ModelPackageDescription", value.asInstanceOf[js.Any])
    
    inline def setModelPackageDescriptionUndefined: Self = StObject.set(x, "ModelPackageDescription", js.undefined)
    
    inline def setModelPackageGroupName(value: EntityName): Self = StObject.set(x, "ModelPackageGroupName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupNameUndefined: Self = StObject.set(x, "ModelPackageGroupName", js.undefined)
    
    inline def setModelPackageName(value: EntityName): Self = StObject.set(x, "ModelPackageName", value.asInstanceOf[js.Any])
    
    inline def setModelPackageNameUndefined: Self = StObject.set(x, "ModelPackageName", js.undefined)
    
    inline def setModelPackageStatus(value: ModelPackageStatus): Self = StObject.set(x, "ModelPackageStatus", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatusDetails(value: ModelPackageStatusDetails): Self = StObject.set(x, "ModelPackageStatusDetails", value.asInstanceOf[js.Any])
    
    inline def setModelPackageStatusDetailsUndefined: Self = StObject.set(x, "ModelPackageStatusDetails", js.undefined)
    
    inline def setModelPackageStatusUndefined: Self = StObject.set(x, "ModelPackageStatus", js.undefined)
    
    inline def setModelPackageVersion(value: ModelPackageVersion): Self = StObject.set(x, "ModelPackageVersion", value.asInstanceOf[js.Any])
    
    inline def setModelPackageVersionUndefined: Self = StObject.set(x, "ModelPackageVersion", js.undefined)
    
    inline def setSamplePayloadUrl(value: String): Self = StObject.set(x, "SamplePayloadUrl", value.asInstanceOf[js.Any])
    
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
