package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWorkspaceImageResult extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
}

object CopyWorkspaceImageResult {
  @scala.inline
  def apply(ImageId: WorkspaceImageId = null): CopyWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWorkspaceImageResult]
  }
}

