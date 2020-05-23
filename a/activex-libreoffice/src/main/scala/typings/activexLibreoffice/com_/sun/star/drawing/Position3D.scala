package typings.activexLibreoffice.com_.sun.star.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 3-dimensional point. */
trait Position3D extends js.Object {
  /** the position on the X-Axis in the 3D room in 100th of millimeters */
  var PositionX: Double
  /** the position on the Y-Axis in the 3D room in 100th of millimeters */
  var PositionY: Double
  /** the position on the Z-Axis in the 3D room in 100th of millimeters */
  var PositionZ: Double
}

object Position3D {
  @scala.inline
  def apply(PositionX: Double, PositionY: Double, PositionZ: Double): Position3D = {
    val __obj = js.Dynamic.literal(PositionX = PositionX.asInstanceOf[js.Any], PositionY = PositionY.asInstanceOf[js.Any], PositionZ = PositionZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position3D]
  }
}

