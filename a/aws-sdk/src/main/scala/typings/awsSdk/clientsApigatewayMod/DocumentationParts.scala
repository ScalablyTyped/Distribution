package typings.awsSdk.clientsApigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentationParts extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDocumentationPart] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
}
object DocumentationParts {
  
  inline def apply(): DocumentationParts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationParts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentationParts] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ListOfDocumentationPart): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DocumentationPart*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
