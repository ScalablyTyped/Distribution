package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proposal extends js.Object {
  /**
    * The actions to perform on the network if the proposal is APPROVED.
    */
  var Actions: js.UndefOr[ProposalActions] = js.native
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the proposal.
    */
  var Description: js.UndefOr[DescriptionString] = js.native
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: js.UndefOr[ResourceIdString] = js.native
  /**
    *  The current total of NO votes cast on the proposal by members. 
    */
  var NoVoteCount: js.UndefOr[VoteCount] = js.native
  /**
    *  The number of votes remaining to be cast on the proposal by members. In other words, the number of members minus the sum of YES votes and NO votes. 
    */
  var OutstandingVoteCount: js.UndefOr[VoteCount] = js.native
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.native
  /**
    * The unique identifier of the member that created the proposal.
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.native
  /**
    * The name of the member that created the proposal.
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.native
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.native
  /**
    *  The current total of YES votes cast on the proposal by members. 
    */
  var YesVoteCount: js.UndefOr[VoteCount] = js.native
}

object Proposal {
  @scala.inline
  def apply(
    Actions: ProposalActions = null,
    CreationDate: Timestamp = null,
    Description: DescriptionString = null,
    ExpirationDate: Timestamp = null,
    NetworkId: ResourceIdString = null,
    NoVoteCount: Int | Double = null,
    OutstandingVoteCount: Int | Double = null,
    ProposalId: ResourceIdString = null,
    ProposedByMemberId: ResourceIdString = null,
    ProposedByMemberName: NetworkMemberNameString = null,
    Status: ProposalStatus = null,
    YesVoteCount: Int | Double = null
  ): Proposal = {
    val __obj = js.Dynamic.literal()
    if (Actions != null) __obj.updateDynamic("Actions")(Actions.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate.asInstanceOf[js.Any])
    if (NetworkId != null) __obj.updateDynamic("NetworkId")(NetworkId.asInstanceOf[js.Any])
    if (NoVoteCount != null) __obj.updateDynamic("NoVoteCount")(NoVoteCount.asInstanceOf[js.Any])
    if (OutstandingVoteCount != null) __obj.updateDynamic("OutstandingVoteCount")(OutstandingVoteCount.asInstanceOf[js.Any])
    if (ProposalId != null) __obj.updateDynamic("ProposalId")(ProposalId.asInstanceOf[js.Any])
    if (ProposedByMemberId != null) __obj.updateDynamic("ProposedByMemberId")(ProposedByMemberId.asInstanceOf[js.Any])
    if (ProposedByMemberName != null) __obj.updateDynamic("ProposedByMemberName")(ProposedByMemberName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (YesVoteCount != null) __obj.updateDynamic("YesVoteCount")(YesVoteCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proposal]
  }
}

