package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThingRequest extends js.Object {
  /**
    * The expected version of the thing record in the registry. If the version of the record in the registry does not match the expected version specified in the request, the DeleteThing request is rejected with a VersionConflictException.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * The name of the thing to delete.
    */
  var thingName: ThingName
}

object DeleteThingRequest {
  @scala.inline
  def apply(thingName: ThingName, expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteThingRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    __obj.asInstanceOf[DeleteThingRequest]
  }
}

