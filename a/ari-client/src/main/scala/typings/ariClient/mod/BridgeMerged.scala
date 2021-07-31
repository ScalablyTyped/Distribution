package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BridgeMerged
  extends StObject
     with Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge
  
  /**
    * Bridge_from.
    */
  var bridge_from: Bridge
}
object BridgeMerged {
  
  @scala.inline
  def apply(application: String, bridge: Bridge, bridge_from: Bridge, timestamp: Date, `type`: String): BridgeMerged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], bridge_from = bridge_from.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeMerged]
  }
  
  @scala.inline
  implicit class BridgeMergedMutableBuilder[Self <: BridgeMerged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridge_from(value: Bridge): Self = StObject.set(x, "bridge_from", value.asInstanceOf[js.Any])
  }
}
