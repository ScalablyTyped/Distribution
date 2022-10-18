package typings.awsSdk.clientsIoteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timer extends StObject {
  
  /**
    * The name of the timer.
    */
  var name: TimerName
  
  /**
    * The expiration time for the timer.
    */
  var timestamp: js.Date
}
object Timer {
  
  inline def apply(name: TimerName, timestamp: js.Date): Timer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timer]
  }
  
  extension [Self <: Timer](x: Self) {
    
    inline def setName(value: TimerName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
