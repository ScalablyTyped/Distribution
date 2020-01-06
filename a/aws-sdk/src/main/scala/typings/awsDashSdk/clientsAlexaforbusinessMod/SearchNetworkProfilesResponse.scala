package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchNetworkProfilesResponse extends js.Object {
  /**
    * The network profiles that meet the specified set of filter criteria, in sort order. It is a list of NetworkProfileData objects. 
    */
  var NetworkProfiles: js.UndefOr[NetworkProfileDataList] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NextToken] = js.native
  /**
    * The total number of network profiles returned.
    */
  var TotalCount: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.TotalCount] = js.native
}

object SearchNetworkProfilesResponse {
  @scala.inline
  def apply(
    NetworkProfiles: NetworkProfileDataList = null,
    NextToken: NextToken = null,
    TotalCount: Int | Double = null
  ): SearchNetworkProfilesResponse = {
    val __obj = js.Dynamic.literal()
    if (NetworkProfiles != null) __obj.updateDynamic("NetworkProfiles")(NetworkProfiles.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TotalCount != null) __obj.updateDynamic("TotalCount")(TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchNetworkProfilesResponse]
  }
}

