package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition extends StObject {
  
  /**
    * The duration of the live program in seconds.
    */
  var DurationMillis: js.UndefOr[long] = js.undefined
  
  /**
    * The position where this program will be inserted relative to the RelativePosition.
    */
  var RelativePosition: typings.awsSdk.clientsMediatailorMod.RelativePosition
  
  /**
    * The name of the program that this program will be inserted next to, as defined by RelativePosition.
    */
  var RelativeProgram: js.UndefOr[_String] = js.undefined
  
  /**
    * The date and time that the program is scheduled to start, in epoch milliseconds.
    */
  var ScheduledStartTimeMillis: js.UndefOr[long] = js.undefined
  
  /**
    * Defines when the program plays in the schedule. You can set the value to ABSOLUTE or RELATIVE.  ABSOLUTE - The program plays at a specific wall clock time. This setting can only be used for channels using the LINEAR PlaybackMode. Note the following considerations when using ABSOLUTE transitions: If the preceding program in the schedule has a duration that extends past the wall clock time, MediaTailor truncates the preceding program on a common segment boundary. If there are gaps in playback, MediaTailor plays the FillerSlate you configured for your linear channel.  RELATIVE - The program is inserted into the schedule either before or after a program that you specify via RelativePosition.
    */
  var Type: _String
}
object Transition {
  
  inline def apply(RelativePosition: RelativePosition, Type: _String): Transition = {
    val __obj = js.Dynamic.literal(RelativePosition = RelativePosition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    inline def setDurationMillis(value: long): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setRelativePosition(value: RelativePosition): Self = StObject.set(x, "RelativePosition", value.asInstanceOf[js.Any])
    
    inline def setRelativeProgram(value: _String): Self = StObject.set(x, "RelativeProgram", value.asInstanceOf[js.Any])
    
    inline def setRelativeProgramUndefined: Self = StObject.set(x, "RelativeProgram", js.undefined)
    
    inline def setScheduledStartTimeMillis(value: long): Self = StObject.set(x, "ScheduledStartTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeMillisUndefined: Self = StObject.set(x, "ScheduledStartTimeMillis", js.undefined)
    
    inline def setType(value: _String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
