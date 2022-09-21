package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeDestroyed
  extends StObject
     with Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge
}
object BridgeDestroyed {
  
  inline def apply(application: String, bridge: Bridge, timestamp: js.Date, `type`: String): BridgeDestroyed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeDestroyed]
  }
  
  extension [Self <: BridgeDestroyed](x: Self) {
    
    inline def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
