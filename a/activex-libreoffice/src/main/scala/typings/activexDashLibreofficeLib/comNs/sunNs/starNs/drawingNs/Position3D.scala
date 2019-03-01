package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 3-dimensional point. */
trait Position3D extends js.Object {
  /** the position on the X-Axis in the 3D room in 100th of millimeters */
  var PositionX: scala.Double
  /** the position on the Y-Axis in the 3D room in 100th of millimeters */
  var PositionY: scala.Double
  /** the position on the Z-Axis in the 3D room in 100th of millimeters */
  var PositionZ: scala.Double
}

object Position3D {
  @scala.inline
  def apply(PositionX: scala.Double, PositionY: scala.Double, PositionZ: scala.Double): Position3D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PositionX")(PositionX)
    __obj.updateDynamic("PositionY")(PositionY)
    __obj.updateDynamic("PositionZ")(PositionZ)
    __obj.asInstanceOf[Position3D]
  }
}

