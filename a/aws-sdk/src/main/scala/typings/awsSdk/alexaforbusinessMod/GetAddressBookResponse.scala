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
  def apply(): GetAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAddressBookResponse]
  }
  @scala.inline
  implicit class GetAddressBookResponseOps[Self <: GetAddressBookResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressBook(value: AddressBook): Self = this.set("AddressBook", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressBook: Self = this.set("AddressBook", js.undefined)
  }
  
}

