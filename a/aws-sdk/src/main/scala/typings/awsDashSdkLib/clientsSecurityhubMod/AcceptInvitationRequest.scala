package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AcceptInvitationRequest extends js.Object {
  /**
    * The ID of the invitation that is sent to the AWS account by the Security Hub master account. 
    */
  var InvitationId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The account ID of the master Security Hub account whose invitation you're accepting. 
    */
  var MasterId: js.UndefOr[NonEmptyString] = js.undefined
}

object AcceptInvitationRequest {
  @scala.inline
  def apply(InvitationId: NonEmptyString = null, MasterId: NonEmptyString = null): AcceptInvitationRequest = {
    val __obj = js.Dynamic.literal()
    if (InvitationId != null) __obj.updateDynamic("InvitationId")(InvitationId)
    if (MasterId != null) __obj.updateDynamic("MasterId")(MasterId)
    __obj.asInstanceOf[AcceptInvitationRequest]
  }
}

