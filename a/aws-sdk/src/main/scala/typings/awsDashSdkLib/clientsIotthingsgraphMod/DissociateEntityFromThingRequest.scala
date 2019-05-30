package typings
package awsDashSdkLib.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DissociateEntityFromThingRequest extends js.Object {
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
  @scala.inline
  def apply(entityType: EntityType, thingName: ThingName): DissociateEntityFromThingRequest = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], thingName = thingName)
  
    __obj.asInstanceOf[DissociateEntityFromThingRequest]
  }
}

