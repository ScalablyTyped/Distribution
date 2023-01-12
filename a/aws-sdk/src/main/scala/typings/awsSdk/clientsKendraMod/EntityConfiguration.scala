package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EntityConfiguration extends StObject {
  
  /**
    * The identifier of a user or group in your IAM Identity Center identity source. For example, a user ID could be an email.
    */
  var EntityId: typings.awsSdk.clientsKendraMod.EntityId
  
  /**
    * Specifies whether you are configuring a User or a Group.
    */
  var EntityType: typings.awsSdk.clientsKendraMod.EntityType
}
object EntityConfiguration {
  
  inline def apply(EntityId: EntityId, EntityType: EntityType): EntityConfiguration = {
    val __obj = js.Dynamic.literal(EntityId = EntityId.asInstanceOf[js.Any], EntityType = EntityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EntityConfiguration] (val x: Self) extends AnyVal {
    
    inline def setEntityId(value: EntityId): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "EntityType", value.asInstanceOf[js.Any])
  }
}
