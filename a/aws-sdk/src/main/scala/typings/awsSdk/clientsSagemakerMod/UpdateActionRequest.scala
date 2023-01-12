package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActionRequest extends StObject {
  
  /**
    * The name of the action to update.
    */
  var ActionName: ExperimentEntityName
  
  /**
    * The new description for the action.
    */
  var Description: js.UndefOr[ExperimentDescription] = js.undefined
  
  /**
    * The new list of properties. Overwrites the current property list.
    */
  var Properties: js.UndefOr[LineageEntityParameters] = js.undefined
  
  /**
    * A list of properties to remove.
    */
  var PropertiesToRemove: js.UndefOr[ListLineageEntityParameterKey] = js.undefined
  
  /**
    * The new status for the action.
    */
  var Status: js.UndefOr[ActionStatus] = js.undefined
}
object UpdateActionRequest {
  
  inline def apply(ActionName: ExperimentEntityName): UpdateActionRequest = {
    val __obj = js.Dynamic.literal(ActionName = ActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionName(value: ExperimentEntityName): Self = StObject.set(x, "ActionName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ExperimentDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setProperties(value: LineageEntityParameters): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToRemove(value: ListLineageEntityParameterKey): Self = StObject.set(x, "PropertiesToRemove", value.asInstanceOf[js.Any])
    
    inline def setPropertiesToRemoveUndefined: Self = StObject.set(x, "PropertiesToRemove", js.undefined)
    
    inline def setPropertiesToRemoveVarargs(value: StringParameterValue*): Self = StObject.set(x, "PropertiesToRemove", js.Array(value*))
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "Properties", js.undefined)
    
    inline def setStatus(value: ActionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
