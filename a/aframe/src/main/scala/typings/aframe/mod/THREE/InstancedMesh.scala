package typings.aframe.mod.THREE

import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.InstancedMesh")
@js.native
class InstancedMesh protected ()
  extends typings.three.mod.InstancedMesh {
  def this(geometry: Geometry, material: typings.three.materialMod.Material, count: Double) = this()
}

