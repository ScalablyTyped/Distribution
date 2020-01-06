package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGroupInput extends js.Object {
  /**
    * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters, numbers, hyphens, underscores, punctuation, and spaces.
    */
  var Description: js.UndefOr[GroupDescription] = js.native
  /**
    * The name of the resource group for which you want to update its description.
    */
  var GroupName: typings.awsDashSdk.clientsResourcegroupsMod.GroupName = js.native
}

object UpdateGroupInput {
  @scala.inline
  def apply(GroupName: GroupName, Description: GroupDescription = null): UpdateGroupInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGroupInput]
  }
}

