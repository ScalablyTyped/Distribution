package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetGroupVersionRequest extends js.Object {
  /**
    * The ID of the Greengrass group.
    */
  var GroupId: __string = js.native
  /**
    * The ID of the group version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListGroupVersions'' requests. If the version is the last one that was associated with a group, the value also maps to the ''LatestVersion'' property of the corresponding ''GroupInformation'' object.
    */
  var GroupVersionId: __string = js.native
}

object GetGroupVersionRequest {
  @scala.inline
  def apply(GroupId: __string, GroupVersionId: __string): GetGroupVersionRequest = {
    val __obj = js.Dynamic.literal(GroupId = GroupId.asInstanceOf[js.Any], GroupVersionId = GroupVersionId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetGroupVersionRequest]
  }
}

