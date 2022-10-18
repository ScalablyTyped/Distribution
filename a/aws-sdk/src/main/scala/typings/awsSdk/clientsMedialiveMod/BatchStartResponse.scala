package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStartResponse extends StObject {
  
  /**
    * List of failed operations
    */
  var Failed: js.UndefOr[listOfBatchFailedResultModel] = js.undefined
  
  /**
    * List of successful operations
    */
  var Successful: js.UndefOr[listOfBatchSuccessfulResultModel] = js.undefined
}
object BatchStartResponse {
  
  inline def apply(): BatchStartResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStartResponse]
  }
  
  extension [Self <: BatchStartResponse](x: Self) {
    
    inline def setFailed(value: listOfBatchFailedResultModel): Self = StObject.set(x, "Failed", value.asInstanceOf[js.Any])
    
    inline def setFailedUndefined: Self = StObject.set(x, "Failed", js.undefined)
    
    inline def setFailedVarargs(value: BatchFailedResultModel*): Self = StObject.set(x, "Failed", js.Array(value*))
    
    inline def setSuccessful(value: listOfBatchSuccessfulResultModel): Self = StObject.set(x, "Successful", value.asInstanceOf[js.Any])
    
    inline def setSuccessfulUndefined: Self = StObject.set(x, "Successful", js.undefined)
    
    inline def setSuccessfulVarargs(value: BatchSuccessfulResultModel*): Self = StObject.set(x, "Successful", js.Array(value*))
  }
}
