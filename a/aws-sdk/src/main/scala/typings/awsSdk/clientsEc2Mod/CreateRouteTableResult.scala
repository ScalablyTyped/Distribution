package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRouteTableResult extends StObject {
  
  /**
    * Information about the route table.
    */
  var RouteTable: js.UndefOr[typings.awsSdk.clientsEc2Mod.RouteTable] = js.undefined
}
object CreateRouteTableResult {
  
  inline def apply(): CreateRouteTableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRouteTableResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRouteTableResult] (val x: Self) extends AnyVal {
    
    inline def setRouteTable(value: RouteTable): Self = StObject.set(x, "RouteTable", value.asInstanceOf[js.Any])
    
    inline def setRouteTableUndefined: Self = StObject.set(x, "RouteTable", js.undefined)
  }
}
