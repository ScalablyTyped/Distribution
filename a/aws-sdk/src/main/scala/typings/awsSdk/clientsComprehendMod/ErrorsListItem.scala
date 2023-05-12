package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorsListItem extends StObject {
  
  /**
    * Error code for the cause of the error.
    */
  var ErrorCode: js.UndefOr[PageBasedErrorCode] = js.undefined
  
  /**
    * Text message explaining the reason for the error.
    */
  var ErrorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Page number where the error occurred.
    */
  var Page: js.UndefOr[Integer] = js.undefined
}
object ErrorsListItem {
  
  inline def apply(): ErrorsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorsListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ErrorsListItem] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: PageBasedErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
    
    inline def setPage(value: Integer): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
