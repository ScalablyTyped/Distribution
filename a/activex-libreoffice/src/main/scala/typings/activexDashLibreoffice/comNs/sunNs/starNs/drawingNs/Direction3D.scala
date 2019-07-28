package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a 3-dimensional vector. */
trait Direction3D extends js.Object {
  var DirectionX: Double
  var DirectionY: Double
  var DirectionZ: Double
}

object Direction3D {
  @scala.inline
  def apply(DirectionX: Double, DirectionY: Double, DirectionZ: Double): Direction3D = {
    val __obj = js.Dynamic.literal(DirectionX = DirectionX, DirectionY = DirectionY, DirectionZ = DirectionZ)
  
    __obj.asInstanceOf[Direction3D]
  }
}

