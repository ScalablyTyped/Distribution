package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThingGroupMetadata extends js.Object {
  /**
    * The UNIX timestamp of when the thing group was created.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * The parent thing group name.
    */
  var parentGroupName: js.UndefOr[ThingGroupName] = js.native
  /**
    * The root parent thing group.
    */
  var rootToParentThingGroups: js.UndefOr[ThingGroupNameAndArnList] = js.native
}

object ThingGroupMetadata {
  @scala.inline
  def apply(
    creationDate: CreationDate = null,
    parentGroupName: ThingGroupName = null,
    rootToParentThingGroups: ThingGroupNameAndArnList = null
  ): ThingGroupMetadata = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (parentGroupName != null) __obj.updateDynamic("parentGroupName")(parentGroupName.asInstanceOf[js.Any])
    if (rootToParentThingGroups != null) __obj.updateDynamic("rootToParentThingGroups")(rootToParentThingGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingGroupMetadata]
  }
}

