package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
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
  implicit class BridgeBlindTransferMutableBuilder[Self <: BridgeBlindTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExten(value: String): Self = StObject.set(x, "exten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_external(value: Boolean): Self = StObject.set(x, "is_external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace_channel(value: Channel): Self = StObject.set(x, "replace_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace_channelUndefined: Self = StObject.set(x, "replace_channel", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferee(value: Channel): Self = StObject.set(x, "transferee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfereeUndefined: Self = StObject.set(x, "transferee", js.undefined)
  }
}
