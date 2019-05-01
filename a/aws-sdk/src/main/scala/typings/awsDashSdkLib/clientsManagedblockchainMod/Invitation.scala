package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Invitation extends js.Object {
  /**
    * The date and time that the invitation was created.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time that the invitation expires. This is the CreationDate plus the ProposalDurationInHours that is specified in the ProposalThresholdPolicy. After this date and time, the invitee can no longer create a member and join the network using this InvitationId.
    */
  var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * The unique identifier for the invitation.
    */
  var InvitationId: js.UndefOr[ResourceIdString] = js.undefined
  var NetworkSummary: js.UndefOr[NetworkSummary] = js.undefined
  /**
    * The status of the invitation:    PENDING - The invitee has not created a member to join the network, and the invitation has not yet expired.    ACCEPTING - The invitee has begun creating a member, and creation has not yet completed.    ACCEPTED - The invitee created a member and joined the network using the InvitationID.    REJECTED - The invitee rejected the invitation.    EXPIRED - The invitee neither created a member nor rejected the invitation before the ExpirationDate.  
    */
  var Status: js.UndefOr[InvitationStatus] = js.undefined
}

object Invitation {
  @scala.inline
  def apply(
    CreationDate: Timestamp = null,
    ExpirationDate: Timestamp = null,
    InvitationId: ResourceIdString = null,
    NetworkSummary: NetworkSummary = null,
    Status: InvitationStatus = null
  ): Invitation = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate)
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId)
    if (NetworkSummary != null) __obj.updateDynamic("NetworkSummary")(NetworkSummary)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invitation]
  }
}

