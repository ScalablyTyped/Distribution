package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    * The description of the resource group.
    */
  var Description: js.UndefOr[GroupDescription] = js.undefined
  /**
    * The ARN of a resource group.
    */
  var GroupArn: typings.awsDashSdk.clientsResourcegroupsMod.GroupArn
  /**
    * The name of a resource group.
    */
  var Name: GroupName
}

object Group {
  @scala.inline
  def apply(GroupArn: GroupArn, Name: GroupName, Description: GroupDescription = null): Group = {
    val __obj = js.Dynamic.literal(GroupArn = GroupArn, Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[Group]
  }
}

