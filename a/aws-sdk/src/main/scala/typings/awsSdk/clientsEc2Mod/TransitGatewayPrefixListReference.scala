package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGatewayPrefixListReference extends StObject {
  
  /**
    * Indicates whether traffic that matches this route is dropped.
    */
  var Blackhole: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the prefix list.
    */
  var PrefixListId: js.UndefOr[PrefixListResourceId] = js.undefined
  
  /**
    * The ID of the prefix list owner.
    */
  var PrefixListOwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the prefix list reference.
    */
  var State: js.UndefOr[TransitGatewayPrefixListReferenceState] = js.undefined
  
  /**
    * Information about the transit gateway attachment.
    */
  var TransitGatewayAttachment: js.UndefOr[TransitGatewayPrefixListAttachment] = js.undefined
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableId] = js.undefined
}
object TransitGatewayPrefixListReference {
  
  inline def apply(): TransitGatewayPrefixListReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGatewayPrefixListReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransitGatewayPrefixListReference] (val x: Self) extends AnyVal {
    
    inline def setBlackhole(value: Boolean): Self = StObject.set(x, "Blackhole", value.asInstanceOf[js.Any])
    
    inline def setBlackholeUndefined: Self = StObject.set(x, "Blackhole", js.undefined)
    
    inline def setPrefixListId(value: PrefixListResourceId): Self = StObject.set(x, "PrefixListId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdUndefined: Self = StObject.set(x, "PrefixListId", js.undefined)
    
    inline def setPrefixListOwnerId(value: String): Self = StObject.set(x, "PrefixListOwnerId", value.asInstanceOf[js.Any])
    
    inline def setPrefixListOwnerIdUndefined: Self = StObject.set(x, "PrefixListOwnerId", js.undefined)
    
    inline def setState(value: TransitGatewayPrefixListReferenceState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTransitGatewayAttachment(value: TransitGatewayPrefixListAttachment): Self = StObject.set(x, "TransitGatewayAttachment", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayAttachmentUndefined: Self = StObject.set(x, "TransitGatewayAttachment", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableIdUndefined: Self = StObject.set(x, "TransitGatewayRouteTableId", js.undefined)
  }
}
