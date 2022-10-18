package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueHistorySuccessEntry extends StObject {
  
  /**
    * The requested historical values for the specified asset property.
    */
  var assetPropertyValueHistory: AssetPropertyValueHistory
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
}
object BatchGetAssetPropertyValueHistorySuccessEntry {
  
  inline def apply(assetPropertyValueHistory: AssetPropertyValueHistory, entryId: EntryId): BatchGetAssetPropertyValueHistorySuccessEntry = {
    val __obj = js.Dynamic.literal(assetPropertyValueHistory = assetPropertyValueHistory.asInstanceOf[js.Any], entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueHistorySuccessEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyValueHistorySuccessEntry](x: Self) {
    
    inline def setAssetPropertyValueHistory(value: AssetPropertyValueHistory): Self = StObject.set(x, "assetPropertyValueHistory", value.asInstanceOf[js.Any])
    
    inline def setAssetPropertyValueHistoryVarargs(value: AssetPropertyValue*): Self = StObject.set(x, "assetPropertyValueHistory", js.Array(value*))
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
  }
}
