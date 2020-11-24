package typings.aframe.mod.THREE

import typings.three.colorMod.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.SpotLight")
@js.native
class SpotLight protected ()
  extends typings.three.mod.SpotLight {
  def this(
    color: js.UndefOr[Color | String | Double],
    intensity: js.UndefOr[Double],
    distance: js.UndefOr[Double],
    angle: js.UndefOr[Double],
    penumbra: js.UndefOr[Double],
    decay: js.UndefOr[Double]
  ) = this()
}
