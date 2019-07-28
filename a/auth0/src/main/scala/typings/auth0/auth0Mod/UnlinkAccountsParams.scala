package typings.auth0.auth0Mod

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
    val __obj = js.Dynamic.literal(id = id, provider = provider, user_id = user_id)
  
    __obj.asInstanceOf[UnlinkAccountsParams]
  }
}

