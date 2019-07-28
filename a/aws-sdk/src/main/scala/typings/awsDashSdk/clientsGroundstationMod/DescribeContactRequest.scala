package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeContactRequest extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: String
}

object DescribeContactRequest {
  @scala.inline
  def apply(contactId: String): DescribeContactRequest = {
    val __obj = js.Dynamic.literal(contactId = contactId)
  
    __obj.asInstanceOf[DescribeContactRequest]
  }
}

