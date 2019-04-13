package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingGroupMetadata extends js.Object {
  /**
    * The UNIX timestamp of when the thing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.undefined
  /**
    * The parent thing group name.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.undefined
  /**
    * The root parent thing group.
    */
  var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.undefined
}

object ThingGroupMetadata {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    parentGroupName: ThingGroupName = null,
    rootToParentThingGroups: ThingGroupNameAndArnList = null
  ): ThingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate)
    if (parentGroupName != null) __obj.updateDynamic("parentGroupName")(parentGroupName)
    if (rootToParentThingGroups != null) __obj.updateDynamic("rootToParentThingGroups")(rootToParentThingGroups)
    __obj.asInstanceOf[ThingGroupMetadata]
  }
}

