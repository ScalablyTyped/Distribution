package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkAccountsParams extends js.Object {
  var id: String
  var provider: UnlinkAccountsParamsProvider
  var user_id: String
}

object UnlinkAccountsParams {
  @scala.inline
  def apply(id: String, provider: UnlinkAccountsParamsProvider, user_id: String): UnlinkAccountsParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], provider = provider.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UnlinkAccountsParams]
  }
}

