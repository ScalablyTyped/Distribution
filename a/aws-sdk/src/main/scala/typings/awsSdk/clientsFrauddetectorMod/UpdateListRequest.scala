package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateListRequest extends StObject {
  
  /**
    *  The new description. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    *  One or more list elements to add or replace. If you are providing the elements, make sure to specify the updateMode to use.  If you are deleting all elements from the list, use REPLACE for the updateMode and provide an empty list (0 elements).
    */
  var elements: js.UndefOr[ElementsList] = js.undefined
  
  /**
    *  The name of the list to update. 
    */
  var name: noDashIdentifier
  
  /**
    *  The update mode (type).    Use APPEND if you are adding elements to the list.   Use REPLACE if you replacing existing elements in the list.   Use REMOVE if you are removing elements from the list.  
    */
  var updateMode: js.UndefOr[ListUpdateMode] = js.undefined
  
  /**
    *  The variable type you want to assign to the list.   You cannot update a variable type of a list that already has a variable type assigned to it. You can assign a variable type to a list only if the list does not already have a variable type. 
    */
  var variableType: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.variableType] = js.undefined
}
object UpdateListRequest {
  
  inline def apply(name: noDashIdentifier): UpdateListRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateListRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElements(value: ElementsList): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: Elements*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setName(value: noDashIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUpdateMode(value: ListUpdateMode): Self = StObject.set(x, "updateMode", value.asInstanceOf[js.Any])
    
    inline def setUpdateModeUndefined: Self = StObject.set(x, "updateMode", js.undefined)
    
    inline def setVariableType(value: variableType): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
