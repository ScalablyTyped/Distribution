package typings
package awsDashSdkLib.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsOutput extends js.Object {
  /**
    * The invitations for the network.
    */
  var Invitations: js.UndefOr[InvitationList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListInvitationsOutput {
  @scala.inline
  def apply(Invitations: InvitationList = null, NextToken: PaginationToken = null): ListInvitationsOutput = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInvitationsOutput]
  }
}

