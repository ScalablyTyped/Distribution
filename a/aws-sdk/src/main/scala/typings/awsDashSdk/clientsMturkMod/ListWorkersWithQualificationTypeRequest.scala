package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListWorkersWithQualificationTypeRequest extends js.Object {
  /**
    *  Limit the number of results returned. 
    */
  var MaxResults: js.UndefOr[ResultSize] = js.native
  /**
    * Pagination Token
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The ID of the Qualification type of the Qualifications to return.
    */
  var QualificationTypeId: EntityId = js.native
  /**
    *  The status of the Qualifications to return. Can be Granted | Revoked. 
    */
  var Status: js.UndefOr[QualificationStatus] = js.native
}

object ListWorkersWithQualificationTypeRequest {
  @scala.inline
  def apply(
    QualificationTypeId: EntityId,
    MaxResults: Int | Double = null,
    NextToken: PaginationToken = null,
    Status: QualificationStatus = null
  ): ListWorkersWithQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(QualificationTypeId = QualificationTypeId.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListWorkersWithQualificationTypeRequest]
  }
}

