package typings.aframe

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDetail[D] extends js.Object {
  var detail: D
  var target: EventTarget with (Entity[ObjectMap[Component[_, System[_]]]])
}

object AnonDetail {
  @scala.inline
  def apply[D](detail: D, target: EventTarget with (Entity[ObjectMap[Component[_, System[_]]]])): AnonDetail[D] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDetail[D]]
  }
}

