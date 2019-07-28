package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultComponents extends js.Object {
  var position: Component[Coordinate, System[_]]
  var rotation: Component[Coordinate, System[_]]
  var scale: Component[Coordinate, System[_]]
}

object DefaultComponents {
  @scala.inline
  def apply(
    position: Component[Coordinate, System[_]],
    rotation: Component[Coordinate, System[_]],
    scale: Component[Coordinate, System[_]]
  ): DefaultComponents = {
    val __obj = js.Dynamic.literal(position = position, rotation = rotation, scale = scale)
  
    __obj.asInstanceOf[DefaultComponents]
  }
}

