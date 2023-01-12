package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAggregatedUtterancesResponse extends StObject {
  
  /**
    * Summaries of the aggregated utterance data. Each response contains information about the number of times that the utterance was seen during the time period, whether it was detected or missed, and when it was seen during the time period.
    */
  var aggregatedUtterancesSummaries: js.UndefOr[AggregatedUtterancesSummaryList] = js.undefined
  
  /**
    * The time period used to aggregate the utterance data.
    */
  var aggregationDuration: js.UndefOr[UtteranceAggregationDuration] = js.undefined
  
  /**
    * The last date and time that the aggregated data was collected. The time period depends on the length of the aggregation window.    Hours - for 1 hour time window, every half hour; otherwise every hour.    Days - every 6 hours    Weeks - for a one week time window, every 12 hours; otherwise, every day  
    */
  var aggregationLastRefreshedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the aggregation window ends. Only data collected between the start time and the end time are returned in the results. 
    */
  var aggregationWindowEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time that the aggregation window begins. Only data collected after this time is returned in the results.
    */
  var aggregationWindowStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the bot alias that contains the utterances. If you specified the bot version, the bot alias ID isn't returned.
    */
  var botAliasId: js.UndefOr[BotAliasId] = js.undefined
  
  /**
    * The identifier of the bot that contains the utterances.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The identifier of the bot version that contains the utterances. If you specified the bot alias, the bot version isn't returned.
    */
  var botVersion: js.UndefOr[BotVersion] = js.undefined
  
  /**
    * The identifier of the language and locale that the utterances are in.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * A token that indicates whether there are more results to return in a response to the ListAggregatedUtterances operation. If the nextToken field is present, you send the contents as the nextToken parameter of a ListAggregatedUtterances operation request to get the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListAggregatedUtterancesResponse {
  
  inline def apply(): ListAggregatedUtterancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAggregatedUtterancesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAggregatedUtterancesResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregatedUtterancesSummaries(value: AggregatedUtterancesSummaryList): Self = StObject.set(x, "aggregatedUtterancesSummaries", value.asInstanceOf[js.Any])
    
    inline def setAggregatedUtterancesSummariesUndefined: Self = StObject.set(x, "aggregatedUtterancesSummaries", js.undefined)
    
    inline def setAggregatedUtterancesSummariesVarargs(value: AggregatedUtterancesSummary*): Self = StObject.set(x, "aggregatedUtterancesSummaries", js.Array(value*))
    
    inline def setAggregationDuration(value: UtteranceAggregationDuration): Self = StObject.set(x, "aggregationDuration", value.asInstanceOf[js.Any])
    
    inline def setAggregationDurationUndefined: Self = StObject.set(x, "aggregationDuration", js.undefined)
    
    inline def setAggregationLastRefreshedDateTime(value: js.Date): Self = StObject.set(x, "aggregationLastRefreshedDateTime", value.asInstanceOf[js.Any])
    
    inline def setAggregationLastRefreshedDateTimeUndefined: Self = StObject.set(x, "aggregationLastRefreshedDateTime", js.undefined)
    
    inline def setAggregationWindowEndTime(value: js.Date): Self = StObject.set(x, "aggregationWindowEndTime", value.asInstanceOf[js.Any])
    
    inline def setAggregationWindowEndTimeUndefined: Self = StObject.set(x, "aggregationWindowEndTime", js.undefined)
    
    inline def setAggregationWindowStartTime(value: js.Date): Self = StObject.set(x, "aggregationWindowStartTime", value.asInstanceOf[js.Any])
    
    inline def setAggregationWindowStartTimeUndefined: Self = StObject.set(x, "aggregationWindowStartTime", js.undefined)
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasIdUndefined: Self = StObject.set(x, "botAliasId", js.undefined)
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
