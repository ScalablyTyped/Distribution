package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegationTokenOptions extends js.Object {
  var api_type: java.lang.String
  var grant_type: java.lang.String
  var id_token: java.lang.String
  var scope: java.lang.String
  var target: java.lang.String
}

object DelegationTokenOptions {
  @scala.inline
  def apply(
    api_type: java.lang.String,
    grant_type: java.lang.String,
    id_token: java.lang.String,
    scope: java.lang.String,
    target: java.lang.String
  ): DelegationTokenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("api_type")(api_type)
    __obj.updateDynamic("grant_type")(grant_type)
    __obj.updateDynamic("id_token")(id_token)
    __obj.updateDynamic("scope")(scope)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DelegationTokenOptions]
  }
}

