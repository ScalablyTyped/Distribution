package typings.aframe

import typings.aframe.aframeMod.Component
import typings.aframe.aframeMod.Entity
import typings.aframe.aframeMod.ObjectMap
import typings.aframe.aframeMod.System
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Detail[D] extends js.Object {
  var detail: D
  var target: EventTarget with (Entity[ObjectMap[Component[_, System[_]]]])
}

object Anon_Detail {
  @scala.inline
  def apply[D](detail: D, target: EventTarget with (Entity[ObjectMap[Component[_, System[_]]]])): Anon_Detail[D] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Detail[D]]
  }
}

