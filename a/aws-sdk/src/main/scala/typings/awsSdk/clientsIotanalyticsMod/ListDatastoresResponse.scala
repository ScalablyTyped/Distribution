package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatastoresResponse extends StObject {
  
  /**
    * A list of DatastoreSummary objects.
    */
  var datastoreSummaries: js.UndefOr[DatastoreSummaries] = js.undefined
  
  /**
    * The token to retrieve the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDatastoresResponse {
  
  inline def apply(): ListDatastoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDatastoresResponse]
  }
  
  extension [Self <: ListDatastoresResponse](x: Self) {
    
    inline def setDatastoreSummaries(value: DatastoreSummaries): Self = StObject.set(x, "datastoreSummaries", value.asInstanceOf[js.Any])
    
    inline def setDatastoreSummariesUndefined: Self = StObject.set(x, "datastoreSummaries", js.undefined)
    
    inline def setDatastoreSummariesVarargs(value: DatastoreSummary*): Self = StObject.set(x, "datastoreSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
