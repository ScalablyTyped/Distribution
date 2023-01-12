package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNetworkInsightsAnalysisResult extends StObject {
  
  /**
    * The ID of the network insights analysis.
    */
  var NetworkInsightsAnalysisId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAnalysisId] = js.undefined
}
object DeleteNetworkInsightsAnalysisResult {
  
  inline def apply(): DeleteNetworkInsightsAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteNetworkInsightsAnalysisResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteNetworkInsightsAnalysisResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkInsightsAnalysisId(value: NetworkInsightsAnalysisId): Self = StObject.set(x, "NetworkInsightsAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAnalysisIdUndefined: Self = StObject.set(x, "NetworkInsightsAnalysisId", js.undefined)
  }
}
