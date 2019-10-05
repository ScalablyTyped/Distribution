package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDocumentVersionsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * Specify "SOURCE" to include initialized versions and a URL for the source document.
    */
  var Fields: js.UndefOr[FieldNamesType] = js.undefined
  /**
    * A comma-separated list of values. Specify "INITIALIZED" to include incomplete versions.
    */
  var Include: js.UndefOr[FieldNamesType] = js.undefined
  /**
    * The maximum number of versions to return with this call.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}

object DescribeDocumentVersionsRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Fields: FieldNamesType = null,
    Include: FieldNamesType = null,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null
  ): DescribeDocumentVersionsRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Fields != null) __obj.updateDynamic("Fields")(Fields)
    if (Include != null) __obj.updateDynamic("Include")(Include)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeDocumentVersionsRequest]
  }
}

