package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateGlobalNetworkResponse extends js.Object {
  /**
    * Information about the global network object.
    */
  var GlobalNetwork: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.GlobalNetwork] = js.native
}

object CreateGlobalNetworkResponse {
  @scala.inline
  def apply(GlobalNetwork: GlobalNetwork = null): CreateGlobalNetworkResponse = {
    val __obj = js.Dynamic.literal()
    if (GlobalNetwork != null) __obj.updateDynamic("GlobalNetwork")(GlobalNetwork.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalNetworkResponse]
  }
}

