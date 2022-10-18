package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransitGateway extends StObject {
  
  /**
    * The creation time.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The description of the transit gateway.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The transit gateway options.
    */
  var Options: js.UndefOr[TransitGatewayOptions] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the transit gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the transit gateway.
    */
  var State: js.UndefOr[TransitGatewayState] = js.undefined
  
  /**
    * The tags for the transit gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the transit gateway.
    */
  var TransitGatewayArn: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
}
object TransitGateway {
  
  inline def apply(): TransitGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransitGateway]
  }
  
  extension [Self <: TransitGateway](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setOptions(value: TransitGatewayOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: TransitGatewayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTransitGatewayArn(value: String): Self = StObject.set(x, "TransitGatewayArn", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayArnUndefined: Self = StObject.set(x, "TransitGatewayArn", js.undefined)
    
    inline def setTransitGatewayId(value: String): Self = StObject.set(x, "TransitGatewayId", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdUndefined: Self = StObject.set(x, "TransitGatewayId", js.undefined)
  }
}
