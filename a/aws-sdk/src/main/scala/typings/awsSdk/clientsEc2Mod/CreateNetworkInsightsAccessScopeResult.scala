package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInsightsAccessScopeResult extends StObject {
  
  /**
    * The Network Access Scope.
    */
  var NetworkInsightsAccessScope: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScope] = js.undefined
  
  /**
    * The Network Access Scope content.
    */
  var NetworkInsightsAccessScopeContent: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeContent] = js.undefined
}
object CreateNetworkInsightsAccessScopeResult {
  
  inline def apply(): CreateNetworkInsightsAccessScopeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInsightsAccessScopeResult]
  }
  
  extension [Self <: CreateNetworkInsightsAccessScopeResult](x: Self) {
    
    inline def setNetworkInsightsAccessScope(value: NetworkInsightsAccessScope): Self = StObject.set(x, "NetworkInsightsAccessScope", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeContent(value: NetworkInsightsAccessScopeContent): Self = StObject.set(x, "NetworkInsightsAccessScopeContent", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeContentUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeContent", js.undefined)
    
    inline def setNetworkInsightsAccessScopeUndefined: Self = StObject.set(x, "NetworkInsightsAccessScope", js.undefined)
  }
}
