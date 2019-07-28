package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveThingFromThingGroupRequest extends js.Object {
  /**
    * The ARN of the thing to remove from the group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  /**
    * The group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  /**
    * The name of the thing to remove from the group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object RemoveThingFromThingGroupRequest {
  @scala.inline
  def apply(
    thingArn: ThingArn = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupName: ThingGroupName = null,
    thingName: ThingName = null
  ): RemoveThingFromThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[RemoveThingFromThingGroupRequest]
  }
}

