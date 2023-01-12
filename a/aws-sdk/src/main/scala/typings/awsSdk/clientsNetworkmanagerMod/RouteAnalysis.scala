package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteAnalysis extends StObject {
  
  /**
    * The destination.
    */
  var Destination: js.UndefOr[RouteAnalysisEndpointOptions] = js.undefined
  
  /**
    * The forward path.
    */
  var ForwardPath: js.UndefOr[RouteAnalysisPath] = js.undefined
  
  /**
    * The ID of the global network.
    */
  var GlobalNetworkId: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.GlobalNetworkId] = js.undefined
  
  /**
    * Indicates whether to analyze the return path. The return path is not analyzed if the forward path analysis does not succeed.
    */
  var IncludeReturnPath: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AWS account that created the route analysis.
    */
  var OwnerAccountId: js.UndefOr[AWSAccountId] = js.undefined
  
  /**
    * The return path.
    */
  var ReturnPath: js.UndefOr[RouteAnalysisPath] = js.undefined
  
  /**
    * The ID of the route analysis.
    */
  var RouteAnalysisId: js.UndefOr[ConstrainedString] = js.undefined
  
  /**
    * The source.
    */
  var Source: js.UndefOr[RouteAnalysisEndpointOptions] = js.undefined
  
  /**
    * The time that the analysis started.
    */
  var StartTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the route analysis.
    */
  var Status: js.UndefOr[RouteAnalysisStatus] = js.undefined
  
  /**
    * Indicates whether to include the location of middlebox appliances in the route analysis.
    */
  var UseMiddleboxes: js.UndefOr[Boolean] = js.undefined
}
object RouteAnalysis {
  
  inline def apply(): RouteAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteAnalysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteAnalysis] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: RouteAnalysisEndpointOptions): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setForwardPath(value: RouteAnalysisPath): Self = StObject.set(x, "ForwardPath", value.asInstanceOf[js.Any])
    
    inline def setForwardPathUndefined: Self = StObject.set(x, "ForwardPath", js.undefined)
    
    inline def setGlobalNetworkId(value: GlobalNetworkId): Self = StObject.set(x, "GlobalNetworkId", value.asInstanceOf[js.Any])
    
    inline def setGlobalNetworkIdUndefined: Self = StObject.set(x, "GlobalNetworkId", js.undefined)
    
    inline def setIncludeReturnPath(value: Boolean): Self = StObject.set(x, "IncludeReturnPath", value.asInstanceOf[js.Any])
    
    inline def setIncludeReturnPathUndefined: Self = StObject.set(x, "IncludeReturnPath", js.undefined)
    
    inline def setOwnerAccountId(value: AWSAccountId): Self = StObject.set(x, "OwnerAccountId", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountIdUndefined: Self = StObject.set(x, "OwnerAccountId", js.undefined)
    
    inline def setReturnPath(value: RouteAnalysisPath): Self = StObject.set(x, "ReturnPath", value.asInstanceOf[js.Any])
    
    inline def setReturnPathUndefined: Self = StObject.set(x, "ReturnPath", js.undefined)
    
    inline def setRouteAnalysisId(value: ConstrainedString): Self = StObject.set(x, "RouteAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setRouteAnalysisIdUndefined: Self = StObject.set(x, "RouteAnalysisId", js.undefined)
    
    inline def setSource(value: RouteAnalysisEndpointOptions): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStartTimestamp(value: js.Date): Self = StObject.set(x, "StartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampUndefined: Self = StObject.set(x, "StartTimestamp", js.undefined)
    
    inline def setStatus(value: RouteAnalysisStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUseMiddleboxes(value: Boolean): Self = StObject.set(x, "UseMiddleboxes", value.asInstanceOf[js.Any])
    
    inline def setUseMiddleboxesUndefined: Self = StObject.set(x, "UseMiddleboxes", js.undefined)
  }
}
