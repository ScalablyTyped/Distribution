package typings.awsSdk.clientsGreengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetail extends StObject {
  
  /**
    * A detailed error code.
    */
  var DetailedErrorCode: js.UndefOr[string] = js.undefined
  
  /**
    * A detailed error message.
    */
  var DetailedErrorMessage: js.UndefOr[string] = js.undefined
}
object ErrorDetail {
  
  inline def apply(): ErrorDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorDetail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorDetail] (val x: Self) extends AnyVal {
    
    inline def setDetailedErrorCode(value: string): Self = StObject.set(x, "DetailedErrorCode", value.asInstanceOf[js.Any])
    
    inline def setDetailedErrorCodeUndefined: Self = StObject.set(x, "DetailedErrorCode", js.undefined)
    
    inline def setDetailedErrorMessage(value: string): Self = StObject.set(x, "DetailedErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setDetailedErrorMessageUndefined: Self = StObject.set(x, "DetailedErrorMessage", js.undefined)
  }
}
