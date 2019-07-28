package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserRequest extends js.Object {
  /**
    * The access token returned by the server response to get information about the user.
    */
  var AccessToken: TokenModelType
}

object GetUserRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): GetUserRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken)
  
    __obj.asInstanceOf[GetUserRequest]
  }
}

