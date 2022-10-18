package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentRequest extends StObject {
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The description of the component request.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An object that maps strings to the properties to set in the component type. Each string in the mapping must be unique to this object.
    */
  var properties: js.UndefOr[PropertyRequests] = js.undefined
}
object ComponentRequest {
  
  inline def apply(): ComponentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRequest]
  }
  
  extension [Self <: ComponentRequest](x: Self) {
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setProperties(value: PropertyRequests): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
