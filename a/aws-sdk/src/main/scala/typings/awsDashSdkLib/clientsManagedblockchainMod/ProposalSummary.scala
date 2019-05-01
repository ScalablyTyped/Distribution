package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalSummary extends js.Object {
  /**
    *  The date and time that the proposal was created. 
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    *  The description of the proposal. 
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    *  The date and time that the proposal expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, if members have not cast enough votes to determine the outcome according to the voting policy, the proposal is EXPIRED and Actions are not carried out. 
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.undefined
  /**
    *  The unique identifier of the member that created the proposal. 
    */
  var ProposedByMemberId: js.UndefOr[ResourceIdString] = js.undefined
  /**
    *  The name of the member that created the proposal. 
    */
  var ProposedByMemberName: js.UndefOr[NetworkMemberNameString] = js.undefined
  /**
    * The status of the proposal. Values are as follows:    IN_PROGRESS - The proposal is active and open for member voting.    APPROVED - The proposal was approved with sufficient YES votes among members according to the VotingPolicy specified for the Network. The specified proposal actions are carried out.    REJECTED - The proposal was rejected with insufficient YES votes among members according to the VotingPolicy specified for the Network. The specified ProposalActions are not carried out.    EXPIRED - Members did not cast the number of votes required to determine the proposal outcome before the proposal expired. The specified ProposalActions are not carried out.    ACTION_FAILED - One or more of the specified ProposalActions in a proposal that was approved could not be completed because of an error.  
    */
  var Status: js.UndefOr[ProposalStatus] = js.undefined
}

object ProposalSummary {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    Description: DescriptionString = null,
    ExpirationDate: Timestamp = null,
    ProposalId: ResourceIdString = null,
    ProposedByMemberId: ResourceIdString = null,
    ProposedByMemberName: NetworkMemberNameString = null,
    Status: ProposalStatus = null
  ): ProposalSummary = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (ProposalId != null) __obj.updateDynamic("ProposalId")(ProposalId)
    if (ProposedByMemberId != null) __obj.updateDynamic("ProposedByMemberId")(ProposedByMemberId)
    if (ProposedByMemberName != null) __obj.updateDynamic("ProposedByMemberName")(ProposedByMemberName)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProposalSummary]
  }
}

