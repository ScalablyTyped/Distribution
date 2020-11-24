package typings.amazonConnectStreams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChatAutoAccept extends js.Object {
  
  val chatAutoAccept: Boolean = js.native
  
  val connectionData: String = js.native
  
  val customerName: String | Null = js.native
}
object ChatAutoAccept {
  
  @scala.inline
  def apply(chatAutoAccept: Boolean, connectionData: String): ChatAutoAccept = {
    val __obj = js.Dynamic.literal(chatAutoAccept = chatAutoAccept.asInstanceOf[js.Any], connectionData = connectionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatAutoAccept]
  }
  
  @scala.inline
  implicit class ChatAutoAcceptOps[Self <: ChatAutoAccept] (val x: Self) extends AnyVal {
    
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
    def setChatAutoAccept(value: Boolean): Self = this.set("chatAutoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionData(value: String): Self = this.set("connectionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerName(value: String): Self = this.set("customerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerNameNull: Self = this.set("customerName", null)
  }
}
