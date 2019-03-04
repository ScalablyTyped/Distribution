package typings
package authmosphereLib.libSrcTypesBodyParametersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyParameters extends js.Object {
  var code: js.UndefOr[java.lang.String] = js.undefined
  var grant_type: java.lang.String
  var password: js.UndefOr[java.lang.String] = js.undefined
  var redirect_uri: js.UndefOr[java.lang.String] = js.undefined
  var refresh_token: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object BodyParameters {
  @scala.inline
  def apply(
    grant_type: java.lang.String,
    code: java.lang.String = null,
    password: java.lang.String = null,
    redirect_uri: java.lang.String = null,
    refresh_token: java.lang.String = null,
    username: java.lang.String = null
  ): BodyParameters = {
    val __obj = js.Dynamic.literal(grant_type = grant_type)
    if (code != null) __obj.updateDynamic("code")(code)
    if (password != null) __obj.updateDynamic("password")(password)
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri)
    if (refresh_token != null) __obj.updateDynamic("refresh_token")(refresh_token)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[BodyParameters]
  }
}

