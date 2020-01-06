package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteVerifiedEmailAddressRequest extends js.Object {
  /**
    * An email address to be removed from the list of verified addresses.
    */
  var EmailAddress: Address = js.native
}

object DeleteVerifiedEmailAddressRequest {
  @scala.inline
  def apply(EmailAddress: Address): DeleteVerifiedEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteVerifiedEmailAddressRequest]
  }
}

