package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupInput extends js.Object {
  /**
    * The name of the resource group.
    */
  var GroupName: awsDashSdkLib.clientsResourcegroupsMod.GroupName
}

object GetGroupInput {
  @scala.inline
  def apply(GroupName: GroupName): GetGroupInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
  
    __obj.asInstanceOf[GetGroupInput]
  }
}

