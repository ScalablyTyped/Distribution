package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteTableResponse extends StObject {
  
  /**
    * A list of errors encountered in attempting to delete the specified tables.
    */
  var Errors: js.UndefOr[TableErrors] = js.undefined
}
object BatchDeleteTableResponse {
  
  inline def apply(): BatchDeleteTableResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDeleteTableResponse]
  }
  
  extension [Self <: BatchDeleteTableResponse](x: Self) {
    
    inline def setErrors(value: TableErrors): Self = StObject.set(x, "Errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "Errors", js.undefined)
    
    inline def setErrorsVarargs(value: TableError*): Self = StObject.set(x, "Errors", js.Array(value*))
  }
}
