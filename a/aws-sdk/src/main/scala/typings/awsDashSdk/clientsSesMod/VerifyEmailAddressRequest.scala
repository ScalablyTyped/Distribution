package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VerifyEmailAddressRequest extends js.Object {
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address = js.native
}

object VerifyEmailAddressRequest {
  @scala.inline
  def apply(EmailAddress: Address): VerifyEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyEmailAddressRequest]
  }
}

