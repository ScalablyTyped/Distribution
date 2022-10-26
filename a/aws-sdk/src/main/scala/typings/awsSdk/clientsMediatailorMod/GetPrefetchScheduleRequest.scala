package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPrefetchScheduleRequest extends StObject {
  
  /**
    * The name of the prefetch schedule. The name must be unique among all prefetch schedules that are associated with the specified playback configuration.
    */
  var Name: string
  
  /**
    * Returns information about the prefetch schedule for a specific playback configuration. If you call GetPrefetchSchedule on an expired prefetch schedule, MediaTailor returns an HTTP 404 status code.
    */
  var PlaybackConfigurationName: string
}
object GetPrefetchScheduleRequest {
  
  inline def apply(Name: string, PlaybackConfigurationName: string): GetPrefetchScheduleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PlaybackConfigurationName = PlaybackConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPrefetchScheduleRequest]
  }
  
  extension [Self <: GetPrefetchScheduleRequest](x: Self) {
    
    inline def setName(value: string): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setPlaybackConfigurationName(value: string): Self = StObject.set(x, "PlaybackConfigurationName", value.asInstanceOf[js.Any])
  }
}
