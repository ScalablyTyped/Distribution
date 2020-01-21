package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAddressBookResponse extends js.Object {
  /**
    * The details of the requested address book.
    */
  var AddressBook: js.UndefOr[typings.awsSdk.alexaforbusinessMod.AddressBook] = js.native
}

object GetAddressBookResponse {
  @scala.inline
  def apply(AddressBook: AddressBook = null): GetAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    if (AddressBook != null) __obj.updateDynamic("AddressBook")(AddressBook.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressBookResponse]
  }
}

