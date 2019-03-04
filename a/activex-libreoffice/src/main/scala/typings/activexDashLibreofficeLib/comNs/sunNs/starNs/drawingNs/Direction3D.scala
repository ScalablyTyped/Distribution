package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 3-dimensional vector. */
trait Direction3D extends js.Object {
  var DirectionX: scala.Double
  var DirectionY: scala.Double
  var DirectionZ: scala.Double
}

object Direction3D {
  @scala.inline
  def apply(DirectionX: scala.Double, DirectionY: scala.Double, DirectionZ: scala.Double): Direction3D = {
    val __obj = js.Dynamic.literal(DirectionX = DirectionX, DirectionY = DirectionY, DirectionZ = DirectionZ)
  
    __obj.asInstanceOf[Direction3D]
  }
}

