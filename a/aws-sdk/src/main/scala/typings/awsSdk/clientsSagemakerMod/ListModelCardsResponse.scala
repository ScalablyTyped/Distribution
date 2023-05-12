package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelCardsResponse extends StObject {
  
  /**
    * The summaries of the listed model cards.
    */
  var ModelCardSummaries: ModelCardSummaryList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of model cards, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListModelCardsResponse {
  
  inline def apply(ModelCardSummaries: ModelCardSummaryList): ListModelCardsResponse = {
    val __obj = js.Dynamic.literal(ModelCardSummaries = ModelCardSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelCardsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelCardsResponse] (val x: Self) extends AnyVal {
    
    inline def setModelCardSummaries(value: ModelCardSummaryList): Self = StObject.set(x, "ModelCardSummaries", value.asInstanceOf[js.Any])
    
    inline def setModelCardSummariesVarargs(value: ModelCardSummary*): Self = StObject.set(x, "ModelCardSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
