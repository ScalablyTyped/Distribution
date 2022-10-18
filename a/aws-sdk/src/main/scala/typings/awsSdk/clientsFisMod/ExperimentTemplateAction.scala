package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentTemplateAction extends StObject {
  
  /**
    * The ID of the action.
    */
  var actionId: js.UndefOr[ActionId] = js.undefined
  
  /**
    * A description for the action.
    */
  var description: js.UndefOr[ExperimentTemplateActionDescription] = js.undefined
  
  /**
    * The parameters for the action.
    */
  var parameters: js.UndefOr[ExperimentTemplateActionParameterMap] = js.undefined
  
  /**
    * The name of the action that must be completed before the current action starts.
    */
  var startAfter: js.UndefOr[ExperimentTemplateActionStartAfterList] = js.undefined
  
  /**
    * The targets for the action.
    */
  var targets: js.UndefOr[ExperimentTemplateActionTargetMap] = js.undefined
}
object ExperimentTemplateAction {
  
  inline def apply(): ExperimentTemplateAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentTemplateAction]
  }
  
  extension [Self <: ExperimentTemplateAction](x: Self) {
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
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
