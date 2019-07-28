package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchProfilesResponse extends js.Object {
  /**
    * The token returned to indicate that there is more data available.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.undefined
  /**
    * The profiles that meet the specified set of filter criteria, in sort order.
    */
  var Profiles: js.UndefOr[ProfileDataList] = js.undefined
  /**
    * The total number of room profiles returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.undefined
}

object SearchProfilesResponse {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    Profiles: ProfileDataList = null,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): SearchProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Profiles != null) __obj.updateDynamic("Profiles")(Profiles)
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount)
    __obj.asInstanceOf[SearchProfilesResponse]
  }
}

