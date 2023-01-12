package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBuiltInIntentsRequest extends StObject {
  
  /**
    * The identifier of the language and locale of the intents to list. The string must match one of the supported locales. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The maximum number of built-in intents to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[BuiltInsMaxResults] = js.undefined
  
  /**
    * If the response from the ListBuiltInIntents operation contains more results than specified in the maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies sorting parameters for the list of built-in intents. You can specify that the list be sorted by the built-in intent signature in either ascending or descending order.
    */
  var sortBy: js.UndefOr[BuiltInIntentSortBy] = js.undefined
}
object ListBuiltInIntentsRequest {
  
  inline def apply(localeId: LocaleId): ListBuiltInIntentsRequest = {
    val __obj = js.Dynamic.literal(localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBuiltInIntentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListBuiltInIntentsRequest] (val x: Self) extends AnyVal {
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: BuiltInsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: BuiltInIntentSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
