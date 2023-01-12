package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImportDataError extends StObject {
  
  /**
    * The type of error that occurred for a specific import task.
    */
  var errorCode: js.UndefOr[BatchDeleteImportDataErrorCode] = js.undefined
  
  /**
    * The description of the error that occurred for a specific import task.
    */
  var errorDescription: js.UndefOr[BatchDeleteImportDataErrorDescription] = js.undefined
  
  /**
    * The unique import ID associated with the error that occurred.
    */
  var importTaskId: js.UndefOr[ImportTaskIdentifier] = js.undefined
}
object BatchDeleteImportDataError {
  
  inline def apply(): BatchDeleteImportDataError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImportDataError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteImportDataError] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: BatchDeleteImportDataErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorDescription(value: BatchDeleteImportDataErrorDescription): Self = StObject.set(x, "errorDescription", value.asInstanceOf[js.Any])
    
    inline def setErrorDescriptionUndefined: Self = StObject.set(x, "errorDescription", js.undefined)
    
    inline def setImportTaskId(value: ImportTaskIdentifier): Self = StObject.set(x, "importTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "importTaskId", js.undefined)
  }
}
