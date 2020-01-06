package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListContactsResponse extends js.Object {
  /**
    * List of contacts.
    */
  var contactList: js.UndefOr[ContactList] = js.native
  /**
    * Next token returned in the response of a previous ListContacts call. Used to get the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object ListContactsResponse {
  @scala.inline
  def apply(contactList: ContactList = null, nextToken: String = null): ListContactsResponse = {
    val __obj = js.Dynamic.literal()
    if (contactList != null) __obj.updateDynamic("contactList")(contactList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactsResponse]
  }
}

