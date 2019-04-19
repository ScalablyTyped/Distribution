package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, and IP access control groups.
    */
  var ResourceId: NonEmptyString
  /**
    * The tags. Each WorkSpaces resource can have a maximum of 50 tags.
    */
  var Tags: TagList
}

object CreateTagsRequest {
  @scala.inline
  def apply(ResourceId: NonEmptyString, Tags: TagList): CreateTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId, Tags = Tags)
  
    __obj.asInstanceOf[CreateTagsRequest]
  }
}

