package typings.aframe.mod.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.ConeGeometry")
@js.native
open class ConeGeometry protected ()
  extends typings.three.mod.ConeGeometry {
  /**
    * Create a new instance of {@link ConeGeometry}
    * @param radius Radius of the cone base. Expects a `Float`. Default `1`
    * @param height Height of the cone. Expects a `Float`. Default `1`
    * @param radialSegments Number of segmented faces around the circumference of the cone. Expects a `Integer`. Default `32`
    * @param heightSegments Number of rows of faces along the height of the cone. Expects a `Integer`. Default `1`
    * @param openEnded A Boolean indicating whether the base of the cone is open or capped. Default `false`, _meaning capped_.
    * @param thetaStart Start angle for first segment. Expects a `Float`. Default `0`, _(three o'clock position)_.
    * @param thetaLength The central angle, often called theta, of the circular sector. Expects a `Float`. Default `Math.PI * 2`, _which makes for a complete cone_.
    */
  def this(
    radius: js.UndefOr[Double],
    height: js.UndefOr[Double],
    radialSegments: js.UndefOr[Double],
    heightSegments: js.UndefOr[Double],
    openEnded: js.UndefOr[Boolean],
    thetaStart: js.UndefOr[Double],
    thetaLength: js.UndefOr[Double]
  ) = this()
}
