package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImportDataResponse extends StObject {
  
  /**
    * Error messages returned for each import task that you deleted as a response for this command.
    */
  var errors: js.UndefOr[BatchDeleteImportDataErrorList] = js.undefined
}
object BatchDeleteImportDataResponse {
  
  inline def apply(): BatchDeleteImportDataResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteImportDataResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDeleteImportDataResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchDeleteImportDataErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchDeleteImportDataError*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
