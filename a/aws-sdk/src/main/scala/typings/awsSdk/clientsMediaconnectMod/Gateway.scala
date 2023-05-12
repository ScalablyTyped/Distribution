package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Gateway extends StObject {
  
  /**
    * The range of IP addresses that contribute content or initiate output requests for flows communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var EgressCidrBlocks: listOfString
  
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  var GatewayArn: string
  
  var GatewayMessages: js.UndefOr[listOfMessageDetail] = js.undefined
  
  /**
    * The current status of the gateway.
    */
  var GatewayState: js.UndefOr[typings.awsSdk.clientsMediaconnectMod.GatewayState] = js.undefined
  
  /**
    * The name of the gateway. This name can not be modified after the gateway is created.
    */
  var Name: string
  
  /**
    * The list of networks in the gateway.
    */
  var Networks: listOfGatewayNetwork
}
object Gateway {
  
  inline def apply(EgressCidrBlocks: listOfString, GatewayArn: string, Name: string, Networks: listOfGatewayNetwork): Gateway = {
    val __obj = js.Dynamic.literal(EgressCidrBlocks = EgressCidrBlocks.asInstanceOf[js.Any], GatewayArn = GatewayArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gateway]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Gateway] (val x: Self) extends AnyVal {
    
    inline def setEgressCidrBlocks(value: listOfString): Self = StObject.set(x, "EgressCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setEgressCidrBlocksVarargs(value: string*): Self = StObject.set(x, "EgressCidrBlocks", js.Array(value*))
    
    inline def setGatewayArn(value: string): Self = StObject.set(x, "GatewayArn", value.asInstanceOf[js.Any])
    
    inline def setGatewayMessages(value: listOfMessageDetail): Self = StObject.set(x, "GatewayMessages", value.asInstanceOf[js.Any])
    
    inline def setGatewayMessagesUndefined: Self = StObject.set(x, "GatewayMessages", js.undefined)
    
    inline def setGatewayMessagesVarargs(value: MessageDetail*): Self = StObject.set(x, "GatewayMessages", js.Array(value*))
    
    inline def setGatewayState(value: GatewayState): Self = StObject.set(x, "GatewayState", value.asInstanceOf[js.Any])
    
    inline def setGatewayStateUndefined: Self = StObject.set(x, "GatewayState", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: listOfGatewayNetwork): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksVarargs(value: GatewayNetwork*): Self = StObject.set(x, "Networks", js.Array(value*))
  }
}
