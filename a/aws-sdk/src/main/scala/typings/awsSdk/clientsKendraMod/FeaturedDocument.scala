package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturedDocument extends StObject {
  
  /**
    * The identifier of the document to feature in the search results. You can use the Query API to search for specific documents with their document IDs included in the result items, or you can use the console.
    */
  var Id: js.UndefOr[DocumentId] = js.undefined
}
object FeaturedDocument {
  
  inline def apply(): FeaturedDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturedDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturedDocument] (val x: Self) extends AnyVal {
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
