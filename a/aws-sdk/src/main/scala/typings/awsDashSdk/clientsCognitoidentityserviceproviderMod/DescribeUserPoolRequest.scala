package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserPoolRequest extends js.Object {
  /**
    * The user pool ID for the user pool you want to describe.
    */
  var UserPoolId: UserPoolIdType
}

object DescribeUserPoolRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DescribeUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DescribeUserPoolRequest]
  }
}

