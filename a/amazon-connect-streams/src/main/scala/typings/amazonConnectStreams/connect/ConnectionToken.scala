package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.anon.Expiry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionToken extends js.Object {
  
  val chatTokenTransport: Expiry = js.native
}
object ConnectionToken {
  
  @scala.inline
  def apply(chatTokenTransport: Expiry): ConnectionToken = {
    val __obj = js.Dynamic.literal(chatTokenTransport = chatTokenTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionToken]
  }
  
  @scala.inline
  implicit class ConnectionTokenOps[Self <: ConnectionToken] (val x: Self) extends AnyVal {
    
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
    def setChatTokenTransport(value: Expiry): Self = this.set("chatTokenTransport", value.asInstanceOf[js.Any])
  }
}
