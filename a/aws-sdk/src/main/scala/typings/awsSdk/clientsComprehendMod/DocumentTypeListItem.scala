package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentTypeListItem extends StObject {
  
  /**
    * Page number.
    */
  var Page: js.UndefOr[Integer] = js.undefined
  
  /**
    * Document type.
    */
  var Type: js.UndefOr[DocumentType] = js.undefined
}
object DocumentTypeListItem {
  
  inline def apply(): DocumentTypeListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentTypeListItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentTypeListItem] (val x: Self) extends AnyVal {
    
    inline def setPage(value: Integer): Self = StObject.set(x, "Page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "Page", js.undefined)
    
    inline def setType(value: DocumentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
