package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkAccountsResponse extends js.Object {
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  var connection: java.lang.String
  var isSocial: js.UndefOr[scala.Boolean] = js.undefined
  var profileData: js.UndefOr[UnlinkAccountsResponseProfile] = js.undefined
  var provider: java.lang.String
  var user_id: java.lang.String
}

object UnlinkAccountsResponse {
  @scala.inline
  def apply(
    connection: java.lang.String,
    provider: java.lang.String,
    user_id: java.lang.String,
    access_token: java.lang.String = null,
    isSocial: js.UndefOr[scala.Boolean] = js.undefined,
    profileData: UnlinkAccountsResponseProfile = null
  ): UnlinkAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("user_id")(user_id)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (!js.isUndefined(isSocial)) __obj.updateDynamic("isSocial")(isSocial)
    if (profileData != null) __obj.updateDynamic("profileData")(profileData)
    __obj.asInstanceOf[UnlinkAccountsResponse]
  }
}

