package typings.auth0.auth0Mod

import typings.auth0.Anon_Email
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var access_token: js.UndefOr[String] = js.undefined
  var connection: String
  var isSocial: Boolean
  var profileData: js.UndefOr[Anon_Email] = js.undefined
  var provider: String
  var user_id: String
}

object Identity {
  @scala.inline
  def apply(
    connection: String,
    isSocial: Boolean,
    provider: String,
    user_id: String,
    access_token: String = null,
    profileData: Anon_Email = null
  ): Identity = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], isSocial = isSocial.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (profileData != null) __obj.updateDynamic("profileData")(profileData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

