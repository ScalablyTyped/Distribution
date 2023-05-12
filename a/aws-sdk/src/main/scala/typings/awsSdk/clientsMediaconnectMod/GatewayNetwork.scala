package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GatewayNetwork extends StObject {
  
  /**
    * A unique IP address range to use for this network. These IP addresses should be in the form of a Classless Inter-Domain Routing (CIDR) block; for example, 10.0.0.0/16.
    */
  var CidrBlock: string
  
  /**
    * The name of the network. This name is used to reference the network and must be unique among networks in this gateway.
    */
  var Name: string
}
object GatewayNetwork {
  
  inline def apply(CidrBlock: string, Name: string): GatewayNetwork = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GatewayNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GatewayNetwork] (val x: Self) extends AnyVal {
    
    inline def setCidrBlock(value: string): Self = StObject.set(x, "CidrBlock", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
