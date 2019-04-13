package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestInvokeAuthorizerRequest extends js.Object {
  /**
    * The custom authorizer name.
    */
  var authorizerName: AuthorizerName
  /**
    * The token returned by your custom authentication service.
    */
  var token: Token
  /**
    * The signature made with the token and your custom authentication service's private key.
    */
  var tokenSignature: TokenSignature
}

object TestInvokeAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName, token: Token, tokenSignature: TokenSignature): TestInvokeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName, token = token, tokenSignature = tokenSignature)
  
    __obj.asInstanceOf[TestInvokeAuthorizerRequest]
  }
}

