package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class BridgeCreatedOps[Self <: BridgeCreated] (val x: Self) extends AnyVal {
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
  }
  
}

