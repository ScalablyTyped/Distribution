package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeSuggestionsUpdateConfig extends StObject {
  
  /**
    * You can set the mode to ACTIVE or INACTIVE. You must also set SuggestionTypes as either QUERY or DOCUMENT_ATTRIBUTES and then call GetQuerySuggestions. If Mode to use query history is set to ENABLED when calling UpdateQuerySuggestionsConfig and AttributeSuggestionsMode to use fields/attributes is set to ACTIVE, and you haven't set your SuggestionTypes preference to DOCUMENT_ATTRIBUTES, then Amazon Kendra uses the query history.
    */
  var AttributeSuggestionsMode: js.UndefOr[typings.awsSdk.clientsKendraMod.AttributeSuggestionsMode] = js.undefined
  
  /**
    * The list of fields/attributes that you want to set as suggestible for query suggestions.
    */
  var SuggestableConfigList: js.UndefOr[typings.awsSdk.clientsKendraMod.SuggestableConfigList] = js.undefined
}
object AttributeSuggestionsUpdateConfig {
  
  inline def apply(): AttributeSuggestionsUpdateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributeSuggestionsUpdateConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttributeSuggestionsUpdateConfig] (val x: Self) extends AnyVal {
    
    inline def setAttributeSuggestionsMode(value: AttributeSuggestionsMode): Self = StObject.set(x, "AttributeSuggestionsMode", value.asInstanceOf[js.Any])
    
    inline def setAttributeSuggestionsModeUndefined: Self = StObject.set(x, "AttributeSuggestionsMode", js.undefined)
    
    inline def setSuggestableConfigList(value: SuggestableConfigList): Self = StObject.set(x, "SuggestableConfigList", value.asInstanceOf[js.Any])
    
    inline def setSuggestableConfigListUndefined: Self = StObject.set(x, "SuggestableConfigList", js.undefined)
    
    inline def setSuggestableConfigListVarargs(value: SuggestableConfig*): Self = StObject.set(x, "SuggestableConfigList", js.Array(value*))
  }
}
