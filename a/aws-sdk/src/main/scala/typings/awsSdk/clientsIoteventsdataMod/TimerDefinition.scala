package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimerDefinition extends StObject {
  
  /**
    * The name of the timer.
    */
  var name: TimerName
  
  /**
    * The new setting of the timer (the number of seconds before the timer elapses).
    */
  var seconds: Seconds
}
object TimerDefinition {
  
  inline def apply(name: TimerName, seconds: Seconds): TimerDefinition = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimerDefinition]
  }
  
  extension [Self <: TimerDefinition](x: Self) {
    
    inline def setName(value: TimerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSeconds(value: Seconds): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
