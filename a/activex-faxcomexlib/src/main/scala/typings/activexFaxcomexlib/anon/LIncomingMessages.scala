package typings.activexFaxcomexlib.anon

import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LIncomingMessages extends js.Object {
  
  val lIncomingMessages: Double = js.native
  
  val lOutgoingMessages: Double = js.native
  
  val lQueuedMessages: Double = js.native
  
  val lRoutingMessages: Double = js.native
  
  val pFaxServer: FaxServer = js.native
}
object LIncomingMessages {
  
  @scala.inline
  def apply(
    lIncomingMessages: Double,
    lOutgoingMessages: Double,
    lQueuedMessages: Double,
    lRoutingMessages: Double,
    pFaxServer: FaxServer
  ): LIncomingMessages = {
    val __obj = js.Dynamic.literal(lIncomingMessages = lIncomingMessages.asInstanceOf[js.Any], lOutgoingMessages = lOutgoingMessages.asInstanceOf[js.Any], lQueuedMessages = lQueuedMessages.asInstanceOf[js.Any], lRoutingMessages = lRoutingMessages.asInstanceOf[js.Any], pFaxServer = pFaxServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[LIncomingMessages]
  }
  
  @scala.inline
  implicit class LIncomingMessagesOps[Self <: LIncomingMessages] (val x: Self) extends AnyVal {
    
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
    def setLIncomingMessages(value: Double): Self = this.set("lIncomingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLOutgoingMessages(value: Double): Self = this.set("lOutgoingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLQueuedMessages(value: Double): Self = this.set("lQueuedMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLRoutingMessages(value: Double): Self = this.set("lRoutingMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPFaxServer(value: FaxServer): Self = this.set("pFaxServer", value.asInstanceOf[js.Any])
  }
}
