package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListThreatIntelSetsRequest extends js.Object {
  /**
    * The detectorID that specifies the GuardDuty service whose ThreatIntelSets you want to list.
    */
  var DetectorId: __string
  /**
    * You can use this parameter to indicate the maximum number of items that you want in the response. The default value is 7. The maximum value is 7.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * Pagination token to start retrieving threat intel sets from.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListThreatIntelSetsRequest {
  @scala.inline
  def apply(
    DetectorId: __string,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null
  ): ListThreatIntelSetsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListThreatIntelSetsRequest]
  }
}

