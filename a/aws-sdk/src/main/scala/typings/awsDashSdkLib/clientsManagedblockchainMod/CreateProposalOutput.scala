package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProposalOutput extends js.Object {
  /**
    * The unique identifier of the proposal.
    */
  var ProposalId: js.UndefOr[ResourceIdString] = js.undefined
}

object CreateProposalOutput {
  @scala.inline
  def apply(ProposalId: ResourceIdString = null): CreateProposalOutput = {
    val __obj = js.Dynamic.literal()
    if (ProposalId != null) __obj.updateDynamic("ProposalId")(ProposalId)
    __obj.asInstanceOf[CreateProposalOutput]
  }
}

