package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/clientconfigi
trait ClientConfigI extends js.Object {
  var clientId: String
  var redirectURI: String
  var scope: String
  var state: String
  var usePopup: Boolean
}

object ClientConfigI {
  @scala.inline
  def apply(clientId: String, redirectURI: String, scope: String, state: String, usePopup: Boolean): ClientConfigI = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], redirectURI = redirectURI.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], usePopup = usePopup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientConfigI]
  }
}

