package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInferenceExperimentRequest extends StObject {
  
  /**
    * The Amazon S3 location and configuration for storing inference request and response data.
    */
  var DataStorageConfig: js.UndefOr[InferenceExperimentDataStorageConfig] = js.undefined
  
  /**
    * The description of the inference experiment.
    */
  var Description: js.UndefOr[InferenceExperimentDescription] = js.undefined
  
  /**
    *  An array of ModelVariantConfig objects. There is one for each variant, whose infrastructure configuration you want to update. 
    */
  var ModelVariants: js.UndefOr[ModelVariantConfigList] = js.undefined
  
  /**
    * The name of the inference experiment to be updated.
    */
  var Name: InferenceExperimentName
  
  /**
    *  The duration for which the inference experiment will run. If the status of the inference experiment is Created, then you can update both the start and end dates. If the status of the inference experiment is Running, then you can update only the end date. 
    */
  var Schedule: js.UndefOr[InferenceExperimentSchedule] = js.undefined
  
  /**
    *  The configuration of ShadowMode inference experiment type. Use this field to specify a production variant which takes all the inference requests, and a shadow variant to which Amazon SageMaker replicates a percentage of the inference requests. For the shadow variant also specify the percentage of requests that Amazon SageMaker replicates. 
    */
  var ShadowModeConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ShadowModeConfig] = js.undefined
}
object UpdateInferenceExperimentRequest {
  
  inline def apply(Name: InferenceExperimentName): UpdateInferenceExperimentRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInferenceExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateInferenceExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setDataStorageConfig(value: InferenceExperimentDataStorageConfig): Self = StObject.set(x, "DataStorageConfig", value.asInstanceOf[js.Any])
    
    inline def setDataStorageConfigUndefined: Self = StObject.set(x, "DataStorageConfig", js.undefined)
    
    inline def setDescription(value: InferenceExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setModelVariants(value: ModelVariantConfigList): Self = StObject.set(x, "ModelVariants", value.asInstanceOf[js.Any])
    
    inline def setModelVariantsUndefined: Self = StObject.set(x, "ModelVariants", js.undefined)
    
    inline def setModelVariantsVarargs(value: ModelVariantConfig*): Self = StObject.set(x, "ModelVariants", js.Array(value*))
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSchedule(value: InferenceExperimentSchedule): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setShadowModeConfig(value: ShadowModeConfig): Self = StObject.set(x, "ShadowModeConfig", value.asInstanceOf[js.Any])
    
    inline def setShadowModeConfigUndefined: Self = StObject.set(x, "ShadowModeConfig", js.undefined)
  }
}
