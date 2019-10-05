package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListWorkersWithQualificationTypeResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The number of Qualifications on this page in the filtered results list, equivalent to the number of Qualifications being returned by this call.
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  /**
    *  The list of Qualification elements returned by this call. 
    */
  var Qualifications: js.UndefOr[QualificationList] = js.undefined
}

object ListWorkersWithQualificationTypeResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: Int | Double = null,
    Qualifications: QualificationList = null
  ): ListWorkersWithQualificationTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (NumResults != null) __obj.updateDynamic("NumResults")(NumResults.asInstanceOf[js.Any])
    if (Qualifications != null) __obj.updateDynamic("Qualifications")(Qualifications)
    __obj.asInstanceOf[ListWorkersWithQualificationTypeResponse]
  }
}

