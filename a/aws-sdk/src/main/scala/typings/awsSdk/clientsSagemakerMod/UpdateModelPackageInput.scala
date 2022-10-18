package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelPackageInput extends StObject {
  
  /**
    * An array of additional Inference Specification objects to be added to the existing array additional Inference Specification. Total number of additional Inference Specifications can not exceed 15. Each additional Inference Specification specifies artifacts based on this model package that can be used on inference endpoints. Generally used with SageMaker Neo to store the compiled artifacts.
    */
  var AdditionalInferenceSpecificationsToAdd: js.UndefOr[AdditionalInferenceSpecifications] = js.undefined
  
  /**
    * A description for the approval status of the model.
    */
  var ApprovalDescription: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ApprovalDescription] = js.undefined
  
  /**
    * The metadata properties associated with the model package versions.
    */
  var CustomerMetadataProperties: js.UndefOr[CustomerMetadataMap] = js.undefined
  
  /**
    * The metadata properties associated with the model package versions to remove.
    */
  var CustomerMetadataPropertiesToRemove: js.UndefOr[CustomerMetadataKeyList] = js.undefined
  
  /**
    * The approval status of the model.
    */
  var ModelApprovalStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelApprovalStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typings.awsSdk.clientsSagemakerMod.ModelPackageArn
}
object UpdateModelPackageInput {
  
  inline def apply(ModelPackageArn: ModelPackageArn): UpdateModelPackageInput = {
    val __obj = js.Dynamic.literal(ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateModelPackageInput]
  }
  
  extension [Self <: UpdateModelPackageInput](x: Self) {
    
    inline def setAdditionalInferenceSpecificationsToAdd(value: AdditionalInferenceSpecifications): Self = StObject.set(x, "AdditionalInferenceSpecificationsToAdd", value.asInstanceOf[js.Any])
    
    inline def setAdditionalInferenceSpecificationsToAddUndefined: Self = StObject.set(x, "AdditionalInferenceSpecificationsToAdd", js.undefined)
    
    inline def setAdditionalInferenceSpecificationsToAddVarargs(value: AdditionalInferenceSpecificationDefinition*): Self = StObject.set(x, "AdditionalInferenceSpecificationsToAdd", js.Array(value*))
    
    inline def setApprovalDescription(value: ApprovalDescription): Self = StObject.set(x, "ApprovalDescription", value.asInstanceOf[js.Any])
    
    inline def setApprovalDescriptionUndefined: Self = StObject.set(x, "ApprovalDescription", js.undefined)
    
    inline def setCustomerMetadataProperties(value: CustomerMetadataMap): Self = StObject.set(x, "CustomerMetadataProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomerMetadataPropertiesToRemove(value: CustomerMetadataKeyList): Self = StObject.set(x, "CustomerMetadataPropertiesToRemove", value.asInstanceOf[js.Any])
    
    inline def setCustomerMetadataPropertiesToRemoveUndefined: Self = StObject.set(x, "CustomerMetadataPropertiesToRemove", js.undefined)
    
    inline def setCustomerMetadataPropertiesToRemoveVarargs(value: CustomerMetadataKey*): Self = StObject.set(x, "CustomerMetadataPropertiesToRemove", js.Array(value*))
    
    inline def setCustomerMetadataPropertiesUndefined: Self = StObject.set(x, "CustomerMetadataProperties", js.undefined)
    
    inline def setModelApprovalStatus(value: ModelApprovalStatus): Self = StObject.set(x, "ModelApprovalStatus", value.asInstanceOf[js.Any])
    
    inline def setModelApprovalStatusUndefined: Self = StObject.set(x, "ModelApprovalStatus", js.undefined)
    
    inline def setModelPackageArn(value: ModelPackageArn): Self = StObject.set(x, "ModelPackageArn", value.asInstanceOf[js.Any])
  }
}
