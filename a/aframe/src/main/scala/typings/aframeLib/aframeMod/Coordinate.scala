package typings
package aframeLib.aframeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coordinate extends js.Object {
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object Coordinate {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double, z: scala.Double): Coordinate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[Coordinate]
  }
}

