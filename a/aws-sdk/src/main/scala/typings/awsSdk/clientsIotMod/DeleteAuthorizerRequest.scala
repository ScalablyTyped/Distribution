package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAuthorizerRequest extends StObject {
  
  /**
    * The name of the authorizer to delete.
    */
  var authorizerName: AuthorizerName
}
object DeleteAuthorizerRequest {
  
  inline def apply(authorizerName: AuthorizerName): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
  
  extension [Self <: DeleteAuthorizerRequest](x: Self) {
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
  }
}
