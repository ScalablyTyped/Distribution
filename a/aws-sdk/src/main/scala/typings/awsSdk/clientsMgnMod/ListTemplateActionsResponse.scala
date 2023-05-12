package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTemplateActionsResponse extends StObject {
  
  /**
    * List of template post migration custom actions.
    */
  var items: js.UndefOr[TemplateActionDocuments] = js.undefined
  
  /**
    * Next token returned when listing template post migration custom actions.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListTemplateActionsResponse {
  
  inline def apply(): ListTemplateActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTemplateActionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTemplateActionsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: TemplateActionDocuments): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: TemplateActionDocument*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
