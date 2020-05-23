package typings.aframe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Material extends js.Object {
  var material: js.Object
}

object Material {
  @scala.inline
  def apply(material: js.Object): Material = {
    val __obj = js.Dynamic.literal(material = material.asInstanceOf[js.Any])
    __obj.asInstanceOf[Material]
  }
}

