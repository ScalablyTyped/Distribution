package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkersWithQualificationTypeRequest extends js.Object {
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.undefined
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ID of the Qualification type of the Qualifications to return.
    */
  var QualificationTypeId: EntityId
  /**
    *  The status of the Qualifications to return. Can be Granted | Revoked. 
    */
  var Status: js.UndefOr[QualificationStatus] = js.undefined
}

object ListWorkersWithQualificationTypeRequest {
  @scala.inline
  def apply(
    QualificationTypeId: EntityId,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    Status: QualificationStatus = null
  ): ListWorkersWithQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersWithQualificationTypeRequest]
  }
}

