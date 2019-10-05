package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRootFoldersRequest extends js.Object {
  /**
    * Amazon WorkDocs authentication token. Do not set this field when using administrative API actions, as in accessing the API using AWS credentials.
    */
  var AuthenticationToken: AuthenticationHeaderType
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[LimitType] = js.undefined
  /**
    * The marker for the next set of results. (You received this marker from a previous call.)
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
}

object DescribeRootFoldersRequest {
  @scala.inline
  def apply(
    AuthenticationToken: AuthenticationHeaderType,
    Limit: Int | Double = null,
    Marker: PageMarkerType = null
  ): DescribeRootFoldersRequest = {
    val __obj = js.Dynamic.literal(AuthenticationToken = AuthenticationToken)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DescribeRootFoldersRequest]
  }
}

