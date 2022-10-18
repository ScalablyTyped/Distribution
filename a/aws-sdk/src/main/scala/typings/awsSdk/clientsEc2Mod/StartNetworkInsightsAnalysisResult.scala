package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartNetworkInsightsAnalysisResult extends StObject {
  
  /**
    * Information about the network insights analysis.
    */
  var NetworkInsightsAnalysis: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAnalysis] = js.undefined
}
object StartNetworkInsightsAnalysisResult {
  
  inline def apply(): StartNetworkInsightsAnalysisResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartNetworkInsightsAnalysisResult]
  }
  
  extension [Self <: StartNetworkInsightsAnalysisResult](x: Self) {
    
    inline def setNetworkInsightsAnalysis(value: NetworkInsightsAnalysis): Self = StObject.set(x, "NetworkInsightsAnalysis", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAnalysisUndefined: Self = StObject.set(x, "NetworkInsightsAnalysis", js.undefined)
  }
}
