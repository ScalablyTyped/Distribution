package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopInferenceExperimentRequest extends StObject {
  
  /**
    *  An array of ModelVariantConfig objects. There is one for each variant that you want to deploy after the inference experiment stops. Each ModelVariantConfig describes the infrastructure configuration for deploying the corresponding variant. 
    */
  var DesiredModelVariants: js.UndefOr[ModelVariantConfigList] = js.undefined
  
  /**
    *  The desired state of the experiment after stopping. The possible states are the following:     Completed: The experiment completed successfully    Cancelled: The experiment was canceled  
    */
  var DesiredState: js.UndefOr[InferenceExperimentStopDesiredState] = js.undefined
  
  /**
    *  Array of key-value pairs, with names of variants mapped to actions. The possible actions are the following:     Promote - Promote the shadow variant to a production variant    Remove - Delete the variant    Retain - Keep the variant as it is  
    */
  var ModelVariantActions: ModelVariantActionMap
  
  /**
    * The name of the inference experiment to stop.
    */
  var Name: InferenceExperimentName
  
  /**
    * The reason for stopping the experiment.
    */
  var Reason: js.UndefOr[InferenceExperimentStatusReason] = js.undefined
}
object StopInferenceExperimentRequest {
  
  inline def apply(ModelVariantActions: ModelVariantActionMap, Name: InferenceExperimentName): StopInferenceExperimentRequest = {
    val __obj = js.Dynamic.literal(ModelVariantActions = ModelVariantActions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopInferenceExperimentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopInferenceExperimentRequest] (val x: Self) extends AnyVal {
    
    inline def setDesiredModelVariants(value: ModelVariantConfigList): Self = StObject.set(x, "DesiredModelVariants", value.asInstanceOf[js.Any])
    
    inline def setDesiredModelVariantsUndefined: Self = StObject.set(x, "DesiredModelVariants", js.undefined)
    
    inline def setDesiredModelVariantsVarargs(value: ModelVariantConfig*): Self = StObject.set(x, "DesiredModelVariants", js.Array(value*))
    
    inline def setDesiredState(value: InferenceExperimentStopDesiredState): Self = StObject.set(x, "DesiredState", value.asInstanceOf[js.Any])
    
    inline def setDesiredStateUndefined: Self = StObject.set(x, "DesiredState", js.undefined)
    
    inline def setModelVariantActions(value: ModelVariantActionMap): Self = StObject.set(x, "ModelVariantActions", value.asInstanceOf[js.Any])
    
    inline def setName(value: InferenceExperimentName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setReason(value: InferenceExperimentStatusReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
