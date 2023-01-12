package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAggregatedUtterancesRequest extends StObject {
  
  /**
    * The time window for aggregating the utterance information. You can specify a time between one hour and two weeks.
    */
  var aggregationDuration: UtteranceAggregationDuration
  
  /**
    * The identifier of the bot alias associated with this request. If you specify the bot alias, you can't specify the bot version.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * The unique identifier of the bot associated with this request.
    */
  var botId: Id
  
  /**
    * The identifier of the bot version associated with this request. If you specify the bot version, you can't specify the bot alias.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * Provides the specification of a filter used to limit the utterances in the response to only those that match the filter specification. You can only specify one filter and one string to filter on.
    */
  var filters: js.UndefOr[AggregatedUtterancesFilters] = js.undefined
  
  /**
    * The identifier of the language and locale where the utterances were collected. For more information, see Supported languages.
    */
  var localeId: LocaleId
  
  /**
    * The maximum number of utterances to return in each page of results. If there are fewer results than the maximum page size, only the actual number of results are returned. If you don't specify the maxResults parameter, 1,000 results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the ListAggregatedUtterances operation contains more results that specified in the maxResults parameter, a token is returned in the response. Use that token in the nextToken parameter to return the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Specifies sorting parameters for the list of utterances. You can sort by the hit count, the missed count, or the number of distinct sessions the utterance appeared in.
    */
  var sortBy: js.UndefOr[AggregatedUtterancesSortBy] = js.undefined
}
object ListAggregatedUtterancesRequest {
  
  inline def apply(aggregationDuration: UtteranceAggregationDuration, botId: Id, localeId: LocaleId): ListAggregatedUtterancesRequest = {
    val __obj = js.Dynamic.literal(aggregationDuration = aggregationDuration.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAggregatedUtterancesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAggregatedUtterancesRequest] (val x: Self) extends AnyVal {
    
    inline def setAggregationDuration(value: UtteranceAggregationDuration): Self = StObject.set(x, "aggregationDuration", value.asInstanceOf[js.Any])
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasIdUndefined: Self = StObject.set(x, "botAliasId", js.undefined)
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setFilters(value: AggregatedUtterancesFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setFiltersVarargs(value: AggregatedUtterancesFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSortBy(value: AggregatedUtterancesSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
