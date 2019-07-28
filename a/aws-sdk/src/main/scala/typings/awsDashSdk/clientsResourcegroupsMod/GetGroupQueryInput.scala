package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupQueryInput extends js.Object {
  /**
    * The name of the resource group.
    */
  var GroupName: typings.awsDashSdk.clientsResourcegroupsMod.GroupName
}

object GetGroupQueryInput {
  @scala.inline
  def apply(GroupName: GroupName): GetGroupQueryInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
  
    __obj.asInstanceOf[GetGroupQueryInput]
  }
}

