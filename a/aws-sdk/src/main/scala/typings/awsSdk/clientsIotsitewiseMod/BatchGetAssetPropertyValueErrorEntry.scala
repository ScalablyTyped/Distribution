package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetAssetPropertyValueErrorEntry extends StObject {
  
  /**
    * The ID of the entry.
    */
  var entryId: EntryId
  
  /**
    * The error code.
    */
  var errorCode: BatchGetAssetPropertyValueErrorCode
  
  /**
    * The associated error message.
    */
  var errorMessage: ErrorMessage
}
object BatchGetAssetPropertyValueErrorEntry {
  
  inline def apply(entryId: EntryId, errorCode: BatchGetAssetPropertyValueErrorCode, errorMessage: ErrorMessage): BatchGetAssetPropertyValueErrorEntry = {
    val __obj = js.Dynamic.literal(entryId = entryId.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetAssetPropertyValueErrorEntry]
  }
  
  extension [Self <: BatchGetAssetPropertyValueErrorEntry](x: Self) {
    
    inline def setEntryId(value: EntryId): Self = StObject.set(x, "entryId", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: BatchGetAssetPropertyValueErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
