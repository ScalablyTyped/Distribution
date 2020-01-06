package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkspaceImageRequest extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: WorkspaceImageId = js.native
}

object DeleteWorkspaceImageRequest {
  @scala.inline
  def apply(ImageId: WorkspaceImageId): DeleteWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(ImageId = ImageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteWorkspaceImageRequest]
  }
}

