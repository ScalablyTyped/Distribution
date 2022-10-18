package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutMessageResponse extends StObject {
  
  /**
    * A list of any errors encountered when sending the messages to the channel.
    */
  var batchPutMessageErrorEntries: js.UndefOr[BatchPutMessageErrorEntries] = js.undefined
}
object BatchPutMessageResponse {
  
  inline def apply(): BatchPutMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchPutMessageResponse]
  }
  
  extension [Self <: BatchPutMessageResponse](x: Self) {
    
    inline def setBatchPutMessageErrorEntries(value: BatchPutMessageErrorEntries): Self = StObject.set(x, "batchPutMessageErrorEntries", value.asInstanceOf[js.Any])
    
    inline def setBatchPutMessageErrorEntriesUndefined: Self = StObject.set(x, "batchPutMessageErrorEntries", js.undefined)
    
    inline def setBatchPutMessageErrorEntriesVarargs(value: BatchPutMessageErrorEntry*): Self = StObject.set(x, "batchPutMessageErrorEntries", js.Array(value*))
  }
}
