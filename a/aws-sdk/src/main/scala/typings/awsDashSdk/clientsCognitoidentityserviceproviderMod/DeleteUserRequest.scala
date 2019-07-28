package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUserRequest extends js.Object {
  /**
    * The access token from a request to delete a user.
    */
  var AccessToken: TokenModelType
}

object DeleteUserRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): DeleteUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken)
  
    __obj.asInstanceOf[DeleteUserRequest]
  }
}

