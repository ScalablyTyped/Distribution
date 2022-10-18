package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublishBatchResponse extends StObject {
  
  /**
    * A list of failed PublishBatch responses. 
    */
  var Failed: js.UndefOr[BatchResultErrorEntryList] = js.undefined
  
  /**
    * A list of successful PublishBatch responses.
    */
  var Successful: js.UndefOr[PublishBatchResultEntryList] = js.undefined
}
object PublishBatchResponse {
  
  inline def apply(): PublishBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PublishBatchResponse]
  }
  
  extension [Self <: PublishBatchResponse](x: Self) {
    
    inline def setFailed(value: BatchResultErrorEntryList): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setFailedVarargs(value: BatchResultErrorEntry*): Self = StObject.set(x, "Failed", js.Array(value*))
    
    inline def setSuccessful(value: PublishBatchResultEntryList): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: PublishBatchResultEntry*): Self = StObject.set(x, "Successful", js.Array(value*))
  }
}
