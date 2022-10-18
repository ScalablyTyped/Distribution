package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConformancePackComplianceDetailsResponse extends StObject {
  
  /**
    * Name of the conformance pack.
    */
  var ConformancePackName: typings.awsSdk.clientsConfigserviceMod.ConformancePackName
  
  /**
    * Returns a list of ConformancePackEvaluationResult objects.
    */
  var ConformancePackRuleEvaluationResults: js.UndefOr[ConformancePackRuleEvaluationResultsList] = js.undefined
  
  /**
    * The nextToken string returned in a previous request that you use to request the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object GetConformancePackComplianceDetailsResponse {
  
  inline def apply(ConformancePackName: ConformancePackName): GetConformancePackComplianceDetailsResponse = {
    val __obj = js.Dynamic.literal(ConformancePackName = ConformancePackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConformancePackComplianceDetailsResponse]
  }
  
  extension [Self <: GetConformancePackComplianceDetailsResponse](x: Self) {
    
    inline def setConformancePackName(value: ConformancePackName): Self = StObject.set(x, "ConformancePackName", value.asInstanceOf[js.Any])
    
    inline def setConformancePackRuleEvaluationResults(value: ConformancePackRuleEvaluationResultsList): Self = StObject.set(x, "ConformancePackRuleEvaluationResults", value.asInstanceOf[js.Any])
    
    inline def setConformancePackRuleEvaluationResultsUndefined: Self = StObject.set(x, "ConformancePackRuleEvaluationResults", js.undefined)
    
    inline def setConformancePackRuleEvaluationResultsVarargs(value: ConformancePackEvaluationResult*): Self = StObject.set(x, "ConformancePackRuleEvaluationResults", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
