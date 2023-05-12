package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentMetadata extends StObject {
  
  /**
    * List of pages in the document, with the number of characters extracted from each page.
    */
  var ExtractedCharacters: js.UndefOr[ListOfExtractedCharacters] = js.undefined
  
  /**
    * Number of pages in the document.
    */
  var Pages: js.UndefOr[Integer] = js.undefined
}
object DocumentMetadata {
  
  inline def apply(): DocumentMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentMetadata] (val x: Self) extends AnyVal {
    
    inline def setExtractedCharacters(value: ListOfExtractedCharacters): Self = StObject.set(x, "ExtractedCharacters", value.asInstanceOf[js.Any])
    
    inline def setExtractedCharactersUndefined: Self = StObject.set(x, "ExtractedCharacters", js.undefined)
    
    inline def setExtractedCharactersVarargs(value: ExtractedCharactersListItem*): Self = StObject.set(x, "ExtractedCharacters", js.Array(value*))
    
    inline def setPages(value: Integer): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "Pages", js.undefined)
  }
}
