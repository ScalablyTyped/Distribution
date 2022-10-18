package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceAuthenticationResponse extends StObject {
  
  /**
    * A structure containing information about the authentication methods used in the workspace.
    */
  var authentication: AuthenticationDescription
}
object DescribeWorkspaceAuthenticationResponse {
  
  inline def apply(authentication: AuthenticationDescription): DescribeWorkspaceAuthenticationResponse = {
    val __obj = js.Dynamic.literal(authentication = authentication.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspaceAuthenticationResponse]
  }
  
  extension [Self <: DescribeWorkspaceAuthenticationResponse](x: Self) {
    
    inline def setAuthentication(value: AuthenticationDescription): Self = StObject.set(x, "authentication", value.asInstanceOf[js.Any])
  }
}
