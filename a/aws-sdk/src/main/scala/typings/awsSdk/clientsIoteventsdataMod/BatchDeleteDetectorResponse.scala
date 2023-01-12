package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteDetectorResponse extends StObject {
  
  /**
    * A list of errors associated with the request, or an empty array ([]) if there are no errors. Each error entry contains a messageId that helps you identify the entry that failed.
    */
  var batchDeleteDetectorErrorEntries: js.UndefOr[BatchDeleteDetectorErrorEntries] = js.undefined
}
object BatchDeleteDetectorResponse {
  
  inline def apply(): BatchDeleteDetectorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteDetectorResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteDetectorResponse] (val x: Self) extends AnyVal {
    
    inline def setBatchDeleteDetectorErrorEntries(value: BatchDeleteDetectorErrorEntries): Self = StObject.set(x, "batchDeleteDetectorErrorEntries", value.asInstanceOf[js.Any])
    
    inline def setBatchDeleteDetectorErrorEntriesUndefined: Self = StObject.set(x, "batchDeleteDetectorErrorEntries", js.undefined)
    
    inline def setBatchDeleteDetectorErrorEntriesVarargs(value: BatchDeleteDetectorErrorEntry*): Self = StObject.set(x, "batchDeleteDetectorErrorEntries", js.Array(value*))
  }
}
