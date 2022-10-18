package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsAccessScopeAnalysisResult extends StObject {
  
  /**
    * The ID of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeAnalysisId] = js.undefined
}
object DeleteNetworkInsightsAccessScopeAnalysisResult {
  
  inline def apply(): DeleteNetworkInsightsAccessScopeAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNetworkInsightsAccessScopeAnalysisResult]
  }
  
  extension [Self <: DeleteNetworkInsightsAccessScopeAnalysisResult](x: Self) {
    
    inline def setNetworkInsightsAccessScopeAnalysisId(value: NetworkInsightsAccessScopeAnalysisId): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", js.undefined)
  }
}
