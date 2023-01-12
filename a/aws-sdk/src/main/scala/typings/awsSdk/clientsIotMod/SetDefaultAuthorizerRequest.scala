package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDefaultAuthorizerRequest extends StObject {
  
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName
}
object SetDefaultAuthorizerRequest {
  
  inline def apply(authorizerName: AuthorizerName): SetDefaultAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDefaultAuthorizerRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetDefaultAuthorizerRequest] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
  }
}
