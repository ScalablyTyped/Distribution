package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAuthorizerResponse extends StObject {
  
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
  
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
}
object UpdateAuthorizerResponse {
  
  inline def apply(): UpdateAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAuthorizerResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAuthorizerResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizerArn(value: AuthorizerArn): Self = StObject.set(x, "authorizerArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerArnUndefined: Self = StObject.set(x, "authorizerArn", js.undefined)
    
    inline def setAuthorizerName(value: AuthorizerName): Self = StObject.set(x, "authorizerName", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerNameUndefined: Self = StObject.set(x, "authorizerName", js.undefined)
  }
}
