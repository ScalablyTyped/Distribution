package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnError extends StObject {
  
  /**
    * The name of the column that failed.
    */
  var ColumnName: js.UndefOr[NameString] = js.undefined
  
  /**
    * An error message with the reason for the failure of an operation.
    */
  var Error: js.UndefOr[ErrorDetail] = js.undefined
}
object ColumnError {
  
  inline def apply(): ColumnError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnError] (val x: Self) extends AnyVal {
    
    inline def setColumnName(value: NameString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
    
    inline def setError(value: ErrorDetail): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
  }
}
