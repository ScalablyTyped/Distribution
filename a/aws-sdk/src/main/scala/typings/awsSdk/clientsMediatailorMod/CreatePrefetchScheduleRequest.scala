package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePrefetchScheduleRequest extends StObject {
  
  /**
    * The configuration settings for MediaTailor's consumption of the prefetched ads from the ad decision server. Each consumption configuration contains an end time and an optional start time that define the consumption window. Prefetch schedules automatically expire no earlier than seven days after the end time.
    */
  var Consumption: PrefetchConsumption
  
  /**
    * The name to assign to the schedule request.
    */
  var Name: string
  
  /**
    * The name to assign to the playback configuration.
    */
  var PlaybackConfigurationName: string
  
  /**
    * The configuration settings for retrieval of prefetched ads from the ad decision server. Only one set of prefetched ads will be retrieved and subsequently consumed for each ad break.
    */
  var Retrieval: PrefetchRetrieval
  
  /**
    * An optional stream identifier that MediaTailor uses to prefetch ads for multiple streams that use the same playback configuration. If StreamId is specified, MediaTailor returns all of the prefetch schedules with an exact match on StreamId. If not specified, MediaTailor returns all of the prefetch schedules for the playback configuration, regardless of StreamId.
    */
  var StreamId: js.UndefOr[string] = js.undefined
}
object CreatePrefetchScheduleRequest {
  
  inline def apply(
    Consumption: PrefetchConsumption,
    Name: string,
    PlaybackConfigurationName: string,
    Retrieval: PrefetchRetrieval
  ): CreatePrefetchScheduleRequest = {
    val __obj = js.Dynamic.literal(Consumption = Consumption.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlaybackConfigurationName = PlaybackConfigurationName.asInstanceOf[js.Any], Retrieval = Retrieval.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrefetchScheduleRequest]
  }
  
  extension [Self <: CreatePrefetchScheduleRequest](x: Self) {
    
    inline def setConsumption(value: PrefetchConsumption): Self = StObject.set(x, "Consumption", value.asInstanceOf[js.Any])
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setRetrieval(value: PrefetchRetrieval): Self = StObject.set(x, "Retrieval", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: string): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
