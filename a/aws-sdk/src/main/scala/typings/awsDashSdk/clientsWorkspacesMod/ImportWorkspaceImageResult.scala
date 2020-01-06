package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportWorkspaceImageResult extends js.Object {
  /**
    * The identifier of the WorkSpace image.
    */
  var ImageId: js.UndefOr[WorkspaceImageId] = js.native
}

object ImportWorkspaceImageResult {
  @scala.inline
  def apply(ImageId: WorkspaceImageId = null): ImportWorkspaceImageResult = {
    val __obj = js.Dynamic.literal()
    if (ImageId != null) __obj.updateDynamic("ImageId")(ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportWorkspaceImageResult]
  }
}

