package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthorizerSummary extends js.Object {
  /**
    * The authorizer ARN.
    */
  var authorizerArn: js.UndefOr[AuthorizerArn] = js.native
  /**
    * The authorizer name.
    */
  var authorizerName: js.UndefOr[AuthorizerName] = js.native
}

object AuthorizerSummary {
  @scala.inline
  def apply(authorizerArn: AuthorizerArn = null, authorizerName: AuthorizerName = null): AuthorizerSummary = {
    val __obj = js.Dynamic.literal()
    if (authorizerArn != null) __obj.updateDynamic("authorizerArn")(authorizerArn.asInstanceOf[js.Any])
    if (authorizerName != null) __obj.updateDynamic("authorizerName")(authorizerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizerSummary]
  }
}

