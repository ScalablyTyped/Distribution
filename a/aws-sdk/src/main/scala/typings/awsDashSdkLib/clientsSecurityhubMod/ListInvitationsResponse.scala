package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsResponse extends js.Object {
  /**
    * The details of the invitations returned by the operation.
    */
  var Invitations: js.UndefOr[InvitationList] = js.undefined
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NonEmptyString] = js.undefined
}

object ListInvitationsResponse {
  @scala.inline
  def apply(Invitations: InvitationList = null, NextToken: NonEmptyString = null): ListInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Invitations != null) __obj.updateDynamic("Invitations")(Invitations)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInvitationsResponse]
  }
}

