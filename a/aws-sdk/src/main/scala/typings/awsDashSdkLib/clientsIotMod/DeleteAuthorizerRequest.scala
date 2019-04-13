package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAuthorizerRequest extends js.Object {
  /**
    * The name of the authorizer to delete.
    */
  var authorizerName: AuthorizerName
}

object DeleteAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): DeleteAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName)
  
    __obj.asInstanceOf[DeleteAuthorizerRequest]
  }
}

