package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDefaultAuthorizerResponse extends js.Object {
  /**
    * The default authorizer's description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.native
}

object DescribeDefaultAuthorizerResponse {
  @scala.inline
  def apply(authorizerDescription: AuthorizerDescription = null): DescribeDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerDescription != null) __obj.updateDynamic("authorizerDescription")(authorizerDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
  }
}

