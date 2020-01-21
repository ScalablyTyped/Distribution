package typings.aframe.mod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.ParametricBufferGeometry")
@js.native
class ParametricBufferGeometry protected ()
  extends typings.three.mod.ParametricBufferGeometry {
  def this(
    func: js.Function3[/* u */ Double, /* v */ Double, /* dest */ typings.three.vector3Mod.Vector3, Unit],
    slices: Double,
    stacks: Double
  ) = this()
}

