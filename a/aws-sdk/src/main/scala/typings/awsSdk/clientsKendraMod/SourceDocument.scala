package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceDocument extends StObject {
  
  /**
    * The additional fields/attributes to include in the response. You can use additional fields to provide extra information in the response. Additional fields are not used to based suggestions on.
    */
  var AdditionalAttributes: js.UndefOr[DocumentAttributeList] = js.undefined
  
  /**
    * The identifier of the document used for a query suggestion.
    */
  var DocumentId: js.UndefOr[String] = js.undefined
  
  /**
    * The document fields/attributes used for a query suggestion.
    */
  var SuggestionAttributes: js.UndefOr[DocumentAttributeKeyList] = js.undefined
}
object SourceDocument {
  
  inline def apply(): SourceDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceDocument]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SourceDocument] (val x: Self) extends AnyVal {
    
    inline def setAdditionalAttributes(value: DocumentAttributeList): Self = StObject.set(x, "AdditionalAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalAttributesUndefined: Self = StObject.set(x, "AdditionalAttributes", js.undefined)
    
    inline def setAdditionalAttributesVarargs(value: DocumentAttribute*): Self = StObject.set(x, "AdditionalAttributes", js.Array(value*))
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setDocumentIdUndefined: Self = StObject.set(x, "DocumentId", js.undefined)
    
    inline def setSuggestionAttributes(value: DocumentAttributeKeyList): Self = StObject.set(x, "SuggestionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSuggestionAttributesUndefined: Self = StObject.set(x, "SuggestionAttributes", js.undefined)
    
    inline def setSuggestionAttributesVarargs(value: DocumentAttributeKey*): Self = StObject.set(x, "SuggestionAttributes", js.Array(value*))
  }
}
