package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentationVersions extends StObject {
  
  /**
    * The current page of elements from this collection.
    */
  var items: js.UndefOr[ListOfDocumentationVersion] = js.native
  
  var position: js.UndefOr[String] = js.native
}
object DocumentationVersions {
  
  @scala.inline
  def apply(): DocumentationVersions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentationVersions]
  }
  
  @scala.inline
  implicit class DocumentationVersionsMutableBuilder[Self <: DocumentationVersions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ListOfDocumentationVersion): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DocumentationVersion*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
