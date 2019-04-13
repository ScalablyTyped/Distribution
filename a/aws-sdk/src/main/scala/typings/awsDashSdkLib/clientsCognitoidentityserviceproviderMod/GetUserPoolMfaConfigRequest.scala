package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserPoolMfaConfigRequest extends js.Object {
  /**
    * The user pool ID.
    */
  var UserPoolId: UserPoolIdType
}

object GetUserPoolMfaConfigRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetUserPoolMfaConfigRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[GetUserPoolMfaConfigRequest]
  }
}

