package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeCreated extends Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge = js.native
}
object BridgeCreated {
  
  @scala.inline
  def apply(application: String, bridge: Bridge, timestamp: Date, `type`: String): BridgeCreated = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeCreated]
  }
  
  @scala.inline
  implicit class BridgeCreatedMutableBuilder[Self <: BridgeCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
  }
}
