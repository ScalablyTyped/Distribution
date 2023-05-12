package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetQuerySuggestionsRequest extends StObject {
  
  /**
    * Configuration information for the document fields/attributes that you want to base query suggestions on.
    */
  var AttributeSuggestionsConfig: js.UndefOr[AttributeSuggestionsGetConfig] = js.undefined
  
  /**
    * The identifier of the index you want to get query suggestions from.
    */
  var IndexId: typings.awsSdk.clientsKendraMod.IndexId
  
  /**
    * The maximum number of query suggestions you want to show to your users.
    */
  var MaxSuggestionsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The text of a user's query to generate query suggestions. A query is suggested if the query prefix matches what a user starts to type as their query. Amazon Kendra does not show any suggestions if a user types fewer than two characters or more than 60 characters. A query must also have at least one search result and contain at least one word of more than four characters.
    */
  var QueryText: SuggestionQueryText
  
  /**
    * The suggestions type to base query suggestions on. The suggestion types are query history or document fields/attributes. You can set one type or the other. If you set query history as your suggestions type, Amazon Kendra suggests queries relevant to your users based on popular queries in the query history. If you set document fields/attributes as your suggestions type, Amazon Kendra suggests queries relevant to your users based on the contents of document fields.
    */
  var SuggestionTypes: js.UndefOr[typings.awsSdk.clientsKendraMod.SuggestionTypes] = js.undefined
}
object GetQuerySuggestionsRequest {
  
  inline def apply(IndexId: IndexId, QueryText: SuggestionQueryText): GetQuerySuggestionsRequest = {
    val __obj = js.Dynamic.literal(IndexId = IndexId.asInstanceOf[js.Any], QueryText = QueryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuerySuggestionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetQuerySuggestionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAttributeSuggestionsConfig(value: AttributeSuggestionsGetConfig): Self = StObject.set(x, "AttributeSuggestionsConfig", value.asInstanceOf[js.Any])
    
    inline def setAttributeSuggestionsConfigUndefined: Self = StObject.set(x, "AttributeSuggestionsConfig", js.undefined)
    
    inline def setIndexId(value: IndexId): Self = StObject.set(x, "IndexId", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestionsCount(value: Integer): Self = StObject.set(x, "MaxSuggestionsCount", value.asInstanceOf[js.Any])
    
    inline def setMaxSuggestionsCountUndefined: Self = StObject.set(x, "MaxSuggestionsCount", js.undefined)
    
    inline def setQueryText(value: SuggestionQueryText): Self = StObject.set(x, "QueryText", value.asInstanceOf[js.Any])
    
    inline def setSuggestionTypes(value: SuggestionTypes): Self = StObject.set(x, "SuggestionTypes", value.asInstanceOf[js.Any])
    
    inline def setSuggestionTypesUndefined: Self = StObject.set(x, "SuggestionTypes", js.undefined)
    
    inline def setSuggestionTypesVarargs(value: SuggestionType*): Self = StObject.set(x, "SuggestionTypes", js.Array(value*))
  }
}
