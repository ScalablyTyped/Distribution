package typings.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuth2Config extends js.Object {
  /** @public */
  var client: OAuth2ConfigClient
}

object OAuth2Config {
  @scala.inline
  def apply(client: OAuth2ConfigClient): OAuth2Config = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OAuth2Config]
  }
}

