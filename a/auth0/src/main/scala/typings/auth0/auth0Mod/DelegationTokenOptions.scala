package typings.auth0.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelegationTokenOptions extends js.Object {
  var api_type: String
  var grant_type: String
  var id_token: String
  var scope: String
  var target: String
}

object DelegationTokenOptions {
  @scala.inline
  def apply(api_type: String, grant_type: String, id_token: String, scope: String, target: String): DelegationTokenOptions = {
    val __obj = js.Dynamic.literal(api_type = api_type, grant_type = grant_type, id_token = id_token, scope = scope, target = target)
  
    __obj.asInstanceOf[DelegationTokenOptions]
  }
}

