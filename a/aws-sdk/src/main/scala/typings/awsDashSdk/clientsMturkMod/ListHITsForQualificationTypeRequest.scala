package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListHITsForQualificationTypeRequest extends js.Object {
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The ID of the Qualification type to use when querying HITs. 
    */
  var QualificationTypeId: EntityId
}

object ListHITsForQualificationTypeRequest {
  @scala.inline
  def apply(
    QualificationTypeId: EntityId,
    MaxResults: js.UndefOr[ResultSize] = js.undefined,
    NextToken: PaginationToken = null
  ): ListHITsForQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListHITsForQualificationTypeRequest]
  }
}

