package typings
package awsDashSdkLib.clientsWorkspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyWorkspaceImageRequest extends js.Object {
  /**
    * A description of the image.
    */
  var Description: js.UndefOr[WorkspaceImageDescription] = js.undefined
  /**
    * The name of the image.
    */
  var Name: WorkspaceImageName
  /**
    * The identifier of the source image.
    */
  var SourceImageId: WorkspaceImageId
  /**
    * The identifier of the source Region.
    */
  var SourceRegion: Region
  /**
    * The tags for the image.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
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
    val __obj = js.Dynamic.literal(Name = Name, SourceImageId = SourceImageId, SourceRegion = SourceRegion)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CopyWorkspaceImageRequest]
  }
}

