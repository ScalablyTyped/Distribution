package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTransitGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the deleted transit gateway route table.
    */
  var TransitGatewayRouteTable: js.UndefOr[typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTable] = js.undefined
}
object DeleteTransitGatewayRouteTableResult {
  
  inline def apply(): DeleteTransitGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTransitGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTransitGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
    inline def setTransitGatewayRouteTable(value: TransitGatewayRouteTable): Self = StObject.set(x, "TransitGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayRouteTableUndefined: Self = StObject.set(x, "TransitGatewayRouteTable", js.undefined)
  }
}
