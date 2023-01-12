package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerCredentialCreateEvent extends StObject {
  
  var credential: Credential
}
object IdentityManagerCredentialCreateEvent {
  
  inline def apply(credential: Credential): IdentityManagerCredentialCreateEvent = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerCredentialCreateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityManagerCredentialCreateEvent] (val x: Self) extends AnyVal {
    
    inline def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
  }
}
