package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkProfileResult extends js.Object {
  /**
    * The network profile that is returned by the create network profile request.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
}

object CreateNetworkProfileResult {
  @scala.inline
  def apply(networkProfile: NetworkProfile = null): CreateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile)
    __obj.asInstanceOf[CreateNetworkProfileResult]
  }
}

