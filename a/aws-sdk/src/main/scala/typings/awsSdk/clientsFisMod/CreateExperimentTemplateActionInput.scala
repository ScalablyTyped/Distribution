package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateExperimentTemplateActionInput extends StObject {
  
  /**
    * The ID of the action. The format of the action ID is: aws:service-name:action-type.
    */
  var actionId: ActionId
  
  /**
    * A description for the action.
    */
  var description: js.UndefOr[ExperimentTemplateActionDescription] = js.undefined
  
  /**
    * The parameters for the action, if applicable.
    */
  var parameters: js.UndefOr[ExperimentTemplateActionParameterMap] = js.undefined
  
  /**
    * The name of the action that must be completed before the current action starts. Omit this parameter to run the action at the start of the experiment.
    */
  var startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList] = js.undefined
  
  /**
    * The targets for the action.
    */
  var targets: js.UndefOr[ExperimentTemplateActionTargetMap] = js.undefined
}
object CreateExperimentTemplateActionInput {
  
  inline def apply(actionId: ActionId): CreateExperimentTemplateActionInput = {
    val __obj = js.Dynamic.literal(actionId = actionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateExperimentTemplateActionInput]
  }
  
  extension [Self <: CreateExperimentTemplateActionInput](x: Self) {
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ExperimentTemplateActionDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setParameters(value: ExperimentTemplateActionParameterMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setStartAfter(value: ExperimentTemplateActionStartAfterList): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    inline def setStartAfterVarargs(value: ExperimentTemplateActionStartAfter*): Self = StObject.set(x, "startAfter", js.Array(value*))
    
    inline def setTargets(value: ExperimentTemplateActionTargetMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
