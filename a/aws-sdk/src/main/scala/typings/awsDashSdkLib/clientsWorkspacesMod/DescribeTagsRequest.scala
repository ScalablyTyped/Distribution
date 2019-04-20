package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTagsRequest extends js.Object {
  /**
    * The identifier of the WorkSpace. To find this ID, use DescribeWorkspaces.
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

