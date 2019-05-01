package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkInput extends js.Object {
  /**
    * The unique identifier of the network to get information about.
    */
  var NetworkId: ResourceIdString
}

object GetNetworkInput {
  @scala.inline
  def apply(NetworkId: ResourceIdString): GetNetworkInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId)
  
    __obj.asInstanceOf[GetNetworkInput]
  }
}

