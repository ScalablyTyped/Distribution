package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFolderContentsResponse extends js.Object {
  /**
    * The documents in the specified folder.
    */
  var Documents: js.UndefOr[DocumentMetadataList] = js.undefined
  /**
    * The subfolders in the specified folder.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.undefined
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}

object DescribeFolderContentsResponse {
  @scala.inline
  def apply(
    Documents: DocumentMetadataList = null,
    Folders: FolderMetadataList = null,
    Marker: PageMarkerType = null
  ): DescribeFolderContentsResponse = {
    val __obj = js.Dynamic.literal()
    if (Documents != null) __obj.updateDynamic("Documents")(Documents)
    if (Folders != null) __obj.updateDynamic("Folders")(Folders)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeFolderContentsResponse]
  }
}

