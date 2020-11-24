package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BridgeMerged extends Event {
  
  /**
    * Bridge.
    */
  var bridge: Bridge = js.native
  
  /**
    * Bridge_from.
    */
  var bridge_from: Bridge = js.native
}
object BridgeMerged {
  
  @scala.inline
  def apply(application: String, bridge: Bridge, bridge_from: Bridge, timestamp: Date, `type`: String): BridgeMerged = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], bridge = bridge.asInstanceOf[js.Any], bridge_from = bridge_from.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BridgeMerged]
  }
  
  @scala.inline
  implicit class BridgeMergedOps[Self <: BridgeMerged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBridge(value: Bridge): Self = this.set("bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridge_from(value: Bridge): Self = this.set("bridge_from", value.asInstanceOf[js.Any])
  }
}
