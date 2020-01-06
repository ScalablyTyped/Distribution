package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelContactRequest extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: String = js.native
}

object CancelContactRequest {
  @scala.inline
  def apply(contactId: String): CancelContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CancelContactRequest]
  }
}

