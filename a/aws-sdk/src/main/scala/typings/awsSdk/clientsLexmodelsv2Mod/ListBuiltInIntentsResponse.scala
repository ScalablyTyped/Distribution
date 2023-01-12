package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuiltInIntentsResponse extends StObject {
  
  /**
    * Summary information for the built-in intents that meet the filter criteria specified in the request. The length of the list is specified in the maxResults parameter of the request. If there are more intents available, the nextToken field contains a token to get the next page of results.
    */
  var builtInIntentSummaries: js.UndefOr[BuiltInIntentSummaryList] = js.undefined
  
  /**
    * The language and locale of the intents in the list.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListBuiltInIntents operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListBotAliases operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBuiltInIntentsResponse {
  
  inline def apply(): ListBuiltInIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBuiltInIntentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBuiltInIntentsResponse] (val x: Self) extends AnyVal {
    
    inline def setBuiltInIntentSummaries(value: BuiltInIntentSummaryList): Self = StObject.set(x, "builtInIntentSummaries", value.asInstanceOf[js.Any])
    
    inline def setBuiltInIntentSummariesUndefined: Self = StObject.set(x, "builtInIntentSummaries", js.undefined)
    
    inline def setBuiltInIntentSummariesVarargs(value: BuiltInIntentSummary*): Self = StObject.set(x, "builtInIntentSummaries", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
