package typings.appleSigninApi.AppleSignInAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/signinwithapplejs/clientconfigi
trait ClientConfigI extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var redirectURI: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var usePopup: js.UndefOr[Boolean] = js.undefined
}

object ClientConfigI {
  @scala.inline
  def apply(
    clientId: String = null,
    nonce: String = null,
    redirectURI: String = null,
    scope: String = null,
    state: String = null,
    usePopup: js.UndefOr[Boolean] = js.undefined
  ): ClientConfigI = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (redirectURI != null) __obj.updateDynamic("redirectURI")(redirectURI.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(usePopup)) __obj.updateDynamic("usePopup")(usePopup.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConfigI]
  }
}

