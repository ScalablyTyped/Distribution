package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedUtterancesSummary extends StObject {
  
  /**
    * Aggregated utterance data may contain utterances from versions of your bot that have since been deleted. When the aggregated contains this kind of data, this field is set to true.
    */
  var containsDataFromDeletedResources: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * The number of times that the utterance was detected by Amazon Lex during the time period. When an utterance is detected, it activates an intent or a slot.
    */
  var hitCount: js.UndefOr[HitCount] = js.undefined
  
  /**
    * The number of times that the utterance was missed by Amazon Lex An utterance is missed when it doesn't activate an intent or slot.
    */
  var missedCount: js.UndefOr[MissedCount] = js.undefined
  
  /**
    * The text of the utterance. If the utterance was used with the RecognizeUtterance operation, the text is the transcription of the audio utterance.
    */
  var utterance: js.UndefOr[Utterance] = js.undefined
  
  /**
    * The date and time that the utterance was first recorded in the time window for aggregation. An utterance may have been sent to Amazon Lex before that time, but only utterances within the time window are counted.
    */
  var utteranceFirstRecordedInAggregationDuration: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date and time that an utterance was recorded in the time window for aggregation. An utterance may be sent to Amazon Lex after that time, but only utterances within the time window are counted.
    */
  var utteranceLastRecordedInAggregationDuration: js.UndefOr[js.Date] = js.undefined
}
object AggregatedUtterancesSummary {
  
  inline def apply(): AggregatedUtterancesSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedUtterancesSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedUtterancesSummary] (val x: Self) extends AnyVal {
    
    inline def setContainsDataFromDeletedResources(value: BoxedBoolean): Self = StObject.set(x, "containsDataFromDeletedResources", value.asInstanceOf[js.Any])
    
    inline def setContainsDataFromDeletedResourcesUndefined: Self = StObject.set(x, "containsDataFromDeletedResources", js.undefined)
    
    inline def setHitCount(value: HitCount): Self = StObject.set(x, "hitCount", value.asInstanceOf[js.Any])
    
    inline def setHitCountUndefined: Self = StObject.set(x, "hitCount", js.undefined)
    
    inline def setMissedCount(value: MissedCount): Self = StObject.set(x, "missedCount", value.asInstanceOf[js.Any])
    
    inline def setMissedCountUndefined: Self = StObject.set(x, "missedCount", js.undefined)
    
    inline def setUtterance(value: Utterance): Self = StObject.set(x, "utterance", value.asInstanceOf[js.Any])
    
    inline def setUtteranceFirstRecordedInAggregationDuration(value: js.Date): Self = StObject.set(x, "utteranceFirstRecordedInAggregationDuration", value.asInstanceOf[js.Any])
    
    inline def setUtteranceFirstRecordedInAggregationDurationUndefined: Self = StObject.set(x, "utteranceFirstRecordedInAggregationDuration", js.undefined)
    
    inline def setUtteranceLastRecordedInAggregationDuration(value: js.Date): Self = StObject.set(x, "utteranceLastRecordedInAggregationDuration", value.asInstanceOf[js.Any])
    
    inline def setUtteranceLastRecordedInAggregationDurationUndefined: Self = StObject.set(x, "utteranceLastRecordedInAggregationDuration", js.undefined)
    
    inline def setUtteranceUndefined: Self = StObject.set(x, "utterance", js.undefined)
  }
}
