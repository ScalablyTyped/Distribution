package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNodeInput extends js.Object {
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  /**
    * The unique identifier of the member that owns this node.
    */
  var MemberId: ResourceIdString
  /**
    * The unique identifier of the network in which this node runs.
    */
  var NetworkId: ResourceIdString
  /**
    * The properties of a node configuration.
    */
  var NodeConfiguration: awsDashSdkLib.clientsManagedblockchainMod.NodeConfiguration
}

object CreateNodeInput {
  @scala.inline
  def apply(
    ClientRequestToken: ClientRequestTokenString,
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    NodeConfiguration: NodeConfiguration
  ): CreateNodeInput = {
    val __obj = js.Dynamic.literal(ClientRequestToken = ClientRequestToken, MemberId = MemberId, NetworkId = NetworkId, NodeConfiguration = NodeConfiguration)
  
    __obj.asInstanceOf[CreateNodeInput]
  }
}

