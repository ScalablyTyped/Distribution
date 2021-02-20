package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAddressBookRequest extends StObject {
  
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
  implicit class UpdateAddressBookRequestMutableBuilder[Self <: UpdateAddressBookRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: AddressBookDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: AddressBookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
