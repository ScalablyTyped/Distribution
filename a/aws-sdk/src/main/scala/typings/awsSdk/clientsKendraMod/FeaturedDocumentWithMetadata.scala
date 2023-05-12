package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturedDocumentWithMetadata extends StObject {
  
  /**
    * The identifier of the featured document with its metadata. You can use the Query API to search for specific documents with their document IDs included in the result items, or you can use the console.
    */
  var Id: js.UndefOr[DocumentId] = js.undefined
  
  /**
    * The main title of the featured document.
    */
  var Title: js.UndefOr[String] = js.undefined
  
  /**
    * The source URI location of the featured document.
    */
  var URI: js.UndefOr[Url] = js.undefined
}
object FeaturedDocumentWithMetadata {
  
  inline def apply(): FeaturedDocumentWithMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturedDocumentWithMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturedDocumentWithMetadata] (val x: Self) extends AnyVal {
    
    inline def setId(value: DocumentId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    
    inline def setURI(value: Url): Self = StObject.set(x, "URI", value.asInstanceOf[js.Any])
    
    inline def setURIUndefined: Self = StObject.set(x, "URI", js.undefined)
  }
}
