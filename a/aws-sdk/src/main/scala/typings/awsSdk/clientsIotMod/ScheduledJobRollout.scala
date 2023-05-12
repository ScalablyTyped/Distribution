package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledJobRollout extends StObject {
  
  /**
    * Displays the start times of the next seven maintenance window occurrences.
    */
  var startTime: js.UndefOr[StringDateTime] = js.undefined
}
object ScheduledJobRollout {
  
  inline def apply(): ScheduledJobRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledJobRollout]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledJobRollout] (val x: Self) extends AnyVal {
    
    inline def setStartTime(value: StringDateTime): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
  }
}
