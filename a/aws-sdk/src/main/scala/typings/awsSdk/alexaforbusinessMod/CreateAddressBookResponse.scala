package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAddressBookResponse extends js.Object {
  /**
    * The ARN of the newly created address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.native
}

object CreateAddressBookResponse {
  @scala.inline
  def apply(): CreateAddressBookResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateAddressBookResponse]
  }
  @scala.inline
  implicit class CreateAddressBookResponseOps[Self <: CreateAddressBookResponse] (val x: Self) extends AnyVal {
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
    def setAddressBookArn(value: Arn): Self = this.set("AddressBookArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressBookArn: Self = this.set("AddressBookArn", js.undefined)
  }
  
}

