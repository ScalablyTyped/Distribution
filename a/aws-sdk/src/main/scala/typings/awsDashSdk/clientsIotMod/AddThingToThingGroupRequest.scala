package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddThingToThingGroupRequest extends js.Object {
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
  /**
    * The ARN of the thing to add to a group.
    */
  var thingArn: js.UndefOr[ThingArn] = js.undefined
  /**
    * The ARN of the group to which you are adding a thing.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  /**
    * The name of the group to which you are adding a thing.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
  /**
    * The name of the thing to add to a group.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object AddThingToThingGroupRequest {
  @scala.inline
  def apply(
    overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined,
    thingArn: ThingArn = null,
    thingGroupArn: ThingGroupArn = null,
    thingGroupName: ThingGroupName = null,
    thingName: ThingName = null
  ): AddThingToThingGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overrideDynamicGroups)) __obj.updateDynamic("overrideDynamicGroups")(overrideDynamicGroups)
    if (thingArn != null) __obj.updateDynamic("thingArn")(thingArn)
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[AddThingToThingGroupRequest]
  }
}

