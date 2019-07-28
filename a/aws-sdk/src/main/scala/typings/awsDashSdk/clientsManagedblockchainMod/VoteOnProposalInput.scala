package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VoteOnProposalInput extends js.Object {
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString
  /**
    *  The value of the vote. 
    */
  var Vote: VoteValue
  /**
    * The unique identifier of the member casting the vote. 
    */
  var VoterMemberId: ResourceIdString
}

object VoteOnProposalInput {
  @scala.inline
  def apply(
    NetworkId: ResourceIdString,
    ProposalId: ResourceIdString,
    Vote: VoteValue,
    VoterMemberId: ResourceIdString
  ): VoteOnProposalInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId, ProposalId = ProposalId, Vote = Vote.asInstanceOf[js.Any], VoterMemberId = VoterMemberId)
  
    __obj.asInstanceOf[VoteOnProposalInput]
  }
}

