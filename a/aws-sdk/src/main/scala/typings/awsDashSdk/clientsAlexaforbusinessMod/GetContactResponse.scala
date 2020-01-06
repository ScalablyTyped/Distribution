package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetContactResponse extends js.Object {
  /**
    * The details of the requested contact.
    */
  var Contact: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.Contact] = js.native
}

object GetContactResponse {
  @scala.inline
  def apply(Contact: Contact = null): GetContactResponse = {
    val __obj = js.Dynamic.literal()
    if (Contact != null) __obj.updateDynamic("Contact")(Contact.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetContactResponse]
  }
}

