package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteVerifiedEmailAddressRequest extends js.Object {
  /**
    * An email address to be removed from the list of verified addresses.
    */
  var EmailAddress: Address
}

object DeleteVerifiedEmailAddressRequest {
  @scala.inline
  def apply(EmailAddress: Address): DeleteVerifiedEmailAddressRequest = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress)
  
    __obj.asInstanceOf[DeleteVerifiedEmailAddressRequest]
  }
}

