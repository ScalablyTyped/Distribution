package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityPropertyReference extends StObject {
  
  /**
    * The name of the component.
    */
  var componentName: js.UndefOr[Name] = js.undefined
  
  /**
    * The ID of the entity.
    */
  var entityId: js.UndefOr[EntityId] = js.undefined
  
  /**
    * A mapping of external IDs to property names. External IDs uniquely identify properties from external data stores.
    */
  var externalIdProperty: js.UndefOr[ExternalIdProperty] = js.undefined
  
  /**
    * The name of the property.
    */
  var propertyName: Name
}
object EntityPropertyReference {
  
  inline def apply(propertyName: Name): EntityPropertyReference = {
    val __obj = js.Dynamic.literal(propertyName = propertyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityPropertyReference]
  }
  
  extension [Self <: EntityPropertyReference](x: Self) {
    
    inline def setComponentName(value: Name): Self = StObject.set(x, "componentName", value.asInstanceOf[js.Any])
    
    inline def setComponentNameUndefined: Self = StObject.set(x, "componentName", js.undefined)
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "entityId", js.undefined)
    
    inline def setExternalIdProperty(value: ExternalIdProperty): Self = StObject.set(x, "externalIdProperty", value.asInstanceOf[js.Any])
    
    inline def setExternalIdPropertyUndefined: Self = StObject.set(x, "externalIdProperty", js.undefined)
    
    inline def setPropertyName(value: Name): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
  }
}
