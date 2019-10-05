package typings.aframe.aframeMod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.SpotLight")
@js.native
class SpotLight protected ()
  extends typings.three.threeMod.SpotLight {
  def this(
    color: js.UndefOr[typings.three.srcMathColorMod.Color],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    exponent: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}

