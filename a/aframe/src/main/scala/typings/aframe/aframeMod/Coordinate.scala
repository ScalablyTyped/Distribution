package typings.aframe.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var x: Double
  var y: Double
  var z: Double
}

object Coordinate {
  @scala.inline
  def apply(x: Double, y: Double, z: Double): Coordinate = {
    val __obj = js.Dynamic.literal(x = x, y = y, z = z)
  
    __obj.asInstanceOf[Coordinate]
  }
}

