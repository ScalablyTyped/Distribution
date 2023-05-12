package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProgramResponse extends StObject {
  
  /**
    * The ad break configuration settings.
    */
  var AdBreaks: js.UndefOr[listOfAdBreak] = js.undefined
  
  /**
    * The ARN of the program.
    */
  var Arn: js.UndefOr[_String] = js.undefined
  
  /**
    * The name of the channel that the program belongs to.
    */
  var ChannelName: js.UndefOr[_String] = js.undefined
  
  /**
    * The clip range configuration settings.
    */
  var ClipRange: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ClipRange] = js.undefined
  
  /**
    * The timestamp of when the program was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The duration of the live program in milliseconds.
    */
  var DurationMillis: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the LiveSource for this Program.
    */
  var LiveSourceName: js.UndefOr[_String] = js.undefined
  
  /**
    * The name of the program.
    */
  var ProgramName: js.UndefOr[_String] = js.undefined
  
  /**
    * The date and time that the program is scheduled to start in ISO 8601 format and Coordinated Universal Time (UTC). For example, the value 2021-03-27T17:48:16.751Z represents March 27, 2021 at 17:48:16.751 UTC.
    */
  var ScheduledStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The source location name.
    */
  var SourceLocationName: js.UndefOr[_String] = js.undefined
  
  /**
    * The name that's used to refer to a VOD source.
    */
  var VodSourceName: js.UndefOr[_String] = js.undefined
}
object DescribeProgramResponse {
  
  inline def apply(): DescribeProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProgramResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeProgramResponse] (val x: Self) extends AnyVal {
    
    inline def setAdBreaks(value: listOfAdBreak): Self = StObject.set(x, "AdBreaks", value.asInstanceOf[js.Any])
    
    inline def setAdBreaksUndefined: Self = StObject.set(x, "AdBreaks", js.undefined)
    
    inline def setAdBreaksVarargs(value: AdBreak*): Self = StObject.set(x, "AdBreaks", js.Array(value*))
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    inline def setClipRange(value: ClipRange): Self = StObject.set(x, "ClipRange", value.asInstanceOf[js.Any])
    
    inline def setClipRangeUndefined: Self = StObject.set(x, "ClipRange", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDurationMillis(value: Long): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setLiveSourceName(value: _String): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceNameUndefined: Self = StObject.set(x, "LiveSourceName", js.undefined)
    
    inline def setProgramName(value: _String): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    inline def setProgramNameUndefined: Self = StObject.set(x, "ProgramName", js.undefined)
    
    inline def setScheduledStartTime(value: js.Date): Self = StObject.set(x, "ScheduledStartTime", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeUndefined: Self = StObject.set(x, "ScheduledStartTime", js.undefined)
    
    inline def setSourceLocationName(value: _String): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationNameUndefined: Self = StObject.set(x, "SourceLocationName", js.undefined)
    
    inline def setVodSourceName(value: _String): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
