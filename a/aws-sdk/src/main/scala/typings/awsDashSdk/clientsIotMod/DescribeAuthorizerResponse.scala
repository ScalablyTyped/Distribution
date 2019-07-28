package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuthorizerResponse extends js.Object {
  /**
    * The authorizer description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
}

object DescribeAuthorizerResponse {
  @scala.inline
  def apply(authorizerDescription: AuthorizerDescription = null): DescribeAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerDescription != null) __obj.updateDynamic("authorizerDescription")(authorizerDescription)
    __obj.asInstanceOf[DescribeAuthorizerResponse]
  }
}

