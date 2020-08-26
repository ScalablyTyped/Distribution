package typings.activexWia.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceID extends js.Object {
  val DeviceID: String = js.native
  val EventID: String = js.native
  val ItemID: String = js.native
}

object DeviceID {
  @scala.inline
  def apply(DeviceID: String, EventID: String, ItemID: String): DeviceID = {
    val __obj = js.Dynamic.literal(DeviceID = DeviceID.asInstanceOf[js.Any], EventID = EventID.asInstanceOf[js.Any], ItemID = ItemID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceID]
  }
  @scala.inline
  implicit class DeviceIDOps[Self <: DeviceID] (val x: Self) extends AnyVal {
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
    def setDeviceID(value: String): Self = this.set("DeviceID", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventID(value: String): Self = this.set("EventID", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemID(value: String): Self = this.set("ItemID", value.asInstanceOf[js.Any])
  }
  
}

