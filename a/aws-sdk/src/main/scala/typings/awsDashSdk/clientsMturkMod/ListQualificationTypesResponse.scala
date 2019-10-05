package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListQualificationTypesResponse extends js.Object {
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The number of Qualification types on this page in the filtered results list, equivalent to the number of types this operation returns. 
    */
  var NumResults: js.UndefOr[Integer] = js.undefined
  /**
    *  The list of QualificationType elements returned by the query. 
    */
  var QualificationTypes: js.UndefOr[QualificationTypeList] = js.undefined
}

object ListQualificationTypesResponse {
  @scala.inline
  def apply(
    NextToken: PaginationToken = null,
    NumResults: Int | Double = null,
    QualificationTypes: QualificationTypeList = null
  ): ListQualificationTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (NumResults != null) __obj.updateDynamic("NumResults")(NumResults.asInstanceOf[js.Any])
    if (QualificationTypes != null) __obj.updateDynamic("QualificationTypes")(QualificationTypes)
    __obj.asInstanceOf[ListQualificationTypesResponse]
  }
}

