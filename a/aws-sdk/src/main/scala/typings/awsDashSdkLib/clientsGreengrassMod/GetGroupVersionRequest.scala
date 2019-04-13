package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupVersionRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string
  /**
    * The ID of the group version.
    */
  var GroupVersionId: __string
}

object GetGroupVersionRequest {
  @scala.inline
  def apply(GroupId: __string, GroupVersionId: __string): GetGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId, GroupVersionId = GroupVersionId)
  
    __obj.asInstanceOf[GetGroupVersionRequest]
  }
}

