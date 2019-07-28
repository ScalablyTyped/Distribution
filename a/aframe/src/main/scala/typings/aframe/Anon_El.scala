package typings.aframe

import typings.aframe.aframeMod.Component
import typings.aframe.aframeMod.Entity
import typings.aframe.aframeMod.ObjectMap
import typings.aframe.aframeMod.System
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_El extends js.Object {
  var el: Element | (Entity[ObjectMap[Component[_, System[_]]]])
}

object Anon_El {
  @scala.inline
  def apply(el: Element | (Entity[ObjectMap[Component[_, System[_]]]])): Anon_El = {
    val __obj = js.Dynamic.literal(el = el.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_El]
  }
}

