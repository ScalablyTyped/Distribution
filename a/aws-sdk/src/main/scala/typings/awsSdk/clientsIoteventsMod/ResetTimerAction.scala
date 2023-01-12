package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetTimerAction extends StObject {
  
  /**
    * The name of the timer to reset.
    */
  var timerName: TimerName
}
object ResetTimerAction {
  
  inline def apply(timerName: TimerName): ResetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResetTimerAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetTimerAction] (val x: Self) extends AnyVal {
    
    inline def setTimerName(value: TimerName): Self = StObject.set(x, "timerName", value.asInstanceOf[js.Any])
  }
}
