package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateListRequest extends StObject {
  
  /**
    *  The description of the list. 
    */
  var description: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.description] = js.undefined
  
  /**
    *  The names of the elements, if providing. You can also create an empty list and add elements later using the UpdateList API. 
    */
  var elements: js.UndefOr[ElementsList] = js.undefined
  
  /**
    *  The name of the list. 
    */
  var name: noDashIdentifier
  
  /**
    *  A collection of the key and value pairs. 
    */
  var tags: js.UndefOr[tagList] = js.undefined
  
  /**
    *  The variable type of the list. You can only assign the variable type with String data type. For more information, see Variable types. 
    */
  var variableType: js.UndefOr[typings.awsSdk.clientsFrauddetectorMod.variableType] = js.undefined
}
object CreateListRequest {
  
  inline def apply(name: noDashIdentifier): CreateListRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateListRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateListRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setElements(value: ElementsList): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: Elements*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setName(value: noDashIdentifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setVariableType(value: variableType): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
    
    inline def setVariableTypeUndefined: Self = StObject.set(x, "variableType", js.undefined)
  }
}
