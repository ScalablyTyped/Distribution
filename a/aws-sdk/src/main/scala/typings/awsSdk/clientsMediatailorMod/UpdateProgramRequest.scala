package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProgramRequest extends StObject {
  
  /**
    * The ad break configuration settings.
    */
  var AdBreaks: js.UndefOr[listOfAdBreak] = js.undefined
  
  /**
    * The name of the channel for this Program.
    */
  var ChannelName: _String
  
  /**
    * The name of the Program.
    */
  var ProgramName: _String
  
  /**
    * The schedule configuration settings.
    */
  var ScheduleConfiguration: UpdateProgramScheduleConfiguration
}
object UpdateProgramRequest {
  
  inline def apply(
    ChannelName: _String,
    ProgramName: _String,
    ScheduleConfiguration: UpdateProgramScheduleConfiguration
  ): UpdateProgramRequest = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], ProgramName = ProgramName.asInstanceOf[js.Any], ScheduleConfiguration = ScheduleConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProgramRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProgramRequest] (val x: Self) extends AnyVal {
    
    inline def setAdBreaks(value: listOfAdBreak): Self = StObject.set(x, "AdBreaks", value.asInstanceOf[js.Any])
    
    inline def setAdBreaksUndefined: Self = StObject.set(x, "AdBreaks", js.undefined)
    
    inline def setAdBreaksVarargs(value: AdBreak*): Self = StObject.set(x, "AdBreaks", js.Array(value*))
    
    inline def setChannelName(value: _String): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    inline def setProgramName(value: _String): Self = StObject.set(x, "ProgramName", value.asInstanceOf[js.Any])
    
    inline def setScheduleConfiguration(value: UpdateProgramScheduleConfiguration): Self = StObject.set(x, "ScheduleConfiguration", value.asInstanceOf[js.Any])
  }
}
