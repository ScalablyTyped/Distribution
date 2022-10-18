package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAddressBookRequest extends StObject {
  
  /**
    * The ARN of the room to update.
    */
  var AddressBookArn: Arn
  
  /**
    * The updated description of the room.
    */
  var Description: js.UndefOr[AddressBookDescription] = js.undefined
  
  /**
    * The updated name of the room.
    */
  var Name: js.UndefOr[AddressBookName] = js.undefined
}
object UpdateAddressBookRequest {
  
  inline def apply(AddressBookArn: Arn): UpdateAddressBookRequest = {
    val __obj = js.Dynamic.literal(AddressBookArn = AddressBookArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAddressBookRequest]
  }
  
  extension [Self <: UpdateAddressBookRequest](x: Self) {
    
    inline def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: AddressBookDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: AddressBookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
