package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelContactRequest extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: String
}

object CancelContactRequest {
  @scala.inline
  def apply(contactId: String): CancelContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId)
  
    __obj.asInstanceOf[CancelContactRequest]
  }
}

