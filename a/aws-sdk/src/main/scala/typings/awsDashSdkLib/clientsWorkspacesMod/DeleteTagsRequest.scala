package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, and IP access control groups.
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

