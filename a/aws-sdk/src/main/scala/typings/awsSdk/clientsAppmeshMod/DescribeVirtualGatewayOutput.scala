package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVirtualGatewayOutput extends StObject {
  
  /**
    * The full description of your virtual gateway.
    */
  var virtualGateway: VirtualGatewayData
}
object DescribeVirtualGatewayOutput {
  
  inline def apply(virtualGateway: VirtualGatewayData): DescribeVirtualGatewayOutput = {
    val __obj = js.Dynamic.literal(virtualGateway = virtualGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVirtualGatewayOutput]
  }
  
  extension [Self <: DescribeVirtualGatewayOutput](x: Self) {
    
    inline def setVirtualGateway(value: VirtualGatewayData): Self = StObject.set(x, "virtualGateway", value.asInstanceOf[js.Any])
  }
}
