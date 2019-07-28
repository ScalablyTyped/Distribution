package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkAccountsResponse extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var connection: String
  var isSocial: js.UndefOr[Boolean] = js.undefined
  var profileData: js.UndefOr[UnlinkAccountsResponseProfile] = js.undefined
  var provider: String
  var user_id: String
}

object UnlinkAccountsResponse {
  @scala.inline
  def apply(
    connection: String,
    provider: String,
    user_id: String,
    access_token: String = null,
    isSocial: js.UndefOr[Boolean] = js.undefined,
    profileData: UnlinkAccountsResponseProfile = null
  ): UnlinkAccountsResponse = {
    val __obj = js.Dynamic.literal(connection = connection, provider = provider, user_id = user_id)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (!js.isUndefined(isSocial)) __obj.updateDynamic("isSocial")(isSocial)
    if (profileData != null) __obj.updateDynamic("profileData")(profileData)
    __obj.asInstanceOf[UnlinkAccountsResponse]
  }
}

