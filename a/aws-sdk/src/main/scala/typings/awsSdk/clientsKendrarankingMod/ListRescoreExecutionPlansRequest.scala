package typings.awsSdk.clientsKendrarankingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRescoreExecutionPlansRequest extends StObject {
  
  /**
    * The maximum number of rescore execution plans to return.
    */
  var MaxResults: js.UndefOr[MaxResultsIntegerForListRescoreExecutionPlansRequest] = js.undefined
  
  /**
    * If the response is truncated, Amazon Kendra Intelligent Ranking returns a pagination token in the response. You can use this pagination token to retrieve the next set of rescore execution plans.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKendrarankingMod.NextToken] = js.undefined
}
object ListRescoreExecutionPlansRequest {
  
  inline def apply(): ListRescoreExecutionPlansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRescoreExecutionPlansRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRescoreExecutionPlansRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResultsIntegerForListRescoreExecutionPlansRequest): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
