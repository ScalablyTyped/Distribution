package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VotingPolicy extends js.Object {
  /**
    * Defines the rules for the network for voting on proposals, such as the percentage of YES votes required for the proposal to be approved and the duration of the proposal. The policy applies to all proposals and is specified when the network is created.
    */
  var ApprovalThresholdPolicy: js.UndefOr[typings.awsDashSdk.clientsManagedblockchainMod.ApprovalThresholdPolicy] = js.native
}

object VotingPolicy {
  @scala.inline
  def apply(ApprovalThresholdPolicy: ApprovalThresholdPolicy = null): VotingPolicy = {
    val __obj = js.Dynamic.literal()
    if (ApprovalThresholdPolicy != null) __obj.updateDynamic("ApprovalThresholdPolicy")(ApprovalThresholdPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VotingPolicy]
  }
}

