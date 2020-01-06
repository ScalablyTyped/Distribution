package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFolderResponse extends js.Object {
  /**
    * The custom metadata on the folder.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.native
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.native
}

object GetFolderResponse {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap = null, Metadata: FolderMetadata = null): GetFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomMetadata != null) __obj.updateDynamic("CustomMetadata")(CustomMetadata.asInstanceOf[js.Any])
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFolderResponse]
  }
}

