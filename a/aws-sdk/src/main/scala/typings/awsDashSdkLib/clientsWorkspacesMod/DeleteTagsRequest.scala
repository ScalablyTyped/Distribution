package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpace. To find this ID, use DescribeWorkspaces.
    */
  var ResourceId: NonEmptyString
  /**
    * The tag keys.
    */
  var TagKeys: TagKeyList
}

object DeleteTagsRequest {
  @scala.inline
  def apply(ResourceId: NonEmptyString, TagKeys: TagKeyList): DeleteTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, TagKeys = TagKeys)
  
    __obj.asInstanceOf[DeleteTagsRequest]
  }
}

