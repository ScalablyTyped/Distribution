package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsPathResult extends StObject {
  
  /**
    * The ID of the path.
    */
  var NetworkInsightsPathId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsPathId] = js.undefined
}
object DeleteNetworkInsightsPathResult {
  
  inline def apply(): DeleteNetworkInsightsPathResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNetworkInsightsPathResult]
  }
  
  extension [Self <: DeleteNetworkInsightsPathResult](x: Self) {
    
    inline def setNetworkInsightsPathId(value: NetworkInsightsPathId): Self = StObject.set(x, "NetworkInsightsPathId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsPathIdUndefined: Self = StObject.set(x, "NetworkInsightsPathId", js.undefined)
  }
}
