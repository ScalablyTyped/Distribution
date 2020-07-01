package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenResponse extends js.Object {
  var access_token: String
  var expires_in: Double
  var id_token: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var token_type: String
}

object TokenResponse {
  @scala.inline
  def apply(
    access_token: String,
    expires_in: Double,
    token_type: String,
    id_token: String = null,
    scope: String = null
  ): TokenResponse = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any], token_type = token_type.asInstanceOf[js.Any])
    if (id_token != null) __obj.updateDynamic("id_token")(id_token.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenResponse]
  }
}

