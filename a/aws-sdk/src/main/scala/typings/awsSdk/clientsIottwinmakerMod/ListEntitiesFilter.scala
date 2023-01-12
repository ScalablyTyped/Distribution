package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEntitiesFilter extends StObject {
  
  /**
    * The ID of the component type in the entities in the list.
    */
  var componentTypeId: js.UndefOr[ComponentTypeId] = js.undefined
  
  /**
    * The external-Id property of a component. The external-Id property is the primary key of an external storage system.
    */
  var externalId: js.UndefOr[String] = js.undefined
  
  /**
    * The parent of the entities in the list.
    */
  var parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
}
object ListEntitiesFilter {
  
  inline def apply(): ListEntitiesFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEntitiesFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEntitiesFilter] (val x: Self) extends AnyVal {
    
    inline def setComponentTypeId(value: ComponentTypeId): Self = StObject.set(x, "componentTypeId", value.asInstanceOf[js.Any])
    
    inline def setComponentTypeIdUndefined: Self = StObject.set(x, "componentTypeId", js.undefined)
    
    inline def setExternalId(value: String): Self = StObject.set(x, "externalId", value.asInstanceOf[js.Any])
    
    inline def setExternalIdUndefined: Self = StObject.set(x, "externalId", js.undefined)
    
    inline def setParentEntityId(value: ParentEntityId): Self = StObject.set(x, "parentEntityId", value.asInstanceOf[js.Any])
    
    inline def setParentEntityIdUndefined: Self = StObject.set(x, "parentEntityId", js.undefined)
  }
}
