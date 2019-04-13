package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateThingGroupRequest extends js.Object {
  /**
    * The name of the parent thing group.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.undefined
  /**
    * Metadata which can be used to manage the thing group.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  /**
    * The thing group name to create.
    */
  var thingGroupName: ThingGroupName
  /**
    * The thing group properties.
    */
  var thingGroupProperties: js.UndefOr[ThingGroupProperties] = js.undefined
}

object CreateThingGroupRequest {
  @scala.inline
  def apply(
    thingGroupName: ThingGroupName,
    parentGroupName: ThingGroupName = null,
    tags: TagList = null,
    thingGroupProperties: ThingGroupProperties = null
  ): CreateThingGroupRequest = {
    val __obj = js.Dynamic.literal(thingGroupName = thingGroupName)
    if (parentGroupName != null) __obj.updateDynamic("parentGroupName")(parentGroupName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    if (thingGroupProperties != null) __obj.updateDynamic("thingGroupProperties")(thingGroupProperties)
    __obj.asInstanceOf[CreateThingGroupRequest]
  }
}

