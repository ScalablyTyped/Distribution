package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGatewayRequest extends StObject {
  
  /**
    * The range of IP addresses that are allowed to contribute content or initiate output requests for flows communicating with this gateway. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var EgressCidrBlocks: listOfString
  
  /**
    * The name of the gateway. This name can not be modified after the gateway is created.
    */
  var Name: string
  
  /**
    * The list of networks that you want to add.
    */
  var Networks: listOfGatewayNetwork
}
object CreateGatewayRequest {
  
  inline def apply(EgressCidrBlocks: listOfString, Name: string, Networks: listOfGatewayNetwork): CreateGatewayRequest = {
    val __obj = js.Dynamic.literal(EgressCidrBlocks = EgressCidrBlocks.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Networks = Networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGatewayRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGatewayRequest] (val x: Self) extends AnyVal {
    
    inline def setEgressCidrBlocks(value: listOfString): Self = StObject.set(x, "EgressCidrBlocks", value.asInstanceOf[js.Any])
    
    inline def setEgressCidrBlocksVarargs(value: string*): Self = StObject.set(x, "EgressCidrBlocks", js.Array(value*))
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNetworks(value: listOfGatewayNetwork): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    inline def setNetworksVarargs(value: GatewayNetwork*): Self = StObject.set(x, "Networks", js.Array(value*))
  }
}
