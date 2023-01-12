package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Entity extends StObject {
  
  /**
    * The entity ID. If you do not know the entityId, you can pass unknown, which is areserved string literal.
    */
  var entityId: entityRestrictedString
  
  /**
    * The entity type.
    */
  var entityType: String
}
object Entity {
  
  inline def apply(entityId: entityRestrictedString, entityType: String): Entity = {
    val __obj = js.Dynamic.literal(entityId = entityId.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Entity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Entity] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: entityRestrictedString): Self = StObject.set(x, "entityId", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: String): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
  }
}
