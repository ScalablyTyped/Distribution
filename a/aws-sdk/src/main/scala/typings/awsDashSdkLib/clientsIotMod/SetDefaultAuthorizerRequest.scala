package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetDefaultAuthorizerRequest extends js.Object {
  /**
    * The authorizer name.
    */
  var authorizerName: AuthorizerName
}

object SetDefaultAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): SetDefaultAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName)
  
    __obj.asInstanceOf[SetDefaultAuthorizerRequest]
  }
}

