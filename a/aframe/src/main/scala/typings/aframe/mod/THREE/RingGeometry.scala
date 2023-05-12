package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.RingGeometry")
@js.native
open class RingGeometry protected ()
  extends typings.three.mod.RingGeometry {
  /**
    * Create a new instance of {@link RingGeometry}
    * @param innerRadius Expects a `Float`. Default `0.5`.
    * @param outerRadius Expects a `Float`. Default `1`.
    * @param thetaSegments Number of segments. A higher number means the ring will be more round. Minimum is 3. Expects a `Integer`. Default `32`.
    * @param phiSegments Minimum is 1. Expects a `Integer`. Default `1`.
    * @param thetaStart Starting angle. Expects a `Float`. Default `0`.
    * @param thetaLength Central angle. Expects a `Float`. Default `Math.PI * 2`.
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
