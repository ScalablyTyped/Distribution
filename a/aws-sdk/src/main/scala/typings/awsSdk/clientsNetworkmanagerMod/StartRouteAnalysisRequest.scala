package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRouteAnalysisRequest extends StObject {
  
  /**
    * The destination.
    */
  var Destination: RouteAnalysisEndpointOptionsSpecification
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId
  
  /**
    * Indicates whether to analyze the return path. The default is false.
    */
  var IncludeReturnPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The source from which traffic originates.
    */
  var Source: RouteAnalysisEndpointOptionsSpecification
  
  /**
    * Indicates whether to include the location of middlebox appliances in the route analysis. The default is false.
    */
  var UseMiddleboxes: js.UndefOr[Boolean] = js.undefined
}
object StartRouteAnalysisRequest {
  
  inline def apply(
    Destination: RouteAnalysisEndpointOptionsSpecification,
    GlobalNetworkId: GlobalNetworkId,
    Source: RouteAnalysisEndpointOptionsSpecification
  ): StartRouteAnalysisRequest = {
    val __obj = js.Dynamic.literal(Destination = Destination.asInstanceOf[js.Any], GlobalNetworkId = GlobalNetworkId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRouteAnalysisRequest]
  }
  
  extension [Self <: StartRouteAnalysisRequest](x: Self) {
    
    inline def setDestination(value: RouteAnalysisEndpointOptionsSpecification): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setIncludeReturnPath(value: Boolean): Self = StObject.set(x, "IncludeReturnPath", value.asInstanceOf[js.Any])
    
    inline def setIncludeReturnPathUndefined: Self = StObject.set(x, "IncludeReturnPath", js.undefined)
    
    inline def setSource(value: RouteAnalysisEndpointOptionsSpecification): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setUseMiddleboxes(value: Boolean): Self = StObject.set(x, "UseMiddleboxes", value.asInstanceOf[js.Any])
    
    inline def setUseMiddleboxesUndefined: Self = StObject.set(x, "UseMiddleboxes", js.undefined)
  }
}
