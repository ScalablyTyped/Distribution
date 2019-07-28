package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDynamicThingGroupRequest extends js.Object {
  /**
    * The expected version of the dynamic thing group to delete.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * The name of the dynamic thing group to delete.
    */
  var thingGroupName: ThingGroupName
}

object DeleteDynamicThingGroupRequest {
  @scala.inline
  def apply(thingGroupName: ThingGroupName, expectedVersion: js.UndefOr[OptionalVersion] = js.undefined): DeleteDynamicThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    __obj.asInstanceOf[DeleteDynamicThingGroupRequest]
  }
}

