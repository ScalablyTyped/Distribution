package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThingGroupsForThingRequest extends js.Object {
  /**
    * Override dynamic thing groups with static thing groups when 10-group limit is reached. If a thing belongs to 10 thing groups, and one or more of those groups are dynamic thing groups, adding a thing to a static group removes the thing from the last dynamic group.
    */
  var overrideDynamicGroups: js.UndefOr[OverrideDynamicGroups] = js.undefined
  /**
    * The groups to which the thing will be added.
    */
  var thingGroupsToAdd: js.UndefOr[ThingGroupList] = js.undefined
  /**
    * The groups from which the thing will be removed.
    */
  var thingGroupsToRemove: js.UndefOr[ThingGroupList] = js.undefined
  /**
    * The thing whose group memberships will be updated.
    */
  var thingName: js.UndefOr[ThingName] = js.undefined
}

object UpdateThingGroupsForThingRequest {
  @scala.inline
  def apply(
    overrideDynamicGroups: js.UndefOr[scala.Boolean] = js.undefined,
    thingGroupsToAdd: ThingGroupList = null,
    thingGroupsToRemove: ThingGroupList = null,
    thingName: ThingName = null
  ): UpdateThingGroupsForThingRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(overrideDynamicGroups)) __obj.updateDynamic("overrideDynamicGroups")(overrideDynamicGroups)
    if (thingGroupsToAdd != null) __obj.updateDynamic("thingGroupsToAdd")(thingGroupsToAdd)
    if (thingGroupsToRemove != null) __obj.updateDynamic("thingGroupsToRemove")(thingGroupsToRemove)
    if (thingName != null) __obj.updateDynamic("thingName")(thingName)
    __obj.asInstanceOf[UpdateThingGroupsForThingRequest]
  }
}

