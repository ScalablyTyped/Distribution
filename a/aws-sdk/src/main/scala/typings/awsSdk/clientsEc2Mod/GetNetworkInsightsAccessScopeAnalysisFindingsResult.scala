package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkInsightsAccessScopeAnalysisFindingsResult extends StObject {
  
  /**
    * The findings associated with Network Access Scope Analysis.
    */
  var AnalysisFindings: js.UndefOr[AccessScopeAnalysisFindingList] = js.undefined
  
  /**
    * The status of Network Access Scope Analysis.
    */
  var AnalysisStatus: js.UndefOr[typings.awsSdk.clientsEc2Mod.AnalysisStatus] = js.undefined
  
  /**
    * The ID of the Network Access Scope analysis.
    */
  var NetworkInsightsAccessScopeAnalysisId: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkInsightsAccessScopeAnalysisId] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetNetworkInsightsAccessScopeAnalysisFindingsResult {
  
  inline def apply(): GetNetworkInsightsAccessScopeAnalysisFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkInsightsAccessScopeAnalysisFindingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkInsightsAccessScopeAnalysisFindingsResult] (val x: Self) extends AnyVal {
    
    inline def setAnalysisFindings(value: AccessScopeAnalysisFindingList): Self = StObject.set(x, "AnalysisFindings", value.asInstanceOf[js.Any])
    
    inline def setAnalysisFindingsUndefined: Self = StObject.set(x, "AnalysisFindings", js.undefined)
    
    inline def setAnalysisFindingsVarargs(value: AccessScopeAnalysisFinding*): Self = StObject.set(x, "AnalysisFindings", js.Array(value*))
    
    inline def setAnalysisStatus(value: AnalysisStatus): Self = StObject.set(x, "AnalysisStatus", value.asInstanceOf[js.Any])
    
    inline def setAnalysisStatusUndefined: Self = StObject.set(x, "AnalysisStatus", js.undefined)
    
    inline def setNetworkInsightsAccessScopeAnalysisId(value: NetworkInsightsAccessScopeAnalysisId): Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInsightsAccessScopeAnalysisIdUndefined: Self = StObject.set(x, "NetworkInsightsAccessScopeAnalysisId", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
