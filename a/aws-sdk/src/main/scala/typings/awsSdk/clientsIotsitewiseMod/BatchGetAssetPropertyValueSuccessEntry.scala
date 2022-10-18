package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueSuccessEntry extends StObject {
  
  var assetPropertyValue: js.UndefOr[AssetPropertyValue] = js.undefined
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
}
object BatchGetAssetPropertyValueSuccessEntry {
  
  inline def apply(entryId: EntryId): BatchGetAssetPropertyValueSuccessEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueSuccessEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyValueSuccessEntry](x: Self) {
    
    inline def setAssetPropertyValue(value: AssetPropertyValue): Self = StObject.set(x, "assetPropertyValue", value.asInstanceOf[js.Any])
    
    inline def setAssetPropertyValueUndefined: Self = StObject.set(x, "assetPropertyValue", js.undefined)
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
  }
}
