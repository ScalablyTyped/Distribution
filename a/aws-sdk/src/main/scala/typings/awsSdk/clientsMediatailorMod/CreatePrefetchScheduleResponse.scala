package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePrefetchScheduleResponse extends StObject {
  
  /**
    * The ARN to assign to the prefetch schedule.
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * The configuration settings for MediaTailor's consumption of the prefetched ads from the ad decision server. Each consumption configuration contains an end time and an optional start time that define the consumption window. Prefetch schedules automatically expire no earlier than seven days after the end time.
    */
  var Consumption: js.UndefOr[PrefetchConsumption] = js.undefined
  
  /**
    * The name to assign to the prefetch schedule.
    */
  var Name: js.UndefOr[string] = js.undefined
  
  /**
    * The name to assign to the playback configuration.
    */
  var PlaybackConfigurationName: js.UndefOr[string] = js.undefined
  
  /**
    * The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of prefetched ads will be retrieved and subsequently consumed for each ad break.
    */
  var Retrieval: js.UndefOr[PrefetchRetrieval] = js.undefined
  
  /**
    * An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with an exact match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the playback configuration, regardless of StreamId.
    */
  var StreamId: js.UndefOr[string] = js.undefined
}
object CreatePrefetchScheduleResponse {
  
  inline def apply(): CreatePrefetchScheduleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePrefetchScheduleResponse]
  }
  
  extension [Self <: CreatePrefetchScheduleResponse](x: Self) {
    
    inline def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setConsumption(value: PrefetchConsumption): Self = StObject.set(x, "Consumption", value.asInstanceOf[js.Any])
    
    inline def setConsumptionUndefined: Self = StObject.set(x, "Consumption", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationNameUndefined: Self = StObject.set(x, "PlaybackConfigurationName", js.undefined)
    
    inline def setRetrieval(value: PrefetchRetrieval): Self = StObject.set(x, "Retrieval", value.asInstanceOf[js.Any])
    
    inline def setRetrievalUndefined: Self = StObject.set(x, "Retrieval", js.undefined)
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
