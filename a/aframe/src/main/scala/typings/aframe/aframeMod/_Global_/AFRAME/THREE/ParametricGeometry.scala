package typings.aframe.aframeMod._Global_.AFRAME.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.ParametricGeometry")
@js.native
class ParametricGeometry protected ()
  extends typings.three.threeMod.ParametricGeometry {
  def this(
    func: js.Function3[
        /* u */ Double, 
        /* v */ Double, 
        /* dest */ typings.three.srcMathVector3Mod.Vector3, 
        Unit
      ],
    slices: Double,
    stacks: Double
  ) = this()
}

