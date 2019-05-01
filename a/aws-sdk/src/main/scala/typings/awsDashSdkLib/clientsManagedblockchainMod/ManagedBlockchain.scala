package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedBlockchain
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ManagedBlockchain: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a member within a Managed Blockchain network.
    */
  def createMember(): awsDashSdkLib.libRequestMod.Request[CreateMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMember(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMemberOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a member within a Managed Blockchain network.
    */
  def createMember(params: CreateMemberInput): awsDashSdkLib.libRequestMod.Request[CreateMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createMember(
    params: CreateMemberInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateMemberOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new blockchain network using Amazon Managed Blockchain.
    */
  def createNetwork(): awsDashSdkLib.libRequestMod.Request[CreateNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNetwork(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNetworkOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new blockchain network using Amazon Managed Blockchain.
    */
  def createNetwork(params: CreateNetworkInput): awsDashSdkLib.libRequestMod.Request[CreateNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNetwork(
    params: CreateNetworkInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNetworkOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a peer node in a member.
    */
  def createNode(): awsDashSdkLib.libRequestMod.Request[CreateNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a peer node in a member.
    */
  def createNode(params: CreateNodeInput): awsDashSdkLib.libRequestMod.Request[CreateNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createNode(
    params: CreateNodeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a proposal for a change to the network that other members of the network can vote on, for example, a proposal to add a new member to the network. Any member can create a proposal.
    */
  def createProposal(): awsDashSdkLib.libRequestMod.Request[CreateProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProposal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProposalOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a proposal for a change to the network that other members of the network can vote on, for example, a proposal to add a new member to the network. Any member can create a proposal.
    */
  def createProposal(params: CreateProposalInput): awsDashSdkLib.libRequestMod.Request[CreateProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createProposal(
    params: CreateProposalInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateProposalOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a member. Deleting a member removes the member and all associated resources from the network. DeleteMember can only be called for a specified MemberId if the principal performing the action is associated with the AWS account that owns the member. In all other cases, the DeleteMember action is carried out as the result of an approved proposal to remove a member. If MemberId is the last member in a network specified by the last AWS account, the network is deleted also.
    */
  def deleteMember(): awsDashSdkLib.libRequestMod.Request[DeleteMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMember(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMemberOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a member. Deleting a member removes the member and all associated resources from the network. DeleteMember can only be called for a specified MemberId if the principal performing the action is associated with the AWS account that owns the member. In all other cases, the DeleteMember action is carried out as the result of an approved proposal to remove a member. If MemberId is the last member in a network specified by the last AWS account, the network is deleted also.
    */
  def deleteMember(params: DeleteMemberInput): awsDashSdkLib.libRequestMod.Request[DeleteMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteMember(
    params: DeleteMemberInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteMemberOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be recovered.
    */
  def deleteNode(): awsDashSdkLib.libRequestMod.Request[DeleteNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a peer node from a member that your AWS account owns. All data on the node is lost and cannot be recovered.
    */
  def deleteNode(params: DeleteNodeInput): awsDashSdkLib.libRequestMod.Request[DeleteNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteNode(
    params: DeleteNodeInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteNodeOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a member.
    */
  def getMember(): awsDashSdkLib.libRequestMod.Request[GetMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMember(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetMemberOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a member.
    */
  def getMember(params: GetMemberInput): awsDashSdkLib.libRequestMod.Request[GetMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getMember(
    params: GetMemberInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetMemberOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetMemberOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a network.
    */
  def getNetwork(): awsDashSdkLib.libRequestMod.Request[GetNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNetwork(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNetworkOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a network.
    */
  def getNetwork(params: GetNetworkInput): awsDashSdkLib.libRequestMod.Request[GetNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNetwork(
    params: GetNetworkInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetNetworkOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetNetworkOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a peer node.
    */
  def getNode(): awsDashSdkLib.libRequestMod.Request[GetNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNode(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetNodeOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a peer node.
    */
  def getNode(params: GetNodeInput): awsDashSdkLib.libRequestMod.Request[GetNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getNode(
    params: GetNodeInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetNodeOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetNodeOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a proposal.
    */
  def getProposal(): awsDashSdkLib.libRequestMod.Request[GetProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getProposal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetProposalOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns detailed information about a proposal.
    */
  def getProposal(params: GetProposalInput): awsDashSdkLib.libRequestMod.Request[GetProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getProposal(
    params: GetProposalInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetProposalOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a listing of all invitations made on the specified network.
    */
  def listInvitations(): awsDashSdkLib.libRequestMod.Request[ListInvitationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvitations(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvitationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvitationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a listing of all invitations made on the specified network.
    */
  def listInvitations(params: ListInvitationsInput): awsDashSdkLib.libRequestMod.Request[ListInvitationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listInvitations(
    params: ListInvitationsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListInvitationsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListInvitationsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a listing of the members in a network and properties of their configurations.
    */
  def listMembers(): awsDashSdkLib.libRequestMod.Request[ListMembersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMembers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMembersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMembersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a listing of the members in a network and properties of their configurations.
    */
  def listMembers(params: ListMembersInput): awsDashSdkLib.libRequestMod.Request[ListMembersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listMembers(
    params: ListMembersInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListMembersOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListMembersOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the networks in which the current AWS account has members.
    */
  def listNetworks(): awsDashSdkLib.libRequestMod.Request[ListNetworksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNetworks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNetworksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNetworksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the networks in which the current AWS account has members.
    */
  def listNetworks(params: ListNetworksInput): awsDashSdkLib.libRequestMod.Request[ListNetworksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNetworks(
    params: ListNetworksInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListNetworksOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListNetworksOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the nodes within a network.
    */
  def listNodes(): awsDashSdkLib.libRequestMod.Request[ListNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNodes(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListNodesOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the nodes within a network.
    */
  def listNodes(params: ListNodesInput): awsDashSdkLib.libRequestMod.Request[ListNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listNodes(
    params: ListNodesInput,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ ListNodesOutput, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[ListNodesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier of the member that cast the vote.
    */
  def listProposalVotes(): awsDashSdkLib.libRequestMod.Request[ListProposalVotesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProposalVotes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProposalVotesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProposalVotesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the listing of votes for a specified proposal, including the value of each vote and the unique identifier of the member that cast the vote.
    */
  def listProposalVotes(params: ListProposalVotesInput): awsDashSdkLib.libRequestMod.Request[ListProposalVotesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProposalVotes(
    params: ListProposalVotesInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProposalVotesOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProposalVotesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a listing of proposals for the network.
    */
  def listProposals(): awsDashSdkLib.libRequestMod.Request[ListProposalsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProposals(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProposalsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProposalsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a listing of proposals for the network.
    */
  def listProposals(params: ListProposalsInput): awsDashSdkLib.libRequestMod.Request[ListProposalsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listProposals(
    params: ListProposalsInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListProposalsOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListProposalsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has received an invitation to create a member and join a network.
    */
  def rejectInvitation(): awsDashSdkLib.libRequestMod.Request[RejectInvitationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectInvitationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectInvitationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Rejects an invitation to join a network. This action can be called by a principal in an AWS account that has received an invitation to create a member and join a network.
    */
  def rejectInvitation(params: RejectInvitationInput): awsDashSdkLib.libRequestMod.Request[RejectInvitationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def rejectInvitation(
    params: RejectInvitationInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RejectInvitationOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RejectInvitationOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by VoterMemberId, must be in the same AWS account as the principal that calls the action.
    */
  def voteOnProposal(): awsDashSdkLib.libRequestMod.Request[VoteOnProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def voteOnProposal(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VoteOnProposalOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VoteOnProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by VoterMemberId, must be in the same AWS account as the principal that calls the action.
    */
  def voteOnProposal(params: VoteOnProposalInput): awsDashSdkLib.libRequestMod.Request[VoteOnProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def voteOnProposal(
    params: VoteOnProposalInput,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VoteOnProposalOutput, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VoteOnProposalOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

