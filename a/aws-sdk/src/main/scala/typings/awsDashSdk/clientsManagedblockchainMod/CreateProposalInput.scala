package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProposalInput extends js.Object {
  /**
    * The type of actions proposed, such as inviting a member or removing a member. The types of Actions in a proposal are mutually exclusive. For example, a proposal with Invitations actions cannot also contain Removals actions.
    */
  var Actions: ProposalActions
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the operation. An idempotent operation completes no more than one time. This identifier is required only if you make a service request directly using an HTTP client. It is generated automatically if you use an AWS SDK or the AWS CLI.
    */
  var ClientRequestToken: ClientRequestTokenString
  /**
    * A description for the proposal that is visible to voting members, for example, "Proposal to add Example Corp. as member."
    */
  var Description: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The unique identifier of the member that is creating the proposal. This identifier is especially useful for identifying the member making the proposal when multiple members exist in a single AWS account.
    */
  var MemberId: ResourceIdString
  /**
    *  The unique identifier of the network for which the proposal is made.
    */
  var NetworkId: ResourceIdString
}

object CreateProposalInput {
  @scala.inline
  def apply(
    Actions: ProposalActions,
    ClientRequestToken: ClientRequestTokenString,
    MemberId: ResourceIdString,
    NetworkId: ResourceIdString,
    Description: DescriptionString = null
  ): CreateProposalInput = {
    val __obj = js.Dynamic.literal(Actions = Actions, ClientRequestToken = ClientRequestToken, MemberId = MemberId, NetworkId = NetworkId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[CreateProposalInput]
  }
}

