package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProposalInput extends js.Object {
  /**
    * The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: ResourceIdString
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: ResourceIdString
}

object GetProposalInput {
  @scala.inline
  def apply(NetworkId: ResourceIdString, ProposalId: ResourceIdString): GetProposalInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId, ProposalId = ProposalId)
  
    __obj.asInstanceOf[GetProposalInput]
  }
}

