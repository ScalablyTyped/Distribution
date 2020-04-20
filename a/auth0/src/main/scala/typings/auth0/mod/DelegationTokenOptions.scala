package typings.auth0.mod

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
    val __obj = js.Dynamic.literal(api_type = api_type.asInstanceOf[js.Any], grant_type = grant_type.asInstanceOf[js.Any], id_token = id_token.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelegationTokenOptions]
  }
}

