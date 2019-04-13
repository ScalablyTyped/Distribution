package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkspaceImageRequest extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId
}

object DeleteWorkspaceImageRequest {
  @scala.inline
  def apply(ImageId: WorkspaceImageId): DeleteWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId)
  
    __obj.asInstanceOf[DeleteWorkspaceImageRequest]
  }
}

