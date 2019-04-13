package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmergencyContact extends js.Object {
  /**
    * An email address that the DRT can use to contact you during a suspected attack.
    */
  var EmailAddress: awsDashSdkLib.clientsShieldMod.EmailAddress
}

object EmergencyContact {
  @scala.inline
  def apply(EmailAddress: EmailAddress): EmergencyContact = {
    val __obj = js.Dynamic.literal(EmailAddress = EmailAddress)
  
    __obj.asInstanceOf[EmergencyContact]
  }
}

