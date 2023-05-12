package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListEvaluationFormsResponse extends StObject {
  
  /**
    * Provides details about a list of evaluation forms belonging to an instance.
    */
  var EvaluationFormSummaryList: typings.awsSdk.clientsConnectMod.EvaluationFormSummaryList
  
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConnectMod.NextToken] = js.undefined
}
object ListEvaluationFormsResponse {
  
  inline def apply(EvaluationFormSummaryList: EvaluationFormSummaryList): ListEvaluationFormsResponse = {
    val __obj = js.Dynamic.literal(EvaluationFormSummaryList = EvaluationFormSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEvaluationFormsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListEvaluationFormsResponse] (val x: Self) extends AnyVal {
    
    inline def setEvaluationFormSummaryList(value: EvaluationFormSummaryList): Self = StObject.set(x, "EvaluationFormSummaryList", value.asInstanceOf[js.Any])
    
    inline def setEvaluationFormSummaryListVarargs(value: EvaluationFormSummary*): Self = StObject.set(x, "EvaluationFormSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
