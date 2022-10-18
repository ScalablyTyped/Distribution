package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDatasetContentResponse extends StObject {
  
  /**
    * A list of DatasetEntry objects.
    */
  var entries: js.UndefOr[DatasetEntries] = js.undefined
  
  /**
    * The status of the dataset content.
    */
  var status: js.UndefOr[DatasetContentStatus] = js.undefined
  
  /**
    * The time when the request was made.
    */
  var timestamp: js.UndefOr[js.Date] = js.undefined
}
object GetDatasetContentResponse {
  
  inline def apply(): GetDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDatasetContentResponse]
  }
  
  extension [Self <: GetDatasetContentResponse](x: Self) {
    
    inline def setEntries(value: DatasetEntries): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: DatasetEntry*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setStatus(value: DatasetContentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
