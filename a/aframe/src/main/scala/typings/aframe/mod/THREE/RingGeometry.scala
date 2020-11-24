package typings.aframe.mod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.RingGeometry")
@js.native
class RingGeometry protected ()
  extends typings.three.mod.RingGeometry {
  /**
  	 * @param [innerRadius=0.5]
  	 * @param [outerRadius=1]
  	 * @param [thetaSegments=8]
  	 * @param [phiSegments=1]
  	 * @param [thetaStart=0]
  	 * @param [thetaLength=Math.PI * 2]
  	 */
  def this(
    innerRadius: js.UndefOr[Double],
    outerRadius: js.UndefOr[Double],
    thetaSegments: js.UndefOr[Double],
    phiSegments: js.UndefOr[Double],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}
