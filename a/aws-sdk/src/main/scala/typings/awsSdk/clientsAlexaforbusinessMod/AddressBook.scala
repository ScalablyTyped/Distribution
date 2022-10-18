package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressBook extends StObject {
  
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
object AddressBook {
  
  inline def apply(): AddressBook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressBook]
  }
  
  extension [Self <: AddressBook](x: Self) {
    
    inline def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    inline def setAddressBookArnUndefined: Self = StObject.set(x, "AddressBookArn", js.undefined)
    
    inline def setDescription(value: AddressBookDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: AddressBookName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
