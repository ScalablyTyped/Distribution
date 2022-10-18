package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartTaskContactResponse extends StObject {
  
  /**
    * The identifier of this contact within the Amazon Connect instance.
    */
  var ContactId: js.UndefOr[typings.awsSdk.clientsConnectMod.ContactId] = js.undefined
}
object StartTaskContactResponse {
  
  inline def apply(): StartTaskContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTaskContactResponse]
  }
  
  extension [Self <: StartTaskContactResponse](x: Self) {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
  }
}
