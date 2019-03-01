package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identity extends js.Object {
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  var connection: java.lang.String
  var isSocial: scala.Boolean
  var profileData: js.UndefOr[auth0Lib.Anon_Email] = js.undefined
  var provider: java.lang.String
  var user_id: java.lang.String
}

object Identity {
  @scala.inline
  def apply(
    connection: java.lang.String,
    isSocial: scala.Boolean,
    provider: java.lang.String,
    user_id: java.lang.String,
    access_token: java.lang.String = null,
    profileData: auth0Lib.Anon_Email = null
  ): Identity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("isSocial")(isSocial)
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("user_id")(user_id)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (profileData != null) __obj.updateDynamic("profileData")(profileData)
    __obj.asInstanceOf[Identity]
  }
}

