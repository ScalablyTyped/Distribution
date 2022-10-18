package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertyValueRequest extends StObject {
  
  /**
    * The name of the component whose property values the operation returns.
    */
  var componentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the component type whose property values the operation returns.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The ID of the entity whose property values the operation returns.
    */
  var entityId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * The properties whose values the operation returns.
    */
  var selectedProperties: SelectedPropertyList
  
  /**
    * The ID of the workspace whose values the operation returns.
    */
  var workspaceId: Id
}
object GetPropertyValueRequest {
  
  inline def apply(selectedProperties: SelectedPropertyList, workspaceId: Id): GetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(selectedProperties = selectedProperties.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertyValueRequest]
  }
  
  extension [Self <: GetPropertyValueRequest](x: Self) {
    
    inline def setComponentName(value: Name): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setSelectedProperties(value: SelectedPropertyList): Self = StObject.set(x, "selectedProperties", value.asInstanceOf[js.Any])
    
    inline def setSelectedPropertiesVarargs(value: String*): Self = StObject.set(x, "selectedProperties", js.Array(value*))
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
