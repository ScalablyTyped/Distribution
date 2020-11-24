package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAddressBookRequest extends js.Object {
  
  /**
    * The ARN of the room to update.
    */
  var AddressBookArn: Arn = js.native
  
  /**
    * The updated description of the room.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.native
  
  /**
    * The updated name of the room.
    */
  var Name: js.UndefOr[AddressBookName] = js.native
}
object UpdateAddressBookRequest {
  
  @scala.inline
  def apply(AddressBookArn: Arn): UpdateAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAddressBookRequest]
  }
  
  @scala.inline
  implicit class UpdateAddressBookRequestOps[Self <: UpdateAddressBookRequest] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: AddressBookDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setName(value: AddressBookName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
