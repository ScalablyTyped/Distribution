package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInput extends js.Object {
  /**
    * The unique identifier of the network to get information about.
    */
  var NetworkId: ResourceIdString = js.native
}

object GetNetworkInput {
  @scala.inline
  def apply(NetworkId: ResourceIdString): GetNetworkInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetNetworkInput]
  }
}

