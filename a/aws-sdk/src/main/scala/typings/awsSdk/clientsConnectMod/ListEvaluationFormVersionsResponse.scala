package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEvaluationFormVersionsResponse extends StObject {
  
  /**
    * Provides details about a list of evaluation forms belonging to an instance.
    */
  var EvaluationFormVersionSummaryList: typings.awsSdk.clientsConnectMod.EvaluationFormVersionSummaryList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListEvaluationFormVersionsResponse {
  
  inline def apply(EvaluationFormVersionSummaryList: EvaluationFormVersionSummaryList): ListEvaluationFormVersionsResponse = {
    val __obj = js.Dynamic.literal(EvaluationFormVersionSummaryList = EvaluationFormVersionSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEvaluationFormVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEvaluationFormVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationFormVersionSummaryList(value: EvaluationFormVersionSummaryList): Self = StObject.set(x, "EvaluationFormVersionSummaryList", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormVersionSummaryListVarargs(value: EvaluationFormVersionSummary*): Self = StObject.set(x, "EvaluationFormVersionSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
