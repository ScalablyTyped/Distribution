package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAuthorizerRequest extends js.Object {
  /**
    * The name of the authorizer to describe.
    */
  var authorizerName: AuthorizerName = js.native
}

object DescribeAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): DescribeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAuthorizerRequest]
  }
}

