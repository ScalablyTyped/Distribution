package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyAggregatesSuccessEntry extends StObject {
  
  /**
    * The requested aggregated asset property values (for example, average, minimum, and maximum).
    */
  var aggregatedValues: AggregatedValues
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
}
object BatchGetAssetPropertyAggregatesSuccessEntry {
  
  inline def apply(aggregatedValues: AggregatedValues, entryId: EntryId): BatchGetAssetPropertyAggregatesSuccessEntry = {
    val __obj = js.Dynamic.literal(aggregatedValues = aggregatedValues.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyAggregatesSuccessEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyAggregatesSuccessEntry](x: Self) {
    
    inline def setAggregatedValues(value: AggregatedValues): Self = StObject.set(x, "aggregatedValues", value.asInstanceOf[js.Any])
    
    inline def setAggregatedValuesVarargs(value: AggregatedValue*): Self = StObject.set(x, "aggregatedValues", js.Array(value*))
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
  }
}
