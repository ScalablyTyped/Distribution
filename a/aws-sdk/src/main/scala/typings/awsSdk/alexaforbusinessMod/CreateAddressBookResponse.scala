package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAddressBookResponse extends StObject {
  
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
  implicit class CreateAddressBookResponseMutableBuilder[Self <: CreateAddressBookResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddressBookArn(value: Arn): Self = StObject.set(x, "AddressBookArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressBookArnUndefined: Self = StObject.set(x, "AddressBookArn", js.undefined)
  }
}
