package typings.activexLibreoffice.com_.sun.star.drawing

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
    val __obj = js.Dynamic.literal(vpn = vpn.asInstanceOf[js.Any], vrp = vrp.asInstanceOf[js.Any], vup = vup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CameraGeometry]
  }
}

