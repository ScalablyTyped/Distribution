package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkProfileResponse extends js.Object {
  /**
    * The network profile associated with a device.
    */
  var NetworkProfile: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.NetworkProfile] = js.undefined
}

object GetNetworkProfileResponse {
  @scala.inline
  def apply(NetworkProfile: NetworkProfile = null): GetNetworkProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (NetworkProfile != null) __obj.updateDynamic("NetworkProfile")(NetworkProfile)
    __obj.asInstanceOf[GetNetworkProfileResponse]
  }
}

