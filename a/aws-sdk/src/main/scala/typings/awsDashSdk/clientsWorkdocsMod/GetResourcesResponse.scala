package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResourcesResponse extends js.Object {
  /**
    * The documents in the specified collection.
    */
  var Documents: js.UndefOr[DocumentMetadataList] = js.native
  /**
    * The folders in the specified folder.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object GetResourcesResponse {
  @scala.inline
  def apply(
    Documents: DocumentMetadataList = null,
    Folders: FolderMetadataList = null,
    Marker: PageMarkerType = null
  ): GetResourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (Documents != null) __obj.updateDynamic("Documents")(Documents.asInstanceOf[js.Any])
    if (Folders != null) __obj.updateDynamic("Folders")(Folders.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcesResponse]
  }
}

