package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WarningsListItem extends StObject {
  
  /**
    * Page number in the input document.
    */
  var Page: js.UndefOr[Integer] = js.undefined
  
  /**
    * The type of warning.
    */
  var WarnCode: js.UndefOr[PageBasedWarningCode] = js.undefined
  
  /**
    * Text message associated with the warning.
    */
  var WarnMessage: js.UndefOr[String] = js.undefined
}
object WarningsListItem {
  
  inline def apply(): WarningsListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WarningsListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WarningsListItem] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Integer): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setWarnCode(value: PageBasedWarningCode): Self = StObject.set(x, "WarnCode", value.asInstanceOf[js.Any])
    
    inline def setWarnCodeUndefined: Self = StObject.set(x, "WarnCode", js.undefined)
    
    inline def setWarnMessage(value: String): Self = StObject.set(x, "WarnMessage", value.asInstanceOf[js.Any])
    
    inline def setWarnMessageUndefined: Self = StObject.set(x, "WarnMessage", js.undefined)
  }
}
