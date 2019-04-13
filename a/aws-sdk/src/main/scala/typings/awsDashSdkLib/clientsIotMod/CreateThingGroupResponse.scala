package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThingGroupResponse extends js.Object {
  /**
    * The thing group ARN.
    */
  var thingGroupArn: js.UndefOr[ThingGroupArn] = js.undefined
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
}

object CreateThingGroupResponse {
  @scala.inline
  def apply(
    thingGroupArn: ThingGroupArn = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): CreateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (thingGroupArn != null) __obj.updateDynamic("thingGroupArn")(thingGroupArn)
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    __obj.asInstanceOf[CreateThingGroupResponse]
  }
}

