package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSyncJobsResponse extends StObject {
  
  /**
    * The string that specifies the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The listed SyncJob summaries.
    */
  var syncJobSummaries: js.UndefOr[SyncJobSummaries] = js.undefined
}
object ListSyncJobsResponse {
  
  inline def apply(): ListSyncJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSyncJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSyncJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSyncJobSummaries(value: SyncJobSummaries): Self = StObject.set(x, "syncJobSummaries", value.asInstanceOf[js.Any])
    
    inline def setSyncJobSummariesUndefined: Self = StObject.set(x, "syncJobSummaries", js.undefined)
    
    inline def setSyncJobSummariesVarargs(value: SyncJobSummary*): Self = StObject.set(x, "syncJobSummaries", js.Array(value*))
  }
}
