package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmergencyContact extends js.Object {
  /**
    * An email address that the DRT can use to contact you during a suspected attack.
    */
  var EmailAddress: typings.awsDashSdk.clientsShieldMod.EmailAddress = js.native
}

object EmergencyContact {
  @scala.inline
  def apply(EmailAddress: EmailAddress): EmergencyContact = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmergencyContact]
  }
}

