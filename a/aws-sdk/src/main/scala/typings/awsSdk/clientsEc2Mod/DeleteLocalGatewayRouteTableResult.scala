package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLocalGatewayRouteTableResult extends StObject {
  
  /**
    * Information about the local gateway route table.
    */
  var LocalGatewayRouteTable: js.UndefOr[typings.awsSdk.clientsEc2Mod.LocalGatewayRouteTable] = js.undefined
}
object DeleteLocalGatewayRouteTableResult {
  
  inline def apply(): DeleteLocalGatewayRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteLocalGatewayRouteTableResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLocalGatewayRouteTableResult] (val x: Self) extends AnyVal {
    
    inline def setLocalGatewayRouteTable(value: LocalGatewayRouteTable): Self = StObject.set(x, "LocalGatewayRouteTable", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayRouteTableUndefined: Self = StObject.set(x, "LocalGatewayRouteTable", js.undefined)
  }
}
