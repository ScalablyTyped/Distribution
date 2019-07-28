package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAuthorizerRequest extends js.Object {
  /**
    * The name of the authorizer to describe.
    */
  var authorizerName: AuthorizerName
}

object DescribeAuthorizerRequest {
  @scala.inline
  def apply(authorizerName: AuthorizerName): DescribeAuthorizerRequest = {
    val __obj = js.Dynamic.literal(authorizerName = authorizerName)
  
    __obj.asInstanceOf[DescribeAuthorizerRequest]
  }
}

