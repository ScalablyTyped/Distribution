package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCSVHeaderRequest extends js.Object {
  /**
    * The user pool ID for the user pool that the users are to be imported into.
    */
  var UserPoolId: UserPoolIdType
}

object GetCSVHeaderRequest {
  @scala.inline
  def apply(UserPoolId: UserPoolIdType): GetCSVHeaderRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
  
    __obj.asInstanceOf[GetCSVHeaderRequest]
  }
}

