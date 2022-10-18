package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyAggregatesResponse extends StObject {
  
  /**
    * A list of the errors (if any) associated with the batch request. Each error entry contains the entryId of the entry that failed.
    */
  var errorEntries: BatchGetAssetPropertyAggregatesErrorEntries
  
  /**
    * The token for the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * A list of entries that were not processed by this batch request. because these entries had been completely processed by previous paginated requests. Each skipped entry contains the entryId of the entry that skipped.
    */
  var skippedEntries: BatchGetAssetPropertyAggregatesSkippedEntries
  
  /**
    * A list of entries that were processed successfully by this batch request. Each success entry contains the entryId of the entry that succeeded and the latest query result.
    */
  var successEntries: BatchGetAssetPropertyAggregatesSuccessEntries
}
object BatchGetAssetPropertyAggregatesResponse {
  
  inline def apply(
    errorEntries: BatchGetAssetPropertyAggregatesErrorEntries,
    skippedEntries: BatchGetAssetPropertyAggregatesSkippedEntries,
    successEntries: BatchGetAssetPropertyAggregatesSuccessEntries
  ): BatchGetAssetPropertyAggregatesResponse = {
    val __obj = js.Dynamic.literal(errorEntries = errorEntries.asInstanceOf[js.Any], skippedEntries = skippedEntries.asInstanceOf[js.Any], successEntries = successEntries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyAggregatesResponse]
  }
  
  extension [Self <: BatchGetAssetPropertyAggregatesResponse](x: Self) {
    
    inline def setErrorEntries(value: BatchGetAssetPropertyAggregatesErrorEntries): Self = StObject.set(x, "errorEntries", value.asInstanceOf[js.Any])
    
    inline def setErrorEntriesVarargs(value: BatchGetAssetPropertyAggregatesErrorEntry*): Self = StObject.set(x, "errorEntries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSkippedEntries(value: BatchGetAssetPropertyAggregatesSkippedEntries): Self = StObject.set(x, "skippedEntries", value.asInstanceOf[js.Any])
    
    inline def setSkippedEntriesVarargs(value: BatchGetAssetPropertyAggregatesSkippedEntry*): Self = StObject.set(x, "skippedEntries", js.Array(value*))
    
    inline def setSuccessEntries(value: BatchGetAssetPropertyAggregatesSuccessEntries): Self = StObject.set(x, "successEntries", value.asInstanceOf[js.Any])
    
    inline def setSuccessEntriesVarargs(value: BatchGetAssetPropertyAggregatesSuccessEntry*): Self = StObject.set(x, "successEntries", js.Array(value*))
  }
}
