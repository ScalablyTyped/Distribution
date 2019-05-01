package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProposalOutput extends js.Object {
  /**
    * Information about a proposal.
    */
  var Proposal: js.UndefOr[Proposal] = js.undefined
}

object GetProposalOutput {
  @scala.inline
  def apply(Proposal: Proposal = null): GetProposalOutput = {
    val __obj = js.Dynamic.literal()
    if (Proposal != null) __obj.updateDynamic("Proposal")(Proposal)
    __obj.asInstanceOf[GetProposalOutput]
  }
}

