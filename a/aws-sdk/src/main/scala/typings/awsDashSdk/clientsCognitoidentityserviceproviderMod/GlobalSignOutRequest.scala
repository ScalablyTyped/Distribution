package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalSignOutRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType
}

object GlobalSignOutRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): GlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken)
  
    __obj.asInstanceOf[GlobalSignOutRequest]
  }
}

