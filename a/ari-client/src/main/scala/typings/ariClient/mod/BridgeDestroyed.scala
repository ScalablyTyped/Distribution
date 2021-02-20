package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeDestroyed extends Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge = js.native
}
object BridgeDestroyed {
  
  @scala.inline
  def apply(application: String, bridge: Bridge, timestamp: Date, `type`: String): BridgeDestroyed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeDestroyed]
  }
  
  @scala.inline
  implicit class BridgeDestroyedMutableBuilder[Self <: BridgeDestroyed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
