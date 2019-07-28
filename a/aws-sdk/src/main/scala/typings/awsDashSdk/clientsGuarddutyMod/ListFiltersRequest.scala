package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFiltersRequest extends js.Object {
  /**
    * The unique ID of the detector the filter is associated with.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 50. The maximum value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.MaxResults] = js.undefined
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the list action. For subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListFiltersRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null
  ): ListFiltersRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFiltersRequest]
  }
}

