package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressBookData extends js.Object {
  /**
    * The ARN of the address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.undefined
  /**
    * The description of the address book.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.undefined
  /**
    * The name of the address book.
    */
  var Name: js.UndefOr[AddressBookName] = js.undefined
}

object AddressBookData {
  @scala.inline
  def apply(
    AddressBookArn: Arn = null,
    Description: AddressBookDescription = null,
    Name: AddressBookName = null
  ): AddressBookData = {
    val __obj = js.Dynamic.literal()
    if (AddressBookArn != null) __obj.updateDynamic("AddressBookArn")(AddressBookArn)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[AddressBookData]
  }
}

