package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteNodeInput extends js.Object {
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString
  /**
    * The unique identifier of the network that the node belongs to.
    */
  var NetworkId: ResourceIdString
  /**
    * The unique identifier of the node.
    */
  var NodeId: ResourceIdString
}

object DeleteNodeInput {
  @scala.inline
  def apply(MemberId: ResourceIdString, NetworkId: ResourceIdString, NodeId: ResourceIdString): DeleteNodeInput = {
    val __obj = js.Dynamic.literal(MemberId = MemberId, NetworkId = NetworkId, NodeId = NodeId)
  
    __obj.asInstanceOf[DeleteNodeInput]
  }
}

