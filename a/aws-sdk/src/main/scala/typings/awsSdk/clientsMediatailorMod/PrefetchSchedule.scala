package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrefetchSchedule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the prefetch schedule.
    */
  var Arn: _String
  
  /**
    * Consumption settings determine how, and when, MediaTailor places the prefetched ads into ad breaks. Ad consumption occurs within a span of time that you define, called a consumption window. You can designate which ad breaks that MediaTailor fills with prefetch ads by setting avail matching criteria.
    */
  var Consumption: PrefetchConsumption
  
  /**
    * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with the specified playback configuration.
    */
  var Name: _String
  
  /**
    * The name of the playback configuration to create the prefetch schedule for.
    */
  var PlaybackConfigurationName: _String
  
  /**
    * A complex type that contains settings for prefetch retrieval from the ad decision server (ADS).
    */
  var Retrieval: PrefetchRetrieval
  
  /**
    * An optional stream identifier that you can specify in order to prefetch for multiple streams that use the same playback configuration.
    */
  var StreamId: js.UndefOr[_String] = js.undefined
}
object PrefetchSchedule {
  
  inline def apply(
    Arn: _String,
    Consumption: PrefetchConsumption,
    Name: _String,
    PlaybackConfigurationName: _String,
    Retrieval: PrefetchRetrieval
  ): PrefetchSchedule = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Consumption = Consumption.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PlaybackConfigurationName = PlaybackConfigurationName.asInstanceOf[js.Any], Retrieval = Retrieval.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefetchSchedule]
  }
  
  extension [Self <: PrefetchSchedule](x: Self) {
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setConsumption(value: PrefetchConsumption): Self = StObject.set(x, "Consumption", value.asInstanceOf[js.Any])
    
    inline def setName(value: _String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationName(value: _String): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setRetrieval(value: PrefetchRetrieval): Self = StObject.set(x, "Retrieval", value.asInstanceOf[js.Any])
    
    inline def setStreamId(value: _String): Self = StObject.set(x, "StreamId", value.asInstanceOf[js.Any])
    
    inline def setStreamIdUndefined: Self = StObject.set(x, "StreamId", js.undefined)
  }
}
