package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProgramResponse extends StObject {
  
  /**
    * The ad break configuration settings.
    */
  var AdBreaks: js.UndefOr[listOfAdBreak] = js.undefined
  
  /**
    * The ARN to assign to the program.
    */
  var Arn: js.UndefOr[_String] = js.undefined
  
  /**
    * The name to assign to the channel for this program.
    */
  var ChannelName: js.UndefOr[_String] = js.undefined
  
  /**
    * The time the program was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the LiveSource for this Program.
    */
  var LiveSourceName: js.UndefOr[_String] = js.undefined
  
  /**
    * The name to assign to this program.
    */
  var ProgramName: js.UndefOr[_String] = js.undefined
  
  /**
    * The scheduled start time for this Program.
    */
  var ScheduledStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name to assign to the source location for this program.
    */
  var SourceLocationName: js.UndefOr[_String] = js.undefined
  
  /**
    * The name that's used to refer to a VOD source.
    */
  var VodSourceName: js.UndefOr[_String] = js.undefined
}
object CreateProgramResponse {
  
  inline def apply(): CreateProgramResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateProgramResponse]
  }
  
  extension [Self <: CreateProgramResponse](x: Self) {
    
    inline def setAdBreaks(value: listOfAdBreak): Self = StObject.set(x, "AdBreaks", value.asInstanceOf[js.Any])
    
    inline def setAdBreaksUndefined: Self = StObject.set(x, "AdBreaks", js.undefined)
    
    inline def setAdBreaksVarargs(value: AdBreak*): Self = StObject.set(x, "AdBreaks", js.Array(value*))
    
    inline def setArn(value: _String): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "ChannelName", js.undefined)
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
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
