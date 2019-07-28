package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyEmailIdentityRequest extends js.Object {
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address
}

object VerifyEmailIdentityRequest {
  @scala.inline
  def apply(EmailAddress: Address): VerifyEmailIdentityRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress)
  
    __obj.asInstanceOf[VerifyEmailIdentityRequest]
  }
}

