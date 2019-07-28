package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkOutput extends js.Object {
  /**
    * An object containing network configuration parameters.
    */
  var Network: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.Network] = js.undefined
}

object GetNetworkOutput {
  @scala.inline
  def apply(Network: Network = null): GetNetworkOutput = {
    val __obj = js.Dynamic.literal()
    if (Network != null) __obj.updateDynamic("Network")(Network)
    __obj.asInstanceOf[GetNetworkOutput]
  }
}

