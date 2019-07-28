package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserPoolClientRequest extends js.Object {
  /**
    * The app client ID of the app associated with the user pool.
    */
  var ClientId: ClientIdType
  /**
    * The user pool ID for the user pool you want to describe.
    */
  var UserPoolId: UserPoolIdType
}

object DescribeUserPoolClientRequest {
  @scala.inline
  def apply(ClientId: ClientIdType, UserPoolId: UserPoolIdType): DescribeUserPoolClientRequest = {
    val __obj = js.Dynamic.literal(ClientId = ClientId, UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DescribeUserPoolClientRequest]
  }
}

