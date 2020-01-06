package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Group extends js.Object {
  /**
    * The description of the resource group.
    */
  var Description: js.UndefOr[GroupDescription] = js.native
  /**
    * The ARN of a resource group.
    */
  var GroupArn: typings.awsDashSdk.clientsResourcegroupsMod.GroupArn = js.native
  /**
    * The name of a resource group.
    */
  var Name: GroupName = js.native
}

object Group {
  @scala.inline
  def apply(GroupArn: GroupArn, Name: GroupName, Description: GroupDescription = null): Group = {
    val __obj = js.Dynamic.literal(GroupArn = GroupArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

