package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationParts extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDocumentationPart] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object DocumentationParts {
  
  @scala.inline
  def apply(): DocumentationParts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationParts]
  }
  
  @scala.inline
  implicit class DocumentationPartsMutableBuilder[Self <: DocumentationParts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfDocumentationPart): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DocumentationPart*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
