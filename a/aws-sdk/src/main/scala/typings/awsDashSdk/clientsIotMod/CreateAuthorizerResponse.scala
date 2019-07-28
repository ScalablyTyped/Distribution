package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAuthorizerResponse extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.undefined
  /**
    * The authorizer's name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.undefined
}

object CreateAuthorizerResponse {
  @scala.inline
  def apply(authorizerArn: AuthorizerArn = null, authorizerName: AuthorizerName = null): CreateAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerArn != null) __obj.updateDynamic("authorizerArn")(authorizerArn)
    if (authorizerName != null) __obj.updateDynamic("authorizerName")(authorizerName)
    __obj.asInstanceOf[CreateAuthorizerResponse]
  }
}

