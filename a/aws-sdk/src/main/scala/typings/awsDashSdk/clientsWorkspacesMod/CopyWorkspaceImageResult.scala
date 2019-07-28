package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyWorkspaceImageResult extends js.Object {
  /**
    * The identifier of the image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.undefined
}

object CopyWorkspaceImageResult {
  @scala.inline
  def apply(ImageId: WorkspaceImageId = null): CopyWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId)
    __obj.asInstanceOf[CopyWorkspaceImageResult]
  }
}

