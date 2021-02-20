package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdentityManagerCredentialCreateEvent extends StObject {
  
  var credential: Credential = js.native
}
object IdentityManagerCredentialCreateEvent {
  
  @scala.inline
  def apply(credential: Credential): IdentityManagerCredentialCreateEvent = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerCredentialCreateEvent]
  }
  
  @scala.inline
  implicit class IdentityManagerCredentialCreateEventMutableBuilder[Self <: IdentityManagerCredentialCreateEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredential(value: Credential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
  }
}
