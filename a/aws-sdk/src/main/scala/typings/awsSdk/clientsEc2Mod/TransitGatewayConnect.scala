package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayConnect extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Connect attachment options.
    */
  var Options: js.UndefOr[TransitGatewayConnectOptions] = js.undefined
  
  /**
    * The state of the attachment.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.undefined
  
  /**
    * The tags for the attachment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Connect attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayAttachmentId] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayId] = js.undefined
  
  /**
    * The ID of the attachment from which the Connect attachment was created.
    */
  var TransportTransitGatewayAttachmentId: js.UndefOr[TransitGatewayAttachmentId] = js.undefined
}
object TransitGatewayConnect {
  
  inline def apply(): TransitGatewayConnect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayConnect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayConnect] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setOptions(value: TransitGatewayConnectOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setState(value: TransitGatewayAttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
    
    inline def setTransitGatewayId(value: TransitGatewayId): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
    
    inline def setTransportTransitGatewayAttachmentId(value: TransitGatewayAttachmentId): Self = StObject.set(x, "TransportTransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransportTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransportTransitGatewayAttachmentId", js.undefined)
  }
}
