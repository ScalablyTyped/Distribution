package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRootFoldersResponse extends js.Object {
  /**
    * The user's special folders.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.native
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object DescribeRootFoldersResponse {
  @scala.inline
  def apply(Folders: FolderMetadataList = null, Marker: PageMarkerType = null): DescribeRootFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (Folders != null) __obj.updateDynamic("Folders")(Folders.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRootFoldersResponse]
  }
}

