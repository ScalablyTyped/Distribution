package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDocumentVersionsResponse extends js.Object {
  /**
    * The document versions.
    */
  var DocumentVersions: js.UndefOr[DocumentVersionMetadataList] = js.native
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
}

object DescribeDocumentVersionsResponse {
  @scala.inline
  def apply(DocumentVersions: DocumentVersionMetadataList = null, Marker: PageMarkerType = null): DescribeDocumentVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DocumentVersions != null) __obj.updateDynamic("DocumentVersions")(DocumentVersions.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDocumentVersionsResponse]
  }
}

