package typings.aframe.anon

import typings.aframe.mod.Component
import typings.aframe.mod.Entity
import typings.aframe.mod.ObjectMap
import typings.aframe.mod.System
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait El extends js.Object {
  var el: Element | (Entity[ObjectMap[Component[_, System[_]]]])
}

object El {
  @scala.inline
  def apply(el: Element | (Entity[ObjectMap[Component[_, System[_]]]])): El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
    __obj.asInstanceOf[El]
  }
}

