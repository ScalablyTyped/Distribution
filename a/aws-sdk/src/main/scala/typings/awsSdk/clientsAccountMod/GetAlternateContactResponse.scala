package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAlternateContactResponse extends StObject {
  
  /**
    * A structure that contains the details for the specified alternate contact.
    */
  var AlternateContact: js.UndefOr[typings.awsSdk.clientsAccountMod.AlternateContact] = js.undefined
}
object GetAlternateContactResponse {
  
  inline def apply(): GetAlternateContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAlternateContactResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAlternateContactResponse] (val x: Self) extends AnyVal {
    
    inline def setAlternateContact(value: AlternateContact): Self = StObject.set(x, "AlternateContact", value.asInstanceOf[js.Any])
    
    inline def setAlternateContactUndefined: Self = StObject.set(x, "AlternateContact", js.undefined)
  }
}
