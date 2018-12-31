package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0UserProfile extends js.Object {
  var app_metadata: js.UndefOr[js.Any] = js.undefined
  var clientID: java.lang.String
  var created_at: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var email_verified: js.UndefOr[scala.Boolean] = js.undefined
  var family_name: js.UndefOr[java.lang.String] = js.undefined
  var gender: js.UndefOr[java.lang.String] = js.undefined
  var given_name: js.UndefOr[java.lang.String] = js.undefined
  var identities: js.Array[Auth0Identity]
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var nickname: java.lang.String
  var picture: java.lang.String
  var sub: java.lang.String
  var updated_at: java.lang.String
  var user_id: java.lang.String
  var user_metadata: js.UndefOr[js.Any] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

