package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateGroupInput extends js.Object {
  /**
    * The description of the resource group. Descriptions can have a maximum of 511 characters, including letters, numbers, hyphens, underscores, punctuation, and spaces.
    */
  var Description: js.UndefOr[GroupDescription] = js.undefined
  /**
    * The name of the resource group for which you want to update its description.
    */
  var GroupName: awsDashSdkLib.clientsResourcegroupsMod.GroupName
}

object UpdateGroupInput {
  @scala.inline
  def apply(GroupName: GroupName, Description: GroupDescription = null): UpdateGroupInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[UpdateGroupInput]
  }
}

