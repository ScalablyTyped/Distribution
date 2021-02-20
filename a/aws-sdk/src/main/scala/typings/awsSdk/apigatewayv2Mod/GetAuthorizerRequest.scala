package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetAuthorizerRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string = js.native
  
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: string = js.native
}
object GetAuthorizerRequest {
  
  @scala.inline
  def apply(ApiId: string, AuthorizerId: string): GetAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], AuthorizerId = AuthorizerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthorizerRequest]
  }
  
  @scala.inline
  implicit class GetAuthorizerRequestMutableBuilder[Self <: GetAuthorizerRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerId(value: string): Self = StObject.set(x, "AuthorizerId", value.asInstanceOf[js.Any])
  }
}
