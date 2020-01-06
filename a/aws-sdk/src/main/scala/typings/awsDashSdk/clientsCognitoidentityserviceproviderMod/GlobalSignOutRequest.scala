package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalSignOutRequest extends js.Object {
  /**
    * The access token.
    */
  var AccessToken: TokenModelType = js.native
}

object GlobalSignOutRequest {
  @scala.inline
  def apply(AccessToken: TokenModelType): GlobalSignOutRequest = {
    val __obj = js.Dynamic.literal(AccessToken = AccessToken.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GlobalSignOutRequest]
  }
}

