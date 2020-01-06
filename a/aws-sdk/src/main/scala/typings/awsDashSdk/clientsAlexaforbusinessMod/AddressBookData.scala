package typings.awsDashSdk.clientsAlexaforbusinessMod

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
  def apply(
    AddressBookArn: Arn = null,
    Description: AddressBookDescription = null,
    Name: AddressBookName = null
  ): AddressBookData = {
    val __obj = js.Dynamic.literal()
    if (AddressBookArn != null) __obj.updateDynamic("AddressBookArn")(AddressBookArn.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddressBookData]
  }
}

