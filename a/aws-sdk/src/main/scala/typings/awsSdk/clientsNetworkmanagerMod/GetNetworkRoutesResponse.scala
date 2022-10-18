package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkRoutesResponse extends StObject {
  
  /**
    * Describes a core network segment edge.
    */
  var CoreNetworkSegmentEdge: js.UndefOr[CoreNetworkSegmentEdgeIdentifier] = js.undefined
  
  /**
    * The network routes.
    */
  var NetworkRoutes: js.UndefOr[NetworkRouteList] = js.undefined
  
  /**
    * The ARN of the route table.
    */
  var RouteTableArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The route table creation time.
    */
  var RouteTableTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The route table type.
    */
  var RouteTableType: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.RouteTableType] = js.undefined
}
object GetNetworkRoutesResponse {
  
  inline def apply(): GetNetworkRoutesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkRoutesResponse]
  }
  
  extension [Self <: GetNetworkRoutesResponse](x: Self) {
    
    inline def setCoreNetworkSegmentEdge(value: CoreNetworkSegmentEdgeIdentifier): Self = StObject.set(x, "CoreNetworkSegmentEdge", value.asInstanceOf[js.Any])
    
    inline def setCoreNetworkSegmentEdgeUndefined: Self = StObject.set(x, "CoreNetworkSegmentEdge", js.undefined)
    
    inline def setNetworkRoutes(value: NetworkRouteList): Self = StObject.set(x, "NetworkRoutes", value.asInstanceOf[js.Any])
    
    inline def setNetworkRoutesUndefined: Self = StObject.set(x, "NetworkRoutes", js.undefined)
    
    inline def setNetworkRoutesVarargs(value: NetworkRoute*): Self = StObject.set(x, "NetworkRoutes", js.Array(value*))
    
    inline def setRouteTableArn(value: ResourceArn): Self = StObject.set(x, "RouteTableArn", value.asInstanceOf[js.Any])
    
    inline def setRouteTableArnUndefined: Self = StObject.set(x, "RouteTableArn", js.undefined)
    
    inline def setRouteTableTimestamp(value: js.Date): Self = StObject.set(x, "RouteTableTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRouteTableTimestampUndefined: Self = StObject.set(x, "RouteTableTimestamp", js.undefined)
    
    inline def setRouteTableType(value: RouteTableType): Self = StObject.set(x, "RouteTableType", value.asInstanceOf[js.Any])
    
    inline def setRouteTableTypeUndefined: Self = StObject.set(x, "RouteTableType", js.undefined)
  }
}
