package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSuggestionsGetConfig extends StObject {
  
  /**
    * The list of additional document field/attribute keys or field names to include in the response. You can use additional fields to provide extra information in the response. Additional fields are not used to based suggestions on.
    */
  var AdditionalResponseAttributes: js.UndefOr[DocumentAttributeKeyList] = js.undefined
  
  /**
    * Filters the search results based on document fields/attributes.
    */
  var AttributeFilter: js.UndefOr[typings.awsSdk.clientsKendraMod.AttributeFilter] = js.undefined
  
  /**
    * The list of document field/attribute keys or field names to use for query suggestions. If the content within any of the fields match what your user starts typing as their query, then the field content is returned as a query suggestion.
    */
  var SuggestionAttributes: js.UndefOr[DocumentAttributeKeyList] = js.undefined
  
  /**
    * Applies user context filtering so that only users who are given access to certain documents see these document in their search results.
    */
  var UserContext: js.UndefOr[typings.awsSdk.clientsKendraMod.UserContext] = js.undefined
}
object AttributeSuggestionsGetConfig {
  
  inline def apply(): AttributeSuggestionsGetConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeSuggestionsGetConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeSuggestionsGetConfig] (val x: Self) extends AnyVal {
    
    inline def setAdditionalResponseAttributes(value: DocumentAttributeKeyList): Self = StObject.set(x, "AdditionalResponseAttributes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalResponseAttributesUndefined: Self = StObject.set(x, "AdditionalResponseAttributes", js.undefined)
    
    inline def setAdditionalResponseAttributesVarargs(value: DocumentAttributeKey*): Self = StObject.set(x, "AdditionalResponseAttributes", js.Array(value*))
    
    inline def setAttributeFilter(value: AttributeFilter): Self = StObject.set(x, "AttributeFilter", value.asInstanceOf[js.Any])
    
    inline def setAttributeFilterUndefined: Self = StObject.set(x, "AttributeFilter", js.undefined)
    
    inline def setSuggestionAttributes(value: DocumentAttributeKeyList): Self = StObject.set(x, "SuggestionAttributes", value.asInstanceOf[js.Any])
    
    inline def setSuggestionAttributesUndefined: Self = StObject.set(x, "SuggestionAttributes", js.undefined)
    
    inline def setSuggestionAttributesVarargs(value: DocumentAttributeKey*): Self = StObject.set(x, "SuggestionAttributes", js.Array(value*))
    
    inline def setUserContext(value: UserContext): Self = StObject.set(x, "UserContext", value.asInstanceOf[js.Any])
    
    inline def setUserContextUndefined: Self = StObject.set(x, "UserContext", js.undefined)
  }
}
