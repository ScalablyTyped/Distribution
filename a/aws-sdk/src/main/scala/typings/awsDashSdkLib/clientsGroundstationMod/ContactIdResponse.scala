package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactIdResponse extends js.Object {
  /**
    * UUID of a contact.
    */
  var contactId: js.UndefOr[String] = js.undefined
}

object ContactIdResponse {
  @scala.inline
  def apply(contactId: String = null): ContactIdResponse = {
    val __obj = js.Dynamic.literal()
    if (contactId != null) __obj.updateDynamic("contactId")(contactId)
    __obj.asInstanceOf[ContactIdResponse]
  }
}

