package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: __string
}

object GetAuthorizerRequest {
  @scala.inline
  def apply(ApiId: __string, AuthorizerId: __string): GetAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, AuthorizerId = AuthorizerId)
  
    __obj.asInstanceOf[GetAuthorizerRequest]
  }
}

