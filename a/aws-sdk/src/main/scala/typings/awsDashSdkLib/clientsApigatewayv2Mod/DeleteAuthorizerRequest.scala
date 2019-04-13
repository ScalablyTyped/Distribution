package typings
package awsDashSdkLib.clientsApigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAuthorizerRequest extends js.Object {
  /**
    * The API identifier.
    */
  var ApiId: __string
  /**
    * The authorizer identifier.
    */
  var AuthorizerId: __string
}

object DeleteAuthorizerRequest {
  @scala.inline
  def apply(ApiId: __string, AuthorizerId: __string): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId, AuthorizerId = AuthorizerId)
  
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
}

