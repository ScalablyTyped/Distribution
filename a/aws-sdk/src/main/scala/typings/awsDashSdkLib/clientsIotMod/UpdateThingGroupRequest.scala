package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThingGroupRequest extends js.Object {
  /**
    * The expected version of the thing group. If this does not match the version of the thing group being updated, the update will fail.
    */
  var expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  /**
    * The thing group to update.
    */
  var thingGroupName: ThingGroupName
  /**
    * The thing group properties.
    */
  var thingGroupProperties: ThingGroupProperties
}

object UpdateThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    thingGroupProperties: ThingGroupProperties,
    expectedVersion: js.UndefOr[OptionalVersion] = js.undefined
  ): UpdateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName, thingGroupProperties = thingGroupProperties)
    if (!js.isUndefined(expectedVersion)) __obj.updateDynamic("expectedVersion")(expectedVersion)
    __obj.asInstanceOf[UpdateThingGroupRequest]
  }
}

