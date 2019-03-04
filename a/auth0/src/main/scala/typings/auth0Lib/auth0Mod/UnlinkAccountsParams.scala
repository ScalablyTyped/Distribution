package typings
package auth0Lib.auth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnlinkAccountsParams extends js.Object {
  var id: java.lang.String
  var provider: UnlinkAccountsParamsProvider
  var user_id: java.lang.String
}

object UnlinkAccountsParams {
  @scala.inline
  def apply(id: java.lang.String, provider: UnlinkAccountsParamsProvider, user_id: java.lang.String): UnlinkAccountsParams = {
    val __obj = js.Dynamic.literal(id = id, provider = provider, user_id = user_id)
  
    __obj.asInstanceOf[UnlinkAccountsParams]
  }
}

