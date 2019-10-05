package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQualificationRequestsRequest extends js.Object {
  /**
    *  The maximum number of results to return in a single call. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ID of the QualificationType.
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.undefined
}

object ListQualificationRequestsRequest {
  @scala.inline
  def apply(
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    QualificationTypeId: EntityId = null
  ): ListQualificationRequestsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId)
    __obj.asInstanceOf[ListQualificationRequestsRequest]
  }
}

