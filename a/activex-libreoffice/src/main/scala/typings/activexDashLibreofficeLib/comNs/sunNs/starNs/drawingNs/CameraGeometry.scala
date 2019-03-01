package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies a three-dimensional camera. */
trait CameraGeometry extends js.Object {
  /** is the camera view direction */
  var vpn: Direction3D
  /** is the camera position */
  var vrp: Position3D
  /** is the camera up direction */
  var vup: Direction3D
}

object CameraGeometry {
  @scala.inline
  def apply(vpn: Direction3D, vrp: Position3D, vup: Direction3D): CameraGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("vpn")(vpn)
    __obj.updateDynamic("vrp")(vrp)
    __obj.updateDynamic("vup")(vup)
    __obj.asInstanceOf[CameraGeometry]
  }
}

