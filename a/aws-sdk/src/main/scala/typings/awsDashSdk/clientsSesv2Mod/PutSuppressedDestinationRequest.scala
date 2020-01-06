package typings.awsDashSdk.clientsSesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutSuppressedDestinationRequest extends js.Object {
  /**
    * The email address that should be added to the suppression list for your account.
    */
  var EmailAddress: typings.awsDashSdk.clientsSesv2Mod.EmailAddress = js.native
  /**
    * The factors that should cause the email address to be added to the suppression list for your account.
    */
  var Reason: SuppressionListReason = js.native
}

object PutSuppressedDestinationRequest {
  @scala.inline
  def apply(EmailAddress: EmailAddress, Reason: SuppressionListReason): PutSuppressedDestinationRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutSuppressedDestinationRequest]
  }
}

