package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesResponse extends StObject {
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of PipelineSummary objects.
    */
  var pipelineSummaries: js.UndefOr[PipelineSummaries] = js.undefined
}
object ListPipelinesResponse {
  
  inline def apply(): ListPipelinesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesResponse]
  }
  
  extension [Self <: ListPipelinesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPipelineSummaries(value: PipelineSummaries): Self = StObject.set(x, "pipelineSummaries", value.asInstanceOf[js.Any])
    
    inline def setPipelineSummariesUndefined: Self = StObject.set(x, "pipelineSummaries", js.undefined)
    
    inline def setPipelineSummariesVarargs(value: PipelineSummary*): Self = StObject.set(x, "pipelineSummaries", js.Array(value*))
  }
}
