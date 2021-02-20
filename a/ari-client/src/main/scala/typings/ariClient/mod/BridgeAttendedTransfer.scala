package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeAttendedTransfer extends Event {
  
  /**
    * Application that has been transferred into.
    */
  var destination_application: String = js.native
  
  /**
    * Bridge that survived the merge result.
    */
  var destination_bridge: String = js.native
  
  /**
    * First leg of a link transfer result.
    */
  var destination_link_first_leg: Channel = js.native
  
  /**
    * Second leg of a link transfer result.
    */
  var destination_link_second_leg: Channel = js.native
  
  /**
    * Bridge that survived the threeway result.
    */
  var destination_threeway_bridge: Bridge = js.native
  
  /**
    * Transferer channel that survived the threeway result.
    */
  var destination_threeway_channel: Channel = js.native
  
  /**
    * How the transfer was accomplished.
    */
  var destination_type: String = js.native
  
  /**
    * Whether the transfer was externally initiated or not.
    */
  var is_external: Boolean = js.native
  
  /**
    * The channel that is replacing transferer_first_leg in the swap.
    */
  var replace_channel: js.UndefOr[Channel] = js.native
  
  /**
    * The result of the transfer attempt.
    */
  var result: String = js.native
  
  /**
    * The channel that is being transferred to.
    */
  var transfer_target: js.UndefOr[Channel] = js.native
  
  /**
    * The channel that is being transferred.
    */
  var transferee: js.UndefOr[Channel] = js.native
  
  /**
    * First leg of the transferer.
    */
  var transferer_first_leg: Channel = js.native
  
  /**
    * Bridge the transferer first leg is in.
    */
  var transferer_first_leg_bridge: Bridge = js.native
  
  /**
    * Second leg of the transferer.
    */
  var transferer_second_leg: Channel = js.native
  
  /**
    * Bridge the transferer second leg is in.
    */
  var transferer_second_leg_bridge: Bridge = js.native
}
object BridgeAttendedTransfer {
  
  @scala.inline
  def apply(
    application: String,
    destination_application: String,
    destination_bridge: String,
    destination_link_first_leg: Channel,
    destination_link_second_leg: Channel,
    destination_threeway_bridge: Bridge,
    destination_threeway_channel: Channel,
    destination_type: String,
    is_external: Boolean,
    result: String,
    timestamp: Date,
    transferer_first_leg: Channel,
    transferer_first_leg_bridge: Bridge,
    transferer_second_leg: Channel,
    transferer_second_leg_bridge: Bridge,
    `type`: String
  ): BridgeAttendedTransfer = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], destination_application = destination_application.asInstanceOf[js.Any], destination_bridge = destination_bridge.asInstanceOf[js.Any], destination_link_first_leg = destination_link_first_leg.asInstanceOf[js.Any], destination_link_second_leg = destination_link_second_leg.asInstanceOf[js.Any], destination_threeway_bridge = destination_threeway_bridge.asInstanceOf[js.Any], destination_threeway_channel = destination_threeway_channel.asInstanceOf[js.Any], destination_type = destination_type.asInstanceOf[js.Any], is_external = is_external.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transferer_first_leg = transferer_first_leg.asInstanceOf[js.Any], transferer_first_leg_bridge = transferer_first_leg_bridge.asInstanceOf[js.Any], transferer_second_leg = transferer_second_leg.asInstanceOf[js.Any], transferer_second_leg_bridge = transferer_second_leg_bridge.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeAttendedTransfer]
  }
  
  @scala.inline
  implicit class BridgeAttendedTransferMutableBuilder[Self <: BridgeAttendedTransfer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination_application(value: String): Self = StObject.set(x, "destination_application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_bridge(value: String): Self = StObject.set(x, "destination_bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_link_first_leg(value: Channel): Self = StObject.set(x, "destination_link_first_leg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_link_second_leg(value: Channel): Self = StObject.set(x, "destination_link_second_leg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_threeway_bridge(value: Bridge): Self = StObject.set(x, "destination_threeway_bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_threeway_channel(value: Channel): Self = StObject.set(x, "destination_threeway_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestination_type(value: String): Self = StObject.set(x, "destination_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_external(value: Boolean): Self = StObject.set(x, "is_external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace_channel(value: Channel): Self = StObject.set(x, "replace_channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplace_channelUndefined: Self = StObject.set(x, "replace_channel", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_target(value: Channel): Self = StObject.set(x, "transfer_target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfer_targetUndefined: Self = StObject.set(x, "transfer_target", js.undefined)
    
    @scala.inline
    def setTransferee(value: Channel): Self = StObject.set(x, "transferee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransfereeUndefined: Self = StObject.set(x, "transferee", js.undefined)
    
    @scala.inline
    def setTransferer_first_leg(value: Channel): Self = StObject.set(x, "transferer_first_leg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferer_first_leg_bridge(value: Bridge): Self = StObject.set(x, "transferer_first_leg_bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferer_second_leg(value: Channel): Self = StObject.set(x, "transferer_second_leg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferer_second_leg_bridge(value: Bridge): Self = StObject.set(x, "transferer_second_leg_bridge", value.asInstanceOf[js.Any])
  }
}
