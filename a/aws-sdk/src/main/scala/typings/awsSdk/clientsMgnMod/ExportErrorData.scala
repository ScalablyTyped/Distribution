package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportErrorData extends StObject {
  
  /**
    * Export errors data raw error.
    */
  var rawError: js.UndefOr[LargeBoundedString] = js.undefined
}
object ExportErrorData {
  
  inline def apply(): ExportErrorData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportErrorData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportErrorData] (val x: Self) extends AnyVal {
    
    inline def setRawError(value: LargeBoundedString): Self = StObject.set(x, "rawError", value.asInstanceOf[js.Any])
    
    inline def setRawErrorUndefined: Self = StObject.set(x, "rawError", js.undefined)
  }
}
