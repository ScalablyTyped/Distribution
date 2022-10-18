package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueHistoryRequest extends StObject {
  
  /**
    * The list of asset property historical value entries for the batch get request. You can specify up to 16 entries per request.
    */
  var entries: BatchGetAssetPropertyValueHistoryEntries
  
  /**
    * The maximum number of results to return for each paginated request. A result set is returned in the two cases, whichever occurs first.   The size of the result set is less than 1 MB.   The number of data points in the result set is less than the value of maxResults. The maximum value of maxResults is 4000.  
    */
  var maxResults: js.UndefOr[BatchGetAssetPropertyValueHistoryMaxResults] = js.undefined
  
  /**
    * The token to be used for the next set of paginated results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object BatchGetAssetPropertyValueHistoryRequest {
  
  inline def apply(entries: BatchGetAssetPropertyValueHistoryEntries): BatchGetAssetPropertyValueHistoryRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueHistoryRequest]
  }
  
  extension [Self <: BatchGetAssetPropertyValueHistoryRequest](x: Self) {
    
    inline def setEntries(value: BatchGetAssetPropertyValueHistoryEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: BatchGetAssetPropertyValueHistoryEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setMaxResults(value: BatchGetAssetPropertyValueHistoryMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
