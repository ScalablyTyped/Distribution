package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DissociateEntityFromThingRequest extends StObject {
  
  /**
    * The entity type from which to disassociate the thing.
    */
  var entityType: EntityType
  
  /**
    * The name of the thing to disassociate.
    */
  var thingName: ThingName
}
object DissociateEntityFromThingRequest {
  
  inline def apply(entityType: EntityType, thingName: ThingName): DissociateEntityFromThingRequest = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], thingName = thingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DissociateEntityFromThingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DissociateEntityFromThingRequest] (val x: Self) extends AnyVal {
    
    inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
    
    inline def setThingName(value: ThingName): Self = StObject.set(x, "thingName", value.asInstanceOf[js.Any])
  }
}
