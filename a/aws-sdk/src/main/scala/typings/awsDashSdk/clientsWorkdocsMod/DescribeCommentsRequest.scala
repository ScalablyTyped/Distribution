package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCommentsRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: js.UndefOr[AuthenticationHeaderType] = js.undefined
  /**
    * The ID of the document.
    */
  var DocumentId: ResourceIdType
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
  /**
    * The ID of the document version.
    */
  var VersionId: DocumentVersionIdType
}

object DescribeCommentsRequest {
  @scala.inline
  def apply(
    DocumentId: ResourceIdType,
    VersionId: DocumentVersionIdType,
    AuthenticationToken: AuthenticationHeaderType = null,
    Limit: Int | Double = null,
    Marker: MarkerType = null
  ): DescribeCommentsRequest = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, VersionId = VersionId)
    if (AuthenticationToken != null) __obj.updateDynamic("AuthenticationToken")(AuthenticationToken)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeCommentsRequest]
  }
}

