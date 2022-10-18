package typings.awsSdk.clientsSsmincidentsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResponsePlansOutput extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Details of each response plan.
    */
  var responsePlanSummaries: ResponsePlanSummaryList
}
object ListResponsePlansOutput {
  
  inline def apply(responsePlanSummaries: ResponsePlanSummaryList): ListResponsePlansOutput = {
    val __obj = js.Dynamic.literal(responsePlanSummaries = responsePlanSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResponsePlansOutput]
  }
  
  extension [Self <: ListResponsePlansOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResponsePlanSummaries(value: ResponsePlanSummaryList): Self = StObject.set(x, "responsePlanSummaries", value.asInstanceOf[js.Any])
    
    inline def setResponsePlanSummariesVarargs(value: ResponsePlanSummary*): Self = StObject.set(x, "responsePlanSummaries", js.Array(value*))
  }
}
