package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRescoreExecutionPlansResponse extends StObject {
  
  /**
    * If the response is truncated, Amazon Kendra Intelligent Ranking returns a pagination token in the response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.NextToken] = js.undefined
  
  /**
    * An array of summary information for one or more rescore execution plans.
    */
  var SummaryItems: js.UndefOr[RescoreExecutionPlanSummaryList] = js.undefined
}
object ListRescoreExecutionPlansResponse {
  
  inline def apply(): ListRescoreExecutionPlansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRescoreExecutionPlansResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRescoreExecutionPlansResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSummaryItems(value: RescoreExecutionPlanSummaryList): Self = StObject.set(x, "SummaryItems", value.asInstanceOf[js.Any])
    
    inline def setSummaryItemsUndefined: Self = StObject.set(x, "SummaryItems", js.undefined)
    
    inline def setSummaryItemsVarargs(value: RescoreExecutionPlanSummary*): Self = StObject.set(x, "SummaryItems", js.Array(value*))
  }
}
