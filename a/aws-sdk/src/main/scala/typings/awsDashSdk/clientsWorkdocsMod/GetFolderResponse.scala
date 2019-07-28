package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFolderResponse extends js.Object {
  /**
    * The custom metadata on the folder.
    */
  var CustomMetadata: js.UndefOr[CustomMetadataMap] = js.undefined
  /**
    * The metadata of the folder.
    */
  var Metadata: js.UndefOr[FolderMetadata] = js.undefined
}

object GetFolderResponse {
  @scala.inline
  def apply(CustomMetadata: CustomMetadataMap = null, Metadata: FolderMetadata = null): GetFolderResponse = {
    val __obj = js.Dynamic.literal()
    if (CustomMetadata != null) __obj.updateDynamic("CustomMetadata")(CustomMetadata)
    if (Metadata != null) __obj.updateDynamic("Metadata")(Metadata)
    __obj.asInstanceOf[GetFolderResponse]
  }
}

