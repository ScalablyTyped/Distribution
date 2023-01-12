package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobExecutionsForThingResponse extends StObject {
  
  /**
    * A list of job execution summaries.
    */
  var executionSummaries: js.UndefOr[JobExecutionSummaryForThingList] = js.undefined
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobExecutionsForThingResponse {
  
  inline def apply(): ListJobExecutionsForThingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobExecutionsForThingResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListJobExecutionsForThingResponse] (val x: Self) extends AnyVal {
    
    inline def setExecutionSummaries(value: JobExecutionSummaryForThingList): Self = StObject.set(x, "executionSummaries", value.asInstanceOf[js.Any])
    
    inline def setExecutionSummariesUndefined: Self = StObject.set(x, "executionSummaries", js.undefined)
    
    inline def setExecutionSummariesVarargs(value: JobExecutionSummaryForThing*): Self = StObject.set(x, "executionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
