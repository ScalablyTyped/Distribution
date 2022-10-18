package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateDetectorResponse extends StObject {
  
  /**
    * A list of those detector updates that resulted in errors. (If an error is listed here, the specific update did not occur.)
    */
  var batchUpdateDetectorErrorEntries: js.UndefOr[BatchUpdateDetectorErrorEntries] = js.undefined
}
object BatchUpdateDetectorResponse {
  
  inline def apply(): BatchUpdateDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDetectorResponse]
  }
  
  extension [Self <: BatchUpdateDetectorResponse](x: Self) {
    
    inline def setBatchUpdateDetectorErrorEntries(value: BatchUpdateDetectorErrorEntries): Self = StObject.set(x, "batchUpdateDetectorErrorEntries", value.asInstanceOf[js.Any])
    
    inline def setBatchUpdateDetectorErrorEntriesUndefined: Self = StObject.set(x, "batchUpdateDetectorErrorEntries", js.undefined)
    
    inline def setBatchUpdateDetectorErrorEntriesVarargs(value: BatchUpdateDetectorErrorEntry*): Self = StObject.set(x, "batchUpdateDetectorErrorEntries", js.Array(value*))
  }
}
