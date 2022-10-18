package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkspaceAuthenticationResponse extends StObject {
  
  /**
    * A structure that describes the user authentication for this workspace after the update is made.
    */
  var authentication: AuthenticationDescription
}
object UpdateWorkspaceAuthenticationResponse {
  
  inline def apply(authentication: AuthenticationDescription): UpdateWorkspaceAuthenticationResponse = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkspaceAuthenticationResponse]
  }
  
  extension [Self <: UpdateWorkspaceAuthenticationResponse](x: Self) {
    
    inline def setAuthentication(value: AuthenticationDescription): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
  }
}
