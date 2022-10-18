package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetContentsResponse extends StObject {
  
  /**
    * Summary information about dataset contents that have been created.
    */
  var datasetContentSummaries: js.UndefOr[DatasetContentSummaries] = js.undefined
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatasetContentsResponse {
  
  inline def apply(): ListDatasetContentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatasetContentsResponse]
  }
  
  extension [Self <: ListDatasetContentsResponse](x: Self) {
    
    inline def setDatasetContentSummaries(value: DatasetContentSummaries): Self = StObject.set(x, "datasetContentSummaries", value.asInstanceOf[js.Any])
    
    inline def setDatasetContentSummariesUndefined: Self = StObject.set(x, "datasetContentSummaries", js.undefined)
    
    inline def setDatasetContentSummariesVarargs(value: DatasetContentSummary*): Self = StObject.set(x, "datasetContentSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
