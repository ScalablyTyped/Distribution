package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsAccessScopeResult extends StObject {
  
  /**
    * The ID of the Network Access Scope.
    */
  var NetworkInsightsAccessScopeId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeId] = js.undefined
}
object DeleteNetworkInsightsAccessScopeResult {
  
  inline def apply(): DeleteNetworkInsightsAccessScopeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNetworkInsightsAccessScopeResult]
  }
  
  extension [Self <: DeleteNetworkInsightsAccessScopeResult](x: Self) {
    
    inline def setNetworkInsightsAccessScopeId(value: NetworkInsightsAccessScopeId): Self = StObject.set(x, "NetworkInsightsAccessScopeId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeId", js.undefined)
  }
}
