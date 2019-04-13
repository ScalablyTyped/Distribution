package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRootFoldersResponse extends js.Object {
  /**
    * The user's special folders.
    */
  var Folders: js.UndefOr[FolderMetadataList] = js.undefined
  /**
    * The marker for the next set of results.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}

object DescribeRootFoldersResponse {
  @scala.inline
  def apply(Folders: FolderMetadataList = null, Marker: PageMarkerType = null): DescribeRootFoldersResponse = {
    val __obj = js.Dynamic.literal()
    if (Folders != null) __obj.updateDynamic("Folders")(Folders)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeRootFoldersResponse]
  }
}

