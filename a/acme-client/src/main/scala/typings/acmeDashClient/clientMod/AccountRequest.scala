package typings.acmeDashClient.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountRequest extends js.Object {
  var contact: js.UndefOr[js.Array[String]] = js.undefined
}

object AccountRequest {
  @scala.inline
  def apply(contact: js.Array[String] = null): AccountRequest = {
    val __obj = js.Dynamic.literal()
    if (contact != null) __obj.updateDynamic("contact")(contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountRequest]
  }
}

