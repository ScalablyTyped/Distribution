package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListContactEvaluationsResponse extends StObject {
  
  /**
    * Provides details about a list of contact evaluations belonging to an instance.
    */
  var EvaluationSummaryList: typings.awsSdk.clientsConnectMod.EvaluationSummaryList
  
  /**
    * If there are additional results, this is the token for the next set of results.  This is always returned as null in the response. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListContactEvaluationsResponse {
  
  inline def apply(EvaluationSummaryList: EvaluationSummaryList): ListContactEvaluationsResponse = {
    val __obj = js.Dynamic.literal(EvaluationSummaryList = EvaluationSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListContactEvaluationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListContactEvaluationsResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationSummaryList(value: EvaluationSummaryList): Self = StObject.set(x, "EvaluationSummaryList", value.asInstanceOf[js.Any])
    
    inline def setEvaluationSummaryListVarargs(value: EvaluationSummary*): Self = StObject.set(x, "EvaluationSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
