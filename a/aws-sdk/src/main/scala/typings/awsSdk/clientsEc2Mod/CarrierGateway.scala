package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarrierGateway extends StObject {
  
  /**
    * The ID of the carrier gateway.
    */
  var CarrierGatewayId: js.UndefOr[typings.awsSdk.clientsEc2Mod.CarrierGatewayId] = js.undefined
  
  /**
    * The Amazon Web Services account ID of the owner of the carrier gateway.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * The state of the carrier gateway.
    */
  var State: js.UndefOr[CarrierGatewayState] = js.undefined
  
  /**
    * The tags assigned to the carrier gateway.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the VPC associated with the carrier gateway.
    */
  var VpcId: js.UndefOr[typings.awsSdk.clientsEc2Mod.VpcId] = js.undefined
}
object CarrierGateway {
  
  inline def apply(): CarrierGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarrierGateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CarrierGateway] (val x: Self) extends AnyVal {
    
    inline def setCarrierGatewayId(value: CarrierGatewayId): Self = StObject.set(x, "CarrierGatewayId", value.asInstanceOf[js.Any])
    
    inline def setCarrierGatewayIdUndefined: Self = StObject.set(x, "CarrierGatewayId", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setState(value: CarrierGatewayState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
