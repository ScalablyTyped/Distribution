package typings.awsDashSdk.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string = js.native
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: __string = js.native
}

object GetAuthorizerRequest {
  @scala.inline
  def apply(ApiId: __string, AuthorizerId: __string): GetAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], AuthorizerId = AuthorizerId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetAuthorizerRequest]
  }
}

