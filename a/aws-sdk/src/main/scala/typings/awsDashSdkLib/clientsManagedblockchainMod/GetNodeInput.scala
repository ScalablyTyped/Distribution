package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNodeInput extends js.Object {
  /**
    * The unique identifier of the member that owns the node.
    */
  var MemberId: ResourceIdString
  /**
    * The unique identifier of the network to which the node belongs.
    */
  var NetworkId: ResourceIdString
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString
}

object GetNodeInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): GetNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId, NetworkId = NetworkId, NodeId = NodeId)
  
    __obj.asInstanceOf[GetNodeInput]
  }
}

