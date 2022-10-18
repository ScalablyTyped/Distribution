package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedBatchItem extends StObject {
  
  /**
    *  The error message that indicates why the batch item failed. 
    */
  var errorMessage: BatchErrorMessage
  
  /**
    *  The id of the batch item that failed. This is the batch item id for the BatchCreateTableRows and BatchUpsertTableRows operations and the row id for the BatchUpdateTableRows and BatchDeleteTableRows operations. 
    */
  var id: BatchItemId
}
object FailedBatchItem {
  
  inline def apply(errorMessage: BatchErrorMessage, id: BatchItemId): FailedBatchItem = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedBatchItem]
  }
  
  extension [Self <: FailedBatchItem](x: Self) {
    
    inline def setErrorMessage(value: BatchErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setId(value: BatchItemId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
