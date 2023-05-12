package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactInformationResponse extends StObject {
  
  /**
    * Contains the details of the primary contact information associated with an Amazon Web Services account.
    */
  var ContactInformation: js.UndefOr[typings.awsSdk.clientsAccountMod.ContactInformation] = js.undefined
}
object GetContactInformationResponse {
  
  inline def apply(): GetContactInformationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactInformationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetContactInformationResponse] (val x: Self) extends AnyVal {
    
    inline def setContactInformation(value: ContactInformation): Self = StObject.set(x, "ContactInformation", value.asInstanceOf[js.Any])
    
    inline def setContactInformationUndefined: Self = StObject.set(x, "ContactInformation", js.undefined)
  }
}
