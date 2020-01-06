package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteGlobalNetworkResponse extends js.Object {
  /**
    * Information about the global network.
    */
  var GlobalNetwork: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.GlobalNetwork] = js.native
}

object DeleteGlobalNetworkResponse {
  @scala.inline
  def apply(GlobalNetwork: GlobalNetwork = null): DeleteGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetwork != null) __obj.updateDynamic("GlobalNetwork")(GlobalNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGlobalNetworkResponse]
  }
}

