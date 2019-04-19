package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpaces resource. The supported resource types are WorkSpaces, registered directories, images, custom bundles, and IP access control groups.
    */
  var ResourceId: NonEmptyString
}

object DescribeTagsRequest {
  @scala.inline
  def apply(ResourceId: NonEmptyString): DescribeTagsRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId)
  
    __obj.asInstanceOf[DescribeTagsRequest]
  }
}

