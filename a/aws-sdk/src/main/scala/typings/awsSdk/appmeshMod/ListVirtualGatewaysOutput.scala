package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVirtualGatewaysOutput extends StObject {
  
  /**
    * The nextToken value to include in a future ListVirtualGateways request. When the results of a ListVirtualGateways request exceed limit, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The list of existing virtual gateways for the specified service mesh.
    */
  var virtualGateways: VirtualGatewayList
}
object ListVirtualGatewaysOutput {
  
  inline def apply(virtualGateways: VirtualGatewayList): ListVirtualGatewaysOutput = {
    val __obj = js.Dynamic.literal(virtualGateways = virtualGateways.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVirtualGatewaysOutput]
  }
  
  extension [Self <: ListVirtualGatewaysOutput](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVirtualGateways(value: VirtualGatewayList): Self = StObject.set(x, "virtualGateways", value.asInstanceOf[js.Any])
    
    inline def setVirtualGatewaysVarargs(value: VirtualGatewayRef*): Self = StObject.set(x, "virtualGateways", js.Array(value*))
  }
}
