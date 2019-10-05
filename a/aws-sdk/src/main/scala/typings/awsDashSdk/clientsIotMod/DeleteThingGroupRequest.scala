package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteThingGroupRequest extends js.Object {
  /**
    * The expected version of the thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * The name of the thing group to delete.
    */
  var thingGroupName: ThingGroupName
}

object DeleteThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName, expectedVersion: Int | Double = null): DeleteThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName)
    if (expectedVersion != null) __obj.updateDynamic("expectedVersion")(expectedVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteThingGroupRequest]
  }
}

