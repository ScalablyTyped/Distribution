package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserPoolRequest extends js.Object {
  /**
    * The user pool ID for the user pool you want to delete.
    */
  var UserPoolId: UserPoolIdType
}

object DeleteUserPoolRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): DeleteUserPoolRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[DeleteUserPoolRequest]
  }
}

