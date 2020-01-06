package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserPoolRequest extends js.Object {
  /**
    * The user pool ID for the user pool you want to describe.
    */
  var UserPoolId: UserPoolIdType = js.native
}

object DescribeUserPoolRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DescribeUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeUserPoolRequest]
  }
}

