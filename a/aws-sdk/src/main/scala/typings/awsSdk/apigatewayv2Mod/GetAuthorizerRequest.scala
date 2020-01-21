package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizerRequest extends js.Object {
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
}

