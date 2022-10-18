package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentUpdateRequest extends StObject {
  
  /**
    * The ID of the component type.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The description of the component type.
    */
  var description: js.UndefOr[Description] = js.undefined
  
  /**
    * An object that maps strings to the properties to set in the component type update. Each string in the mapping must be unique to this object.
    */
  var propertyUpdates: js.UndefOr[PropertyRequests] = js.undefined
  
  /**
    * The update type of the component update request.
    */
  var updateType: js.UndefOr[ComponentUpdateType] = js.undefined
}
object ComponentUpdateRequest {
  
  inline def apply(): ComponentUpdateRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentUpdateRequest]
  }
  
  extension [Self <: ComponentUpdateRequest](x: Self) {
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setPropertyUpdates(value: PropertyRequests): Self = StObject.set(x, "propertyUpdates", value.asInstanceOf[js.Any])
    
    inline def setPropertyUpdatesUndefined: Self = StObject.set(x, "propertyUpdates", js.undefined)
    
    inline def setUpdateType(value: ComponentUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
    
    inline def setUpdateTypeUndefined: Self = StObject.set(x, "updateType", js.undefined)
  }
}
