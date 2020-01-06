package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeContactRequest extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: String = js.native
}

object DescribeContactRequest {
  @scala.inline
  def apply(contactId: String): DescribeContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeContactRequest]
  }
}

