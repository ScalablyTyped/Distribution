package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddressBookData extends js.Object {
  /**
    * The ARN of the address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.native
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  /**
    * The name of the address book.
    */
  var Name: js.UndefOr[AddressBookName] = js.native
}

object AddressBookData {
  @scala.inline
  def apply(): AddressBookData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressBookData]
  }
  @scala.inline
  implicit class AddressBookDataOps[Self <: AddressBookData] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setDescription(value: AddressBookDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: AddressBookName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

