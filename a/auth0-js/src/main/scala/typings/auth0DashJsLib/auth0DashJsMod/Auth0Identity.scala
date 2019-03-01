package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Identity extends js.Object {
  var connection: java.lang.String
  var isSocial: scala.Boolean
  var provider: java.lang.String
  var user_id: java.lang.String
}

object Auth0Identity {
  @scala.inline
  def apply(
    connection: java.lang.String,
    isSocial: scala.Boolean,
    provider: java.lang.String,
    user_id: java.lang.String
  ): Auth0Identity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("isSocial")(isSocial)
    __obj.updateDynamic("provider")(provider)
    __obj.updateDynamic("user_id")(user_id)
    __obj.asInstanceOf[Auth0Identity]
  }
}

