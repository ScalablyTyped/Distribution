package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProgramTransition extends StObject {
  
  /**
    * The duration of the live program in seconds.
    */
  var DurationMillis: js.UndefOr[_Long] = js.undefined
  
  /**
    * The date and time that the program is scheduled to start, in epoch milliseconds.
    */
  var ScheduledStartTimeMillis: js.UndefOr[_Long] = js.undefined
}
object UpdateProgramTransition {
  
  inline def apply(): UpdateProgramTransition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProgramTransition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProgramTransition] (val x: Self) extends AnyVal {
    
    inline def setDurationMillis(value: _Long): Self = StObject.set(x, "DurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDurationMillisUndefined: Self = StObject.set(x, "DurationMillis", js.undefined)
    
    inline def setScheduledStartTimeMillis(value: _Long): Self = StObject.set(x, "ScheduledStartTimeMillis", value.asInstanceOf[js.Any])
    
    inline def setScheduledStartTimeMillisUndefined: Self = StObject.set(x, "ScheduledStartTimeMillis", js.undefined)
  }
}
