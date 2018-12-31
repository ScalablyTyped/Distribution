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

