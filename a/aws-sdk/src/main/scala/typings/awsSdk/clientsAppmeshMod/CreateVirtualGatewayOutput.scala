package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualGatewayOutput extends StObject {
  
  /**
    * The full description of your virtual gateway following the create call.
    */
  var virtualGateway: VirtualGatewayData
}
object CreateVirtualGatewayOutput {
  
  inline def apply(virtualGateway: VirtualGatewayData): CreateVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualGatewayOutput]
  }
  
  extension [Self <: CreateVirtualGatewayOutput](x: Self) {
    
    inline def setVirtualGateway(value: VirtualGatewayData): Self = StObject.set(x, "virtualGateway", value.asInstanceOf[js.Any])
  }
}
