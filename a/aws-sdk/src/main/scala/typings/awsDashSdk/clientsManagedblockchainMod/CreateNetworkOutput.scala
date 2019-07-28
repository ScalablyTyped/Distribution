package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNetworkOutput extends js.Object {
  /**
    * The unique identifier for the first member within the network.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.undefined
  /**
    * The unique identifier for the network.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.undefined
}

object CreateNetworkOutput {
  @scala.inline
  def apply(MemberId: ResourceIdString = null, NetworkId: ResourceIdString = null): CreateNetworkOutput = {
    val __obj = js.Dynamic.literal()
    if (MemberId != null) __obj.updateDynamic("MemberId")(MemberId)
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId)
    __obj.asInstanceOf[CreateNetworkOutput]
  }
}

