package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFilterRequest extends StObject {
  
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var action: js.UndefOr[FilterAction] = js.undefined
  
  /**
    * A description of the filter.
    */
  var description: js.UndefOr[FilterDescription] = js.undefined
  
  /**
    * The Amazon Resource Number (ARN) of the filter to update.
    */
  var filterArn: FilterArn
  
  /**
    * Defines the criteria to be update in the filter.
    */
  var filterCriteria: js.UndefOr[FilterCriteria] = js.undefined
  
  /**
    * The name of the filter.
    */
  var name: js.UndefOr[FilterName] = js.undefined
  
  /**
    * The reason the filter was updated.
    */
  var reason: js.UndefOr[FilterReason] = js.undefined
}
object UpdateFilterRequest {
  
  inline def apply(filterArn: FilterArn): UpdateFilterRequest = {
    val __obj = js.Dynamic.literal(filterArn = filterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateFilterRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: FilterAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setDescription(value: FilterDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFilterArn(value: FilterArn): Self = StObject.set(x, "filterArn", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteria(value: FilterCriteria): Self = StObject.set(x, "filterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "filterCriteria", js.undefined)
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReason(value: FilterReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
