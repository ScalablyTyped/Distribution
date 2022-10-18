package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutAssetPropertyValueRequest extends StObject {
  
  /**
    * The list of asset property value entries for the batch put request. You can specify up to 10 entries per request.
    */
  var entries: PutAssetPropertyValueEntries
}
object BatchPutAssetPropertyValueRequest {
  
  inline def apply(entries: PutAssetPropertyValueEntries): BatchPutAssetPropertyValueRequest = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutAssetPropertyValueRequest]
  }
  
  extension [Self <: BatchPutAssetPropertyValueRequest](x: Self) {
    
    inline def setEntries(value: PutAssetPropertyValueEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: PutAssetPropertyValueEntry*): Self = StObject.set(x, "entries", js.Array(value*))
  }
}
