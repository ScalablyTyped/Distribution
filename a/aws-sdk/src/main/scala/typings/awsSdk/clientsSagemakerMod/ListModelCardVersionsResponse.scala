package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelCardVersionsResponse extends StObject {
  
  /**
    * The summaries of the listed versions of the model card.
    */
  var ModelCardVersionSummaryList: typings.awsSdk.clientsSagemakerMod.ModelCardVersionSummaryList
  
  /**
    * If the response is truncated, SageMaker returns this token. To retrieve the next set of model card versions, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsSagemakerMod.NextToken] = js.undefined
}
object ListModelCardVersionsResponse {
  
  inline def apply(ModelCardVersionSummaryList: ModelCardVersionSummaryList): ListModelCardVersionsResponse = {
    val __obj = js.Dynamic.literal(ModelCardVersionSummaryList = ModelCardVersionSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelCardVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelCardVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setModelCardVersionSummaryList(value: ModelCardVersionSummaryList): Self = StObject.set(x, "ModelCardVersionSummaryList", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersionSummaryListVarargs(value: ModelCardVersionSummary*): Self = StObject.set(x, "ModelCardVersionSummaryList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
