package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStagesResponse extends StObject {
  
  /**
    * If there are more rooms than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * List of the matching stages (summary information only).
    */
  var stages: StageSummaryList
}
object ListStagesResponse {
  
  inline def apply(stages: StageSummaryList): ListStagesResponse = {
    val __obj = js.Dynamic.literal(stages = stages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStagesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStagesResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStages(value: StageSummaryList): Self = StObject.set(x, "stages", value.asInstanceOf[js.Any])
    
    inline def setStagesVarargs(value: StageSummary*): Self = StObject.set(x, "stages", js.Array(value*))
  }
}
