package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFindingsRequest extends js.Object {
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings you want to list.
    */
  var DetectorId: __string
  /**
    * Represents the criteria used for querying findings.
    */
  var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 50. The maximum value is 50.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the ListFindings action. For subsequent calls to the action fill nextToken in the request with the value of nextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Represents the criteria used for sorting findings.
    */
  var SortCriteria: js.UndefOr[SortCriteria] = js.undefined
}

object ListFindingsRequest {
  @scala.inline
  def apply(
    DetectorId: __string,
    FindingCriteria: FindingCriteria = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    SortCriteria: SortCriteria = null
  ): ListFindingsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
    if (FindingCriteria != null) __obj.updateDynamic("FindingCriteria")(FindingCriteria)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SortCriteria != null) __obj.updateDynamic("SortCriteria")(SortCriteria)
    __obj.asInstanceOf[ListFindingsRequest]
  }
}

