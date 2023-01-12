package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRouteAnalysisResponse extends StObject {
  
  /**
    * The route analysis.
    */
  var RouteAnalysis: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.RouteAnalysis] = js.undefined
}
object StartRouteAnalysisResponse {
  
  inline def apply(): StartRouteAnalysisResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRouteAnalysisResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartRouteAnalysisResponse] (val x: Self) extends AnyVal {
    
    inline def setRouteAnalysis(value: RouteAnalysis): Self = StObject.set(x, "RouteAnalysis", value.asInstanceOf[js.Any])
    
    inline def setRouteAnalysisUndefined: Self = StObject.set(x, "RouteAnalysis", js.undefined)
  }
}
