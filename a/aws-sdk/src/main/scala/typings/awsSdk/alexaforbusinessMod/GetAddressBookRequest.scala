package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAddressBookRequest extends js.Object {
  /**
    * The ARN of the address book for which to request details.
    */
  var AddressBookArn: Arn = js.native
}

object GetAddressBookRequest {
  @scala.inline
  def apply(AddressBookArn: Arn): GetAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAddressBookRequest]
  }
  @scala.inline
  implicit class GetAddressBookRequestOps[Self <: GetAddressBookRequest] (val x: Self) extends AnyVal {
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
  }
  
}

