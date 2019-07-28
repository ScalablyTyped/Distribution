package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingGroupDocument extends js.Object {
  /**
    * The thing group attributes.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * Parent group names.
    */
  var parentGroupNames: js.UndefOr[ThingGroupNameList] = js.undefined
  /**
    * The thing group description.
    */
  var thingGroupDescription: js.UndefOr[ThingGroupDescription] = js.undefined
  /**
    * The thing group ID.
    */
  var thingGroupId: js.UndefOr[ThingGroupId] = js.undefined
  /**
    * The thing group name.
    */
  var thingGroupName: js.UndefOr[ThingGroupName] = js.undefined
}

object ThingGroupDocument {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    parentGroupNames: ThingGroupNameList = null,
    thingGroupDescription: ThingGroupDescription = null,
    thingGroupId: ThingGroupId = null,
    thingGroupName: ThingGroupName = null
  ): ThingGroupDocument = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (parentGroupNames != null) __obj.updateDynamic("parentGroupNames")(parentGroupNames)
    if (thingGroupDescription != null) __obj.updateDynamic("thingGroupDescription")(thingGroupDescription)
    if (thingGroupId != null) __obj.updateDynamic("thingGroupId")(thingGroupId)
    if (thingGroupName != null) __obj.updateDynamic("thingGroupName")(thingGroupName)
    __obj.asInstanceOf[ThingGroupDocument]
  }
}

