package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkProfileResult extends js.Object {
  /**
    * The network profile.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
}

object GetNetworkProfileResult {
  @scala.inline
  def apply(networkProfile: NetworkProfile = null): GetNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile)
    __obj.asInstanceOf[GetNetworkProfileResult]
  }
}

