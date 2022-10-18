package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNetworkInsightsAccessScopeAnalysesResult extends StObject {
  
  /**
    * The Network Access Scope analyses.
    */
  var NetworkInsightsAccessScopeAnalyses: js.UndefOr[NetworkInsightsAccessScopeAnalysisList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeNetworkInsightsAccessScopeAnalysesResult {
  
  inline def apply(): DescribeNetworkInsightsAccessScopeAnalysesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNetworkInsightsAccessScopeAnalysesResult]
  }
  
  extension [Self <: DescribeNetworkInsightsAccessScopeAnalysesResult](x: Self) {
    
    inline def setNetworkInsightsAccessScopeAnalyses(value: NetworkInsightsAccessScopeAnalysisList): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalyses", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysesUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalyses", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysesVarargs(value: NetworkInsightsAccessScopeAnalysis*): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalyses", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
