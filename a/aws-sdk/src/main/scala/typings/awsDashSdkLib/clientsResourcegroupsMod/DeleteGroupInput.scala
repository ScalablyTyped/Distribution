package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGroupInput extends js.Object {
  /**
    * The name of the resource group to delete.
    */
  var GroupName: awsDashSdkLib.clientsResourcegroupsMod.GroupName
}

object DeleteGroupInput {
  @scala.inline
  def apply(GroupName: GroupName): DeleteGroupInput = {
    val __obj = js.Dynamic.literal(GroupName = GroupName)
  
    __obj.asInstanceOf[DeleteGroupInput]
  }
}

