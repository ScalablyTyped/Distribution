package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectorEntity extends StObject {
  
  /**
    *  Specifies whether the connector entity is a parent or a category and has more entities nested underneath it. If another call is made with entitiesPath = "the_current_entity_name_with_hasNestedEntities_true", then it returns the nested entities underneath it. This provides a way to retrieve all supported entities in a recursive fashion. 
    */
  var hasNestedEntities: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  The label applied to the connector entity. 
    */
  var label: js.UndefOr[Label] = js.undefined
  
  /**
    *  The name of the connector entity. 
    */
  var name: Name
}
object ConnectorEntity {
  
  inline def apply(name: Name): ConnectorEntity = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectorEntity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectorEntity] (val x: Self) extends AnyVal {
    
    inline def setHasNestedEntities(value: Boolean): Self = StObject.set(x, "hasNestedEntities", value.asInstanceOf[js.Any])
    
    inline def setHasNestedEntitiesUndefined: Self = StObject.set(x, "hasNestedEntities", js.undefined)
    
    inline def setLabel(value: Label): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
