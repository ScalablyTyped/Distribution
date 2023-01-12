package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsRequest extends StObject {
  
  /**
    * The unique identifier that Amazon Lex assigned to the bot.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The version of the bot to list exports for. 
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * Provides the specification of a filter used to limit the exports in the response to only those that match the filter specification. You can only specify one filter and one string to filter on.
    */
  var filters: js.UndefOr[ExportFilters] = js.undefined
  
  /**
    * Specifies the resources that should be exported. If you don't specify a resource type in the filters parameter, both bot locales and custom vocabularies are exported.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The maximum number of exports to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListExports operation contains more results that specified in the maxResults parameter, a token is returned in the response.  Use the returned token in the nextToken parameter of a ListExports request to return the next page of results. For a complete set of results, call the ListExports operation until the nextToken returned in the response is null.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Determines the field that the list of exports is sorted by. You can sort by the LastUpdatedDateTime field in ascending or descending order.
    */
  var sortBy: js.UndefOr[ExportSortBy] = js.undefined
}
object ListExportsRequest {
  
  inline def apply(): ListExportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setFilters(value: ExportFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: ExportFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: ExportSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
