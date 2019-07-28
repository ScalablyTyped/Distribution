package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateEntityToThingRequest extends js.Object {
  /**
    * The ID of the device to be associated with the thing. The ID should be in the following format.  urn:tdm:REGION/ACCOUNT ID/default:device:DEVICENAME 
    */
  var entityId: Urn
  /**
    * The version of the user's namespace. Defaults to the latest version of the user's namespace.
    */
  var namespaceVersion: js.UndefOr[Version] = js.undefined
  /**
    * The name of the thing to which the entity is to be associated.
    */
  var thingName: ThingName
}

object AssociateEntityToThingRequest {
  @scala.inline
  def apply(entityId: Urn, thingName: ThingName, namespaceVersion: js.UndefOr[Version] = js.undefined): AssociateEntityToThingRequest = {
    val __obj = js.Dynamic.literal(entityId = entityId, thingName = thingName)
    if (!js.isUndefined(namespaceVersion)) __obj.updateDynamic("namespaceVersion")(namespaceVersion)
    __obj.asInstanceOf[AssociateEntityToThingRequest]
  }
}

