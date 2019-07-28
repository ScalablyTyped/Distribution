package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProposalActions extends js.Object {
  /**
    *  The actions to perform for an APPROVED proposal to invite an AWS account to create a member and join the network. 
    */
  var Invitations: js.UndefOr[InviteActionList] = js.undefined
  /**
    *  The actions to perform for an APPROVED proposal to remove a member from the network, which deletes the member and all associated member resources from the network. 
    */
  var Removals: js.UndefOr[RemoveActionList] = js.undefined
}

object ProposalActions {
  @scala.inline
  def apply(Invitations: InviteActionList = null, Removals: RemoveActionList = null): ProposalActions = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations)
    if (Removals != null) __obj.updateDynamic("Removals")(Removals)
    __obj.asInstanceOf[ProposalActions]
  }
}

