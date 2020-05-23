package typings.actionsOnGoogle.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Devices extends js.Object {
  var devices: States
}

object Devices {
  @scala.inline
  def apply(devices: States): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
}

