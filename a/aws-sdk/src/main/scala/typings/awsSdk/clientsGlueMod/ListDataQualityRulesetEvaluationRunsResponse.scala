package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataQualityRulesetEvaluationRunsResponse extends StObject {
  
  /**
    * A pagination token, if more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of DataQualityRulesetEvaluationRunDescription objects representing data quality ruleset runs.
    */
  var Runs: js.UndefOr[DataQualityRulesetEvaluationRunList] = js.undefined
}
object ListDataQualityRulesetEvaluationRunsResponse {
  
  inline def apply(): ListDataQualityRulesetEvaluationRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataQualityRulesetEvaluationRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataQualityRulesetEvaluationRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRuns(value: DataQualityRulesetEvaluationRunList): Self = StObject.set(x, "Runs", value.asInstanceOf[js.Any])
    
    inline def setRunsUndefined: Self = StObject.set(x, "Runs", js.undefined)
    
    inline def setRunsVarargs(value: DataQualityRulesetEvaluationRunDescription*): Self = StObject.set(x, "Runs", js.Array(value*))
  }
}
