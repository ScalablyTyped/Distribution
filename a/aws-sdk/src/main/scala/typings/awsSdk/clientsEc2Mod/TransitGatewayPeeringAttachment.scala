package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPeeringAttachment extends StObject {
  
  /**
    * Information about the accepter transit gateway.
    */
  var AccepterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.undefined
  
  /**
    * The ID of the accepter transit gateway attachment.
    */
  var AccepterTransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
  
  /**
    * The time the transit gateway peering attachment was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Details about the transit gateway peering attachment.
    */
  var Options: js.UndefOr[TransitGatewayPeeringAttachmentOptions] = js.undefined
  
  /**
    * Information about the requester transit gateway.
    */
  var RequesterTgwInfo: js.UndefOr[PeeringTgwInfo] = js.undefined
  
  /**
    * The state of the transit gateway peering attachment. Note that the initiating state has been deprecated.
    */
  var State: js.UndefOr[TransitGatewayAttachmentState] = js.undefined
  
  /**
    * The status of the transit gateway peering attachment.
    */
  var Status: js.UndefOr[PeeringAttachmentStatus] = js.undefined
  
  /**
    * The tags for the transit gateway peering attachment.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the transit gateway peering attachment.
    */
  var TransitGatewayAttachmentId: js.UndefOr[String] = js.undefined
}
object TransitGatewayPeeringAttachment {
  
  inline def apply(): TransitGatewayPeeringAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPeeringAttachment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayPeeringAttachment] (val x: Self) extends AnyVal {
    
    inline def setAccepterTgwInfo(value: PeeringTgwInfo): Self = StObject.set(x, "AccepterTgwInfo", value.asInstanceOf[js.Any])
    
    inline def setAccepterTgwInfoUndefined: Self = StObject.set(x, "AccepterTgwInfo", js.undefined)
    
    inline def setAccepterTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "AccepterTransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setAccepterTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "AccepterTransitGatewayAttachmentId", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setOptions(value: TransitGatewayPeeringAttachmentOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setRequesterTgwInfo(value: PeeringTgwInfo): Self = StObject.set(x, "RequesterTgwInfo", value.asInstanceOf[js.Any])
    
    inline def setRequesterTgwInfoUndefined: Self = StObject.set(x, "RequesterTgwInfo", js.undefined)
    
    inline def setState(value: TransitGatewayAttachmentState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStatus(value: PeeringAttachmentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayAttachmentId(value: String): Self = StObject.set(x, "TransitGatewayAttachmentId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentIdUndefined: Self = StObject.set(x, "TransitGatewayAttachmentId", js.undefined)
  }
}
