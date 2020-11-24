package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeBlindTransfer extends Event {
  
  /**
    * The bridge being transferred.
    */
  var bridge: Bridge = js.native
  
  /**
    * The channel performing the blind transfer.
    */
  var channel: Channel = js.native
  
  /**
    * The context transferred to.
    */
  var context: String = js.native
  
  /**
    * The extension transferred to.
    */
  var exten: String = js.native
  
  /**
    * Whether the transfer was externally initiated or not.
    */
  var is_external: Boolean = js.native
  
  /**
    * The channel that is replacing transferer when the transferee(s) can not be transferred directly.
    */
  var replace_channel: js.UndefOr[Channel] = js.native
  
  /**
    * The result of the transfer attempt.
    */
  var result: String = js.native
  
  /**
    * The channel that is being transferred.
    */
  var transferee: js.UndefOr[Channel] = js.native
}
object BridgeBlindTransfer {
  
  @scala.inline
  def apply(
    application: String,
    bridge: Bridge,
    channel: Channel,
    context: String,
    exten: String,
    is_external: Boolean,
    result: String,
    timestamp: Date,
    `type`: String
  ): BridgeBlindTransfer = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], exten = exten.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeBlindTransfer]
  }
  
  @scala.inline
  implicit class BridgeBlindTransferOps[Self <: BridgeBlindTransfer] (val x: Self) extends AnyVal {
    
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
    def setBridge(value: Bridge): Self = this.set("bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExten(value: String): Self = this.set("exten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_external(value: Boolean): Self = this.set("is_external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace_channel(value: Channel): Self = this.set("replace_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplace_channel: Self = this.set("replace_channel", js.undefined)
    
    @scala.inline
    def setTransferee(value: Channel): Self = this.set("transferee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransferee: Self = this.set("transferee", js.undefined)
  }
}
