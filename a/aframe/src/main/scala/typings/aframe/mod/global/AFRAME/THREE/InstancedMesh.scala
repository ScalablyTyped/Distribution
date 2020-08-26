package typings.aframe.mod.global.AFRAME.THREE

import typings.three.bufferGeometryMod.BufferGeometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.InstancedMesh")
@js.native
class InstancedMesh[TGeometry /* <: typings.three.geometryMod.Geometry | BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] protected ()
  extends typings.three.mod.InstancedMesh[TGeometry, TMaterial] {
  def this(
    geometry: /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ js.Any,
    material: /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ js.Any,
    count: Double
  ) = this()
}

