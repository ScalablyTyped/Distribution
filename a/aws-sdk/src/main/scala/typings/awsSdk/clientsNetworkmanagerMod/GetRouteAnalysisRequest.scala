package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRouteAnalysisRequest extends StObject {
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * The ID of the route analysis.
    */
  var RouteAnalysisId: ConstrainedString
}
object GetRouteAnalysisRequest {
  
  inline def apply(GlobalNetworkId: GlobalNetworkId, RouteAnalysisId: ConstrainedString): GetRouteAnalysisRequest = {
    val __obj = js.Dynamic.literal(GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], RouteAnalysisId = RouteAnalysisId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRouteAnalysisRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRouteAnalysisRequest] (val x: Self) extends AnyVal {
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setRouteAnalysisId(value: ConstrainedString): Self = StObject.set(x, "RouteAnalysisId", value.asInstanceOf[js.Any])
  }
}
