package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserPoolClientResponse extends js.Object {
  /**
    * The user pool client value from the response from the server when an update user pool client request is made.
    */
  var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
}

object UpdateUserPoolClientResponse {
  @scala.inline
  def apply(UserPoolClient: UserPoolClientType = null): UpdateUserPoolClientResponse = {
    val __obj = js.Dynamic.literal()
    if (UserPoolClient != null) __obj.updateDynamic("UserPoolClient")(UserPoolClient)
    __obj.asInstanceOf[UpdateUserPoolClientResponse]
  }
}

