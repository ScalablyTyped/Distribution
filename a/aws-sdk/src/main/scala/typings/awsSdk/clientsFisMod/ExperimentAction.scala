package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentAction extends StObject {
  
  /**
    * The ID of the action.
    */
  var actionId: js.UndefOr[ActionId] = js.undefined
  
  /**
    * The description for the action.
    */
  var description: js.UndefOr[ExperimentActionDescription] = js.undefined
  
  /**
    * The time that the action ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The parameters for the action.
    */
  var parameters: js.UndefOr[ExperimentActionParameterMap] = js.undefined
  
  /**
    * The name of the action that must be completed before this action starts.
    */
  var startAfter: js.UndefOr[ExperimentActionStartAfterList] = js.undefined
  
  /**
    * The time that the action started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The state of the action.
    */
  var state: js.UndefOr[ExperimentActionState] = js.undefined
  
  /**
    * The targets for the action.
    */
  var targets: js.UndefOr[ExperimentActionTargetMap] = js.undefined
}
object ExperimentAction {
  
  inline def apply(): ExperimentAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentAction] (val x: Self) extends AnyVal {
    
    inline def setActionId(value: ActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
    
    inline def setDescription(value: ExperimentActionDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setParameters(value: ExperimentActionParameterMap): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setStartAfter(value: ExperimentActionStartAfterList): Self = StObject.set(x, "startAfter", value.asInstanceOf[js.Any])
    
    inline def setStartAfterUndefined: Self = StObject.set(x, "startAfter", js.undefined)
    
    inline def setStartAfterVarargs(value: ExperimentActionStartAfter*): Self = StObject.set(x, "startAfter", js.Array(value*))
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setState(value: ExperimentActionState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTargets(value: ExperimentActionTargetMap): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
  }
}
