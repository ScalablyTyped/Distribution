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
  
  extension [Self <: IdentityManagerCredentialCreateEvent](x: Self) {
    
    inline def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
  }
}
