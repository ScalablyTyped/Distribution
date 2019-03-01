package typings
package activexDashWiaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DeviceID extends js.Object {
  val DeviceID: java.lang.String
  val EventID: java.lang.String
  val ItemID: java.lang.String
}

object Anon_DeviceID {
  @scala.inline
  def apply(DeviceID: java.lang.String, EventID: java.lang.String, ItemID: java.lang.String): Anon_DeviceID = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DeviceID")(DeviceID)
    __obj.updateDynamic("EventID")(EventID)
    __obj.updateDynamic("ItemID")(ItemID)
    __obj.asInstanceOf[Anon_DeviceID]
  }
}

