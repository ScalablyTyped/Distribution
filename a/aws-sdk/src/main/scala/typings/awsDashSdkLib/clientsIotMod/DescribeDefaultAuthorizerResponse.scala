package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDefaultAuthorizerResponse extends js.Object {
  /**
    * The default authorizer's description.
    */
  var authorizerDescription: js.UndefOr[AuthorizerDescription] = js.undefined
}

object DescribeDefaultAuthorizerResponse {
  @scala.inline
  def apply(authorizerDescription: AuthorizerDescription = null): DescribeDefaultAuthorizerResponse = {
    val __obj = js.Dynamic.literal()
    if (authorizerDescription != null) __obj.updateDynamic("authorizerDescription")(authorizerDescription)
    __obj.asInstanceOf[DescribeDefaultAuthorizerResponse]
  }
}

