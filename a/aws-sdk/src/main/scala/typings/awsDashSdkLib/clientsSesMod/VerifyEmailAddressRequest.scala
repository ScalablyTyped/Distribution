package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyEmailAddressRequest extends js.Object {
  /**
    * The email address to be verified.
    */
  var EmailAddress: Address
}

object VerifyEmailAddressRequest {
  @scala.inline
  def apply(EmailAddress: Address): VerifyEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress)
  
    __obj.asInstanceOf[VerifyEmailAddressRequest]
  }
}

