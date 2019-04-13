package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateNetworkProfileResult extends js.Object {
  /**
    * A list of the available network profiles.
    */
  var networkProfile: js.UndefOr[NetworkProfile] = js.undefined
}

object UpdateNetworkProfileResult {
  @scala.inline
  def apply(networkProfile: NetworkProfile = null): UpdateNetworkProfileResult = {
    val __obj = js.Dynamic.literal()
    if (networkProfile != null) __obj.updateDynamic("networkProfile")(networkProfile)
    __obj.asInstanceOf[UpdateNetworkProfileResult]
  }
}

