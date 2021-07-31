package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactResponse extends StObject {
  
  /**
    * The details of the requested contact.
    */
  var Contact: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Contact] = js.undefined
}
object GetContactResponse {
  
  @scala.inline
  def apply(): GetContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactResponse]
  }
  
  @scala.inline
  implicit class GetContactResponseMutableBuilder[Self <: GetContactResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "Contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "Contact", js.undefined)
  }
}
