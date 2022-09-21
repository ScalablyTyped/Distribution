package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeCreated
  extends StObject
     with Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge
}
object BridgeCreated {
  
  inline def apply(application: String, bridge: Bridge, timestamp: js.Date, `type`: String): BridgeCreated = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeCreated]
  }
  
  extension [Self <: BridgeCreated](x: Self) {
    
    inline def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
