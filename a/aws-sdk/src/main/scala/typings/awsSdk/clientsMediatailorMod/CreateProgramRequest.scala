package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProgramRequest extends StObject {
  
  /**
    * The ad break configuration settings.
    */
  var AdBreaks: js.UndefOr[listOfAdBreak] = js.undefined
  
  /**
    * The name of the channel for this Program.
    */
  var ChannelName: string
  
  /**
    * The name of the LiveSource for this Program.
    */
  var LiveSourceName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the Program.
    */
  var ProgramName: string
  
  /**
    * The schedule configuration settings.
    */
  var ScheduleConfiguration: typings.awsSdk.clientsMediatailorMod.ScheduleConfiguration
  
  /**
    * The name of the source location.
    */
  var SourceLocationName: string
  
  /**
    * The name that's used to refer to a VOD source.
    */
  var VodSourceName: js.UndefOr[string] = js.undefined
}
object CreateProgramRequest {
  
  inline def apply(
    ChannelName: string,
    ProgramName: string,
    ScheduleConfiguration: ScheduleConfiguration,
    SourceLocationName: string
  ): CreateProgramRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], ScheduleConfiguration = ScheduleConfiguration.asInstanceOf[js.Any], SourceLocationName = SourceLocationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProgramRequest]
  }
  
  extension [Self <: CreateProgramRequest](x: Self) {
    
    inline def setAdBreaks(value: listOfAdBreak): Self = StObject.set(x, "AdBreaks", value.asInstanceOf[js.Any])
    
    inline def setAdBreaksUndefined: Self = StObject.set(x, "AdBreaks", js.undefined)
    
    inline def setAdBreaksVarargs(value: AdBreak*): Self = StObject.set(x, "AdBreaks", js.Array(value*))
    
    inline def setChannelName(value: string): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceName(value: string): Self = StObject.set(x, "LiveSourceName", value.asInstanceOf[js.Any])
    
    inline def setLiveSourceNameUndefined: Self = StObject.set(x, "LiveSourceName", js.undefined)
    
    inline def setProgramName(value: string): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfiguration(value: ScheduleConfiguration): Self = StObject.set(x, "ScheduleConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSourceLocationName(value: string): Self = StObject.set(x, "SourceLocationName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceName(value: string): Self = StObject.set(x, "VodSourceName", value.asInstanceOf[js.Any])
    
    inline def setVodSourceNameUndefined: Self = StObject.set(x, "VodSourceName", js.undefined)
  }
}
