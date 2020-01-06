package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListNetworkProfilesResult extends js.Object {
  /**
    * A list of the available network profiles.
    */
  var networkProfiles: js.UndefOr[NetworkProfiles] = js.native
  /**
    * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListNetworkProfilesResult {
  @scala.inline
  def apply(networkProfiles: NetworkProfiles = null, nextToken: PaginationToken = null): ListNetworkProfilesResult = {
    val __obj = js.Dynamic.literal()
    if (networkProfiles != null) __obj.updateDynamic("networkProfiles")(networkProfiles.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListNetworkProfilesResult]
  }
}

