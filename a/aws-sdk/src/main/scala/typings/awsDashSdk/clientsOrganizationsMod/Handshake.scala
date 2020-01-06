package typings.awsDashSdk.clientsOrganizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Handshake extends js.Object {
  /**
    * The type of handshake, indicating what action occurs when the recipient accepts the handshake. The following handshake types are supported:    INVITE: This type of handshake represents a request to join an organization. It is always sent from the master account to only non-member accounts.    ENABLE_ALL_FEATURES: This type of handshake represents a request to enable all features in an organization. It is always sent from the master account to only invited member accounts. Created accounts do not receive this because those accounts were created by the organization's master account and approval is inferred.    APPROVE_ALL_FEATURES: This type of handshake is sent from the Organizations service when all member accounts have approved the ENABLE_ALL_FEATURES invitation. It is sent only to the master account and signals the master that it can finalize the process to enable all features.  
    */
  var Action: js.UndefOr[ActionType] = js.native
  /**
    * The Amazon Resource Name (ARN) of a handshake. For more information about ARNs in Organizations, see ARN Formats Supported by Organizations in the AWS Organizations User Guide.
    */
  var Arn: js.UndefOr[HandshakeArn] = js.native
  /**
    * The date and time that the handshake expires. If the recipient of the handshake request fails to respond before the specified date and time, the handshake becomes inactive and is no longer valid.
    */
  var ExpirationTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The unique identifier (ID) of a handshake. The originating account creates the ID when it initiates the handshake. The regex pattern for handshake ID string requires "h-" followed by from 8 to 32 lower-case letters or digits.
    */
  var Id: js.UndefOr[HandshakeId] = js.native
  /**
    * Information about the two accounts that are participating in the handshake.
    */
  var Parties: js.UndefOr[HandshakeParties] = js.native
  /**
    * The date and time that the handshake request was made.
    */
  var RequestedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * Additional information that is needed to process the handshake.
    */
  var Resources: js.UndefOr[HandshakeResources] = js.native
  /**
    * The current state of the handshake. Use the state to trace the flow of the handshake through the process from its creation to its acceptance. The meaning of each of the valid values is as follows:    REQUESTED: This handshake was sent to multiple recipients (applicable to only some handshake types) and not all recipients have responded yet. The request stays in this state until all recipients respond.    OPEN: This handshake was sent to multiple recipients (applicable to only some policy types) and all recipients have responded, allowing the originator to complete the handshake action.    CANCELED: This handshake is no longer active because it was canceled by the originating account.    ACCEPTED: This handshake is complete because it has been accepted by the recipient.    DECLINED: This handshake is no longer active because it was declined by the recipient account.    EXPIRED: This handshake is no longer active because the originator did not receive a response of any kind from the recipient before the expiration time (15 days).  
    */
  var State: js.UndefOr[HandshakeState] = js.native
}

object Handshake {
  @scala.inline
  def apply(
    Action: ActionType = null,
    Arn: HandshakeArn = null,
    ExpirationTimestamp: Timestamp = null,
    Id: HandshakeId = null,
    Parties: HandshakeParties = null,
    RequestedTimestamp: Timestamp = null,
    Resources: HandshakeResources = null,
    State: HandshakeState = null
  ): Handshake = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (ExpirationTimestamp != null) __obj.updateDynamic("ExpirationTimestamp")(ExpirationTimestamp.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Parties != null) __obj.updateDynamic("Parties")(Parties.asInstanceOf[js.Any])
    if (RequestedTimestamp != null) __obj.updateDynamic("RequestedTimestamp")(RequestedTimestamp.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handshake]
  }
}

