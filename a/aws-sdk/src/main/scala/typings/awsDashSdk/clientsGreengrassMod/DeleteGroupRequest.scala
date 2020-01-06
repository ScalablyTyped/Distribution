package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGroupRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string = js.native
}

object DeleteGroupRequest {
  @scala.inline
  def apply(GroupId: __string): DeleteGroupRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteGroupRequest]
  }
}

