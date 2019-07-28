package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAddressBookResponse extends js.Object {
  /**
    * The details of the requested address book.
    */
  var AddressBook: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.AddressBook] = js.undefined
}

object GetAddressBookResponse {
  @scala.inline
  def apply(AddressBook: AddressBook = null): GetAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    if (AddressBook != null) __obj.updateDynamic("AddressBook")(AddressBook)
    __obj.asInstanceOf[GetAddressBookResponse]
  }
}

