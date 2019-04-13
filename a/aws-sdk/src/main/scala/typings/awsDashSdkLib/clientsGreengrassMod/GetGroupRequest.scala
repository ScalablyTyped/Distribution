package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
}

object GetGroupRequest {
  @scala.inline
  def apply(GroupId: __string): GetGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId)
  
    __obj.asInstanceOf[GetGroupRequest]
  }
}

