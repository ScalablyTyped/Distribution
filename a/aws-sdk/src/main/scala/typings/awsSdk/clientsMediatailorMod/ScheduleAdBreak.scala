package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleAdBreak extends StObject {
  
  /**
    * The approximate duration of the ad break, in seconds.
    */
  var ApproximateDurationSeconds: js.UndefOr[long] = js.undefined
  
  /**
    * The approximate time that the ad will start playing.
    */
  var ApproximateStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the source location containing the VOD source used for the ad break.
    */
  var SourceLocationName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the VOD source used for the ad break.
    */
  var VodSourceName: js.UndefOr[string] = js.undefined
}
object ScheduleAdBreak {
  
  inline def apply(): ScheduleAdBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleAdBreak]
  }
  
  extension [Self <: ScheduleAdBreak](x: Self) {
    
    inline def setApproximateDurationSeconds(value: long): Self = StObject.set(x, "ApproximateDurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setApproximateDurationSecondsUndefined: Self = StObject.set(x, "ApproximateDurationSeconds", js.undefined)
    
    inline def setApproximateStartTime(value: js.Date): Self = StObject.set(x, "ApproximateStartTime", value.asInstanceOf[js.Any])
    
    inline def setApproximateStartTimeUndefined: Self = StObject.set(x, "ApproximateStartTime", js.undefined)
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
