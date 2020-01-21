package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMaterial extends js.Object {
  var material: js.Object
}

object AnonMaterial {
  @scala.inline
  def apply(material: js.Object): AnonMaterial = {
    val __obj = js.Dynamic.literal(material = material.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMaterial]
  }
}

