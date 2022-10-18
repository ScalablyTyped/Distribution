package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetTimerAction extends StObject {
  
  /**
    * The duration of the timer, in seconds. You can use a string expression that includes numbers, variables ($variable.&lt;variable-name&gt;), and input values ($input.&lt;input-name&gt;.&lt;path-to-datum&gt;) as the duration. The range of the duration is 1-31622400 seconds. To ensure accuracy, the minimum duration is 60 seconds. The evaluated result of the duration is rounded down to the nearest whole number. 
    */
  var durationExpression: js.UndefOr[VariableValue] = js.undefined
  
  /**
    * The number of seconds until the timer expires. The minimum value is 60 seconds to ensure accuracy. The maximum value is 31622400 seconds. 
    */
  var seconds: js.UndefOr[Seconds] = js.undefined
  
  /**
    * The name of the timer.
    */
  var timerName: TimerName
}
object SetTimerAction {
  
  inline def apply(timerName: TimerName): SetTimerAction = {
    val __obj = js.Dynamic.literal(timerName = timerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTimerAction]
  }
  
  extension [Self <: SetTimerAction](x: Self) {
    
    inline def setDurationExpression(value: VariableValue): Self = StObject.set(x, "durationExpression", value.asInstanceOf[js.Any])
    
    inline def setDurationExpressionUndefined: Self = StObject.set(x, "durationExpression", js.undefined)
    
    inline def setSeconds(value: Seconds): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    
    inline def setTimerName(value: TimerName): Self = StObject.set(x, "timerName", value.asInstanceOf[js.Any])
  }
}
