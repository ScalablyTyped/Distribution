package typings.awsDashSdk.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyWorkspaceImageRequest extends js.Object {
  /**
    * A description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.native
  /**
    * The name of the image.
    */
  var Name: WorkspaceImageName = js.native
  /**
    * The identifier of the source image.
    */
  var SourceImageId: WorkspaceImageId = js.native
  /**
    * The identifier of the source Region.
    */
  var SourceRegion: Region = js.native
  /**
    * The tags for the image.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CopyWorkspaceImageRequest {
  @scala.inline
  def apply(
    Name: WorkspaceImageName,
    SourceImageId: WorkspaceImageId,
    SourceRegion: Region,
    Description: WorkspaceImageDescription = null,
    Tags: TagList = null
  ): CopyWorkspaceImageRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], SourceImageId = SourceImageId.asInstanceOf[js.Any], SourceRegion = SourceRegion.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyWorkspaceImageRequest]
  }
}

