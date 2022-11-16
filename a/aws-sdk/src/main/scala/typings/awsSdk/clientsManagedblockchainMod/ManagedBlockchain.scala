package typings.awsSdk.clientsManagedblockchainMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedBlockchain extends Service {
  
  @JSName("config")
  var config_ManagedBlockchain: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Creates a new accessor for use with Managed Blockchain Ethereum nodes. An accessor object is a container that has the information required for token based access to your Ethereum nodes.
    */
  def createAccessor(): Request[CreateAccessorOutput, AWSError] = js.native
  def createAccessor(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessorOutput, Unit]): Request[CreateAccessorOutput, AWSError] = js.native
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Creates a new accessor for use with Managed Blockchain Ethereum nodes. An accessor object is a container that has the information required for token based access to your Ethereum nodes.
    */
  def createAccessor(params: CreateAccessorInput): Request[CreateAccessorOutput, AWSError] = js.native
  def createAccessor(
    params: CreateAccessorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccessorOutput, Unit]
  ): Request[CreateAccessorOutput, AWSError] = js.native
  
  /**
    * Creates a member within a Managed Blockchain network. Applies only to Hyperledger Fabric.
    */
  def createMember(): Request[CreateMemberOutput, AWSError] = js.native
  def createMember(callback: js.Function2[/* err */ AWSError, /* data */ CreateMemberOutput, Unit]): Request[CreateMemberOutput, AWSError] = js.native
  /**
    * Creates a member within a Managed Blockchain network. Applies only to Hyperledger Fabric.
    */
  def createMember(params: CreateMemberInput): Request[CreateMemberOutput, AWSError] = js.native
  def createMember(
    params: CreateMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMemberOutput, Unit]
  ): Request[CreateMemberOutput, AWSError] = js.native
  
  /**
    * Creates a new blockchain network using Amazon Managed Blockchain. Applies only to Hyperledger Fabric.
    */
  def createNetwork(): Request[CreateNetworkOutput, AWSError] = js.native
  def createNetwork(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkOutput, Unit]): Request[CreateNetworkOutput, AWSError] = js.native
  /**
    * Creates a new blockchain network using Amazon Managed Blockchain. Applies only to Hyperledger Fabric.
    */
  def createNetwork(params: CreateNetworkInput): Request[CreateNetworkOutput, AWSError] = js.native
  def createNetwork(
    params: CreateNetworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkOutput, Unit]
  ): Request[CreateNetworkOutput, AWSError] = js.native
  
  /**
    * Creates a node on the specified blockchain network. Applies to Hyperledger Fabric and Ethereum.
    */
  def createNode(): Request[CreateNodeOutput, AWSError] = js.native
  def createNode(callback: js.Function2[/* err */ AWSError, /* data */ CreateNodeOutput, Unit]): Request[CreateNodeOutput, AWSError] = js.native
  /**
    * Creates a node on the specified blockchain network. Applies to Hyperledger Fabric and Ethereum.
    */
  def createNode(params: CreateNodeInput): Request[CreateNodeOutput, AWSError] = js.native
  def createNode(
    params: CreateNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNodeOutput, Unit]
  ): Request[CreateNodeOutput, AWSError] = js.native
  
  /**
    * Creates a proposal for a change to the network that other members of the network can vote on, for example, a proposal to add a new member to the network. Any member can create a proposal. Applies only to Hyperledger Fabric.
    */
  def createProposal(): Request[CreateProposalOutput, AWSError] = js.native
  def createProposal(callback: js.Function2[/* err */ AWSError, /* data */ CreateProposalOutput, Unit]): Request[CreateProposalOutput, AWSError] = js.native
  /**
    * Creates a proposal for a change to the network that other members of the network can vote on, for example, a proposal to add a new member to the network. Any member can create a proposal. Applies only to Hyperledger Fabric.
    */
  def createProposal(params: CreateProposalInput): Request[CreateProposalOutput, AWSError] = js.native
  def createProposal(
    params: CreateProposalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProposalOutput, Unit]
  ): Request[CreateProposalOutput, AWSError] = js.native
  
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Deletes an accessor that your Amazon Web Services account owns. An accessor object is a container that has the information required for token based access to your Ethereum nodes including, the BILLING_TOKEN. After an accessor is deleted, the status of the accessor changes from AVAILABLE to PENDING_DELETION. An accessor in the PENDING_DELETION state can’t be used for new WebSocket requests or HTTP requests. However, WebSocket connections that were initiated while the accessor was in the AVAILABLE state remain open until they expire (up to 2 hours).
    */
  def deleteAccessor(): Request[DeleteAccessorOutput, AWSError] = js.native
  def deleteAccessor(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessorOutput, Unit]): Request[DeleteAccessorOutput, AWSError] = js.native
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Deletes an accessor that your Amazon Web Services account owns. An accessor object is a container that has the information required for token based access to your Ethereum nodes including, the BILLING_TOKEN. After an accessor is deleted, the status of the accessor changes from AVAILABLE to PENDING_DELETION. An accessor in the PENDING_DELETION state can’t be used for new WebSocket requests or HTTP requests. However, WebSocket connections that were initiated while the accessor was in the AVAILABLE state remain open until they expire (up to 2 hours).
    */
  def deleteAccessor(params: DeleteAccessorInput): Request[DeleteAccessorOutput, AWSError] = js.native
  def deleteAccessor(
    params: DeleteAccessorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccessorOutput, Unit]
  ): Request[DeleteAccessorOutput, AWSError] = js.native
  
  /**
    * Deletes a member. Deleting a member removes the member and all associated resources from the network. DeleteMember can only be called for a specified MemberId if the principal performing the action is associated with the Amazon Web Services account that owns the member. In all other cases, the DeleteMember action is carried out as the result of an approved proposal to remove a member. If MemberId is the last member in a network specified by the last Amazon Web Services account, the network is deleted also. Applies only to Hyperledger Fabric.
    */
  def deleteMember(): Request[DeleteMemberOutput, AWSError] = js.native
  def deleteMember(callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberOutput, Unit]): Request[DeleteMemberOutput, AWSError] = js.native
  /**
    * Deletes a member. Deleting a member removes the member and all associated resources from the network. DeleteMember can only be called for a specified MemberId if the principal performing the action is associated with the Amazon Web Services account that owns the member. In all other cases, the DeleteMember action is carried out as the result of an approved proposal to remove a member. If MemberId is the last member in a network specified by the last Amazon Web Services account, the network is deleted also. Applies only to Hyperledger Fabric.
    */
  def deleteMember(params: DeleteMemberInput): Request[DeleteMemberOutput, AWSError] = js.native
  def deleteMember(
    params: DeleteMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteMemberOutput, Unit]
  ): Request[DeleteMemberOutput, AWSError] = js.native
  
  /**
    * Deletes a node that your Amazon Web Services account owns. All data on the node is lost and cannot be recovered. Applies to Hyperledger Fabric and Ethereum.
    */
  def deleteNode(): Request[DeleteNodeOutput, AWSError] = js.native
  def deleteNode(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNodeOutput, Unit]): Request[DeleteNodeOutput, AWSError] = js.native
  /**
    * Deletes a node that your Amazon Web Services account owns. All data on the node is lost and cannot be recovered. Applies to Hyperledger Fabric and Ethereum.
    */
  def deleteNode(params: DeleteNodeInput): Request[DeleteNodeOutput, AWSError] = js.native
  def deleteNode(
    params: DeleteNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNodeOutput, Unit]
  ): Request[DeleteNodeOutput, AWSError] = js.native
  
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Returns detailed information about an accessor. An accessor object is a container that has the information required for token based access to your Ethereum nodes.
    */
  def getAccessor(): Request[GetAccessorOutput, AWSError] = js.native
  def getAccessor(callback: js.Function2[/* err */ AWSError, /* data */ GetAccessorOutput, Unit]): Request[GetAccessorOutput, AWSError] = js.native
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Returns detailed information about an accessor. An accessor object is a container that has the information required for token based access to your Ethereum nodes.
    */
  def getAccessor(params: GetAccessorInput): Request[GetAccessorOutput, AWSError] = js.native
  def getAccessor(
    params: GetAccessorInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccessorOutput, Unit]
  ): Request[GetAccessorOutput, AWSError] = js.native
  
  /**
    * Returns detailed information about a member. Applies only to Hyperledger Fabric.
    */
  def getMember(): Request[GetMemberOutput, AWSError] = js.native
  def getMember(callback: js.Function2[/* err */ AWSError, /* data */ GetMemberOutput, Unit]): Request[GetMemberOutput, AWSError] = js.native
  /**
    * Returns detailed information about a member. Applies only to Hyperledger Fabric.
    */
  def getMember(params: GetMemberInput): Request[GetMemberOutput, AWSError] = js.native
  def getMember(
    params: GetMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMemberOutput, Unit]
  ): Request[GetMemberOutput, AWSError] = js.native
  
  /**
    * Returns detailed information about a network. Applies to Hyperledger Fabric and Ethereum.
    */
  def getNetwork(): Request[GetNetworkOutput, AWSError] = js.native
  def getNetwork(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkOutput, Unit]): Request[GetNetworkOutput, AWSError] = js.native
  /**
    * Returns detailed information about a network. Applies to Hyperledger Fabric and Ethereum.
    */
  def getNetwork(params: GetNetworkInput): Request[GetNetworkOutput, AWSError] = js.native
  def getNetwork(
    params: GetNetworkInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkOutput, Unit]
  ): Request[GetNetworkOutput, AWSError] = js.native
  
  /**
    * Returns detailed information about a node. Applies to Hyperledger Fabric and Ethereum.
    */
  def getNode(): Request[GetNodeOutput, AWSError] = js.native
  def getNode(callback: js.Function2[/* err */ AWSError, /* data */ GetNodeOutput, Unit]): Request[GetNodeOutput, AWSError] = js.native
  /**
    * Returns detailed information about a node. Applies to Hyperledger Fabric and Ethereum.
    */
  def getNode(params: GetNodeInput): Request[GetNodeOutput, AWSError] = js.native
  def getNode(params: GetNodeInput, callback: js.Function2[/* err */ AWSError, /* data */ GetNodeOutput, Unit]): Request[GetNodeOutput, AWSError] = js.native
  
  /**
    * Returns detailed information about a proposal. Applies only to Hyperledger Fabric.
    */
  def getProposal(): Request[GetProposalOutput, AWSError] = js.native
  def getProposal(callback: js.Function2[/* err */ AWSError, /* data */ GetProposalOutput, Unit]): Request[GetProposalOutput, AWSError] = js.native
  /**
    * Returns detailed information about a proposal. Applies only to Hyperledger Fabric.
    */
  def getProposal(params: GetProposalInput): Request[GetProposalOutput, AWSError] = js.native
  def getProposal(
    params: GetProposalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProposalOutput, Unit]
  ): Request[GetProposalOutput, AWSError] = js.native
  
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Returns a list of the accessors and their properties. Accessor objects are containers that have the information required for token based access to your Ethereum nodes.
    */
  def listAccessors(): Request[ListAccessorsOutput, AWSError] = js.native
  def listAccessors(callback: js.Function2[/* err */ AWSError, /* data */ ListAccessorsOutput, Unit]): Request[ListAccessorsOutput, AWSError] = js.native
  /**
    *  The token based access feature is in preview release for Ethereum on Amazon Managed Blockchain and is subject to change. We recommend that you use this feature only with test scenarios, and not in production environments.  Returns a list of the accessors and their properties. Accessor objects are containers that have the information required for token based access to your Ethereum nodes.
    */
  def listAccessors(params: ListAccessorsInput): Request[ListAccessorsOutput, AWSError] = js.native
  def listAccessors(
    params: ListAccessorsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccessorsOutput, Unit]
  ): Request[ListAccessorsOutput, AWSError] = js.native
  
  /**
    * Returns a list of all invitations for the current Amazon Web Services account. Applies only to Hyperledger Fabric.
    */
  def listInvitations(): Request[ListInvitationsOutput, AWSError] = js.native
  def listInvitations(callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsOutput, Unit]): Request[ListInvitationsOutput, AWSError] = js.native
  /**
    * Returns a list of all invitations for the current Amazon Web Services account. Applies only to Hyperledger Fabric.
    */
  def listInvitations(params: ListInvitationsInput): Request[ListInvitationsOutput, AWSError] = js.native
  def listInvitations(
    params: ListInvitationsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListInvitationsOutput, Unit]
  ): Request[ListInvitationsOutput, AWSError] = js.native
  
  /**
    * Returns a list of the members in a network and properties of their configurations. Applies only to Hyperledger Fabric.
    */
  def listMembers(): Request[ListMembersOutput, AWSError] = js.native
  def listMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListMembersOutput, Unit]): Request[ListMembersOutput, AWSError] = js.native
  /**
    * Returns a list of the members in a network and properties of their configurations. Applies only to Hyperledger Fabric.
    */
  def listMembers(params: ListMembersInput): Request[ListMembersOutput, AWSError] = js.native
  def listMembers(
    params: ListMembersInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMembersOutput, Unit]
  ): Request[ListMembersOutput, AWSError] = js.native
  
  /**
    * Returns information about the networks in which the current Amazon Web Services account participates. Applies to Hyperledger Fabric and Ethereum.
    */
  def listNetworks(): Request[ListNetworksOutput, AWSError] = js.native
  def listNetworks(callback: js.Function2[/* err */ AWSError, /* data */ ListNetworksOutput, Unit]): Request[ListNetworksOutput, AWSError] = js.native
  /**
    * Returns information about the networks in which the current Amazon Web Services account participates. Applies to Hyperledger Fabric and Ethereum.
    */
  def listNetworks(params: ListNetworksInput): Request[ListNetworksOutput, AWSError] = js.native
  def listNetworks(
    params: ListNetworksInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNetworksOutput, Unit]
  ): Request[ListNetworksOutput, AWSError] = js.native
  
  /**
    * Returns information about the nodes within a network. Applies to Hyperledger Fabric and Ethereum.
    */
  def listNodes(): Request[ListNodesOutput, AWSError] = js.native
  def listNodes(callback: js.Function2[/* err */ AWSError, /* data */ ListNodesOutput, Unit]): Request[ListNodesOutput, AWSError] = js.native
  /**
    * Returns information about the nodes within a network. Applies to Hyperledger Fabric and Ethereum.
    */
  def listNodes(params: ListNodesInput): Request[ListNodesOutput, AWSError] = js.native
  def listNodes(
    params: ListNodesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListNodesOutput, Unit]
  ): Request[ListNodesOutput, AWSError] = js.native
  
  /**
    * Returns the list of votes for a specified proposal, including the value of each vote and the unique identifier of the member that cast the vote. Applies only to Hyperledger Fabric.
    */
  def listProposalVotes(): Request[ListProposalVotesOutput, AWSError] = js.native
  def listProposalVotes(callback: js.Function2[/* err */ AWSError, /* data */ ListProposalVotesOutput, Unit]): Request[ListProposalVotesOutput, AWSError] = js.native
  /**
    * Returns the list of votes for a specified proposal, including the value of each vote and the unique identifier of the member that cast the vote. Applies only to Hyperledger Fabric.
    */
  def listProposalVotes(params: ListProposalVotesInput): Request[ListProposalVotesOutput, AWSError] = js.native
  def listProposalVotes(
    params: ListProposalVotesInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProposalVotesOutput, Unit]
  ): Request[ListProposalVotesOutput, AWSError] = js.native
  
  /**
    * Returns a list of proposals for the network. Applies only to Hyperledger Fabric.
    */
  def listProposals(): Request[ListProposalsOutput, AWSError] = js.native
  def listProposals(callback: js.Function2[/* err */ AWSError, /* data */ ListProposalsOutput, Unit]): Request[ListProposalsOutput, AWSError] = js.native
  /**
    * Returns a list of proposals for the network. Applies only to Hyperledger Fabric.
    */
  def listProposals(params: ListProposalsInput): Request[ListProposalsOutput, AWSError] = js.native
  def listProposals(
    params: ListProposalsInput,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProposalsOutput, Unit]
  ): Request[ListProposalsOutput, AWSError] = js.native
  
  /**
    * Returns a list of tags for the specified resource. Each tag consists of a key and optional value. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Returns a list of tags for the specified resource. Each tag consists of a key and optional value. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Rejects an invitation to join a network. This action can be called by a principal in an Amazon Web Services account that has received an invitation to create a member and join a network. Applies only to Hyperledger Fabric.
    */
  def rejectInvitation(): Request[RejectInvitationOutput, AWSError] = js.native
  def rejectInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RejectInvitationOutput, Unit]): Request[RejectInvitationOutput, AWSError] = js.native
  /**
    * Rejects an invitation to join a network. This action can be called by a principal in an Amazon Web Services account that has received an invitation to create a member and join a network. Applies only to Hyperledger Fabric.
    */
  def rejectInvitation(params: RejectInvitationInput): Request[RejectInvitationOutput, AWSError] = js.native
  def rejectInvitation(
    params: RejectInvitationInput,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectInvitationOutput, Unit]
  ): Request[RejectInvitationOutput, AWSError] = js.native
  
  /**
    * Adds or overwrites the specified tags for the specified Amazon Managed Blockchain resource. Each tag consists of a key and optional value. When you specify a tag key that already exists, the tag value is overwritten with the new value. Use UntagResource to remove tag keys. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and returns an error. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds or overwrites the specified tags for the specified Amazon Managed Blockchain resource. Each tag consists of a key and optional value. When you specify a tag key that already exists, the tag value is overwritten with the new value. Use UntagResource to remove tag keys. A resource can have up to 50 tags. If you try to create more than 50 tags for a resource, your request fails and returns an error. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes the specified tags from the Amazon Managed Blockchain resource. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes the specified tags from the Amazon Managed Blockchain resource. For more information about tags, see Tagging Resources in the Amazon Managed Blockchain Ethereum Developer Guide, or Tagging Resources in the Amazon Managed Blockchain Hyperledger Fabric Developer Guide.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates a member configuration with new parameters. Applies only to Hyperledger Fabric.
    */
  def updateMember(): Request[UpdateMemberOutput, AWSError] = js.native
  def updateMember(callback: js.Function2[/* err */ AWSError, /* data */ UpdateMemberOutput, Unit]): Request[UpdateMemberOutput, AWSError] = js.native
  /**
    * Updates a member configuration with new parameters. Applies only to Hyperledger Fabric.
    */
  def updateMember(params: UpdateMemberInput): Request[UpdateMemberOutput, AWSError] = js.native
  def updateMember(
    params: UpdateMemberInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateMemberOutput, Unit]
  ): Request[UpdateMemberOutput, AWSError] = js.native
  
  /**
    * Updates a node configuration with new parameters. Applies only to Hyperledger Fabric.
    */
  def updateNode(): Request[UpdateNodeOutput, AWSError] = js.native
  def updateNode(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNodeOutput, Unit]): Request[UpdateNodeOutput, AWSError] = js.native
  /**
    * Updates a node configuration with new parameters. Applies only to Hyperledger Fabric.
    */
  def updateNode(params: UpdateNodeInput): Request[UpdateNodeOutput, AWSError] = js.native
  def updateNode(
    params: UpdateNodeInput,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNodeOutput, Unit]
  ): Request[UpdateNodeOutput, AWSError] = js.native
  
  /**
    * Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by VoterMemberId, must be in the same Amazon Web Services account as the principal that calls the action. Applies only to Hyperledger Fabric.
    */
  def voteOnProposal(): Request[VoteOnProposalOutput, AWSError] = js.native
  def voteOnProposal(callback: js.Function2[/* err */ AWSError, /* data */ VoteOnProposalOutput, Unit]): Request[VoteOnProposalOutput, AWSError] = js.native
  /**
    * Casts a vote for a specified ProposalId on behalf of a member. The member to vote as, specified by VoterMemberId, must be in the same Amazon Web Services account as the principal that calls the action. Applies only to Hyperledger Fabric.
    */
  def voteOnProposal(params: VoteOnProposalInput): Request[VoteOnProposalOutput, AWSError] = js.native
  def voteOnProposal(
    params: VoteOnProposalInput,
    callback: js.Function2[/* err */ AWSError, /* data */ VoteOnProposalOutput, Unit]
  ): Request[VoteOnProposalOutput, AWSError] = js.native
}
