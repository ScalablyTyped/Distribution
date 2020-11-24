package typings.actionsOnGoogle.conversationConversationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OAuth2Config extends js.Object {
  
  /** @public */
  var client: OAuth2ConfigClient = js.native
}
object OAuth2Config {
  
  @scala.inline
  def apply(client: OAuth2ConfigClient): OAuth2Config = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuth2Config]
  }
  
  @scala.inline
  implicit class OAuth2ConfigOps[Self <: OAuth2Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClient(value: OAuth2ConfigClient): Self = this.set("client", value.asInstanceOf[js.Any])
  }
}
