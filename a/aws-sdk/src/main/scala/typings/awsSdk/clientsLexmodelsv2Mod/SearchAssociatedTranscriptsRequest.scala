package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchAssociatedTranscriptsRequest extends StObject {
  
  /**
    * The unique identifier of the bot associated with the transcripts that you are searching.
    */
  var botId: Id
  
  /**
    * The unique identifier of the bot recommendation associated with the transcripts to search.
    */
  var botRecommendationId: Id
  
  /**
    * The version of the bot containing the transcripts that you are searching.
    */
  var botVersion: BotVersion
  
  /**
    * A list of filter objects.
    */
  var filters: AssociatedTranscriptFilters
  
  /**
    * The identifier of the language and locale of the transcripts to search. The string must match one of the supported locales. For more information, see Supported languages 
    */
  var localeId: LocaleId
  
  /**
    * The maximum number of bot recommendations to return in each page of results. If there are fewer results than the max page size, only the actual number of results are returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * If the response from the SearchAssociatedTranscriptsRequest operation contains more results than specified in the maxResults parameter, an index is returned in the response. Use that index in the nextIndex parameter to return the next page of results.
    */
  var nextIndex: js.UndefOr[NextIndex] = js.undefined
  
  /**
    * How SearchResults are ordered. Valid values are Ascending or Descending. The default is Descending.
    */
  var searchOrder: js.UndefOr[SearchOrder] = js.undefined
}
object SearchAssociatedTranscriptsRequest {
  
  inline def apply(
    botId: Id,
    botRecommendationId: Id,
    botVersion: BotVersion,
    filters: AssociatedTranscriptFilters,
    localeId: LocaleId
  ): SearchAssociatedTranscriptsRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botRecommendationId = botRecommendationId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any], filters = filters.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchAssociatedTranscriptsRequest]
  }
  
  extension [Self <: SearchAssociatedTranscriptsRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotRecommendationId(value: Id): Self = StObject.set(x, "botRecommendationId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: AssociatedTranscriptFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: AssociatedTranscriptFilter*): Self = StObject.set(x, "filters", js.Array(value*))
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextIndex(value: NextIndex): Self = StObject.set(x, "nextIndex", value.asInstanceOf[js.Any])
    
    inline def setNextIndexUndefined: Self = StObject.set(x, "nextIndex", js.undefined)
    
    inline def setSearchOrder(value: SearchOrder): Self = StObject.set(x, "searchOrder", value.asInstanceOf[js.Any])
    
    inline def setSearchOrderUndefined: Self = StObject.set(x, "searchOrder", js.undefined)
  }
}
