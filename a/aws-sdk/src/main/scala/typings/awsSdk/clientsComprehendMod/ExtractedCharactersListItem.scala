package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtractedCharactersListItem extends StObject {
  
  /**
    * Number of characters extracted from each page.
    */
  var Count: js.UndefOr[Integer] = js.undefined
  
  /**
    * Page number.
    */
  var Page: js.UndefOr[Integer] = js.undefined
}
object ExtractedCharactersListItem {
  
  inline def apply(): ExtractedCharactersListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtractedCharactersListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtractedCharactersListItem] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Integer): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
    
    inline def setPage(value: Integer): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
  }
}
