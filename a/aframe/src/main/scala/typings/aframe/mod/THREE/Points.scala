package typings.aframe.mod.THREE

import typings.three.bufferGeometryMod.BufferGeometry
import typings.three.geometryMod.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.Points")
@js.native
/**
	 * @param geometry An instance of Geometry or BufferGeometry.
	 * @param material An instance of Material (optional).
	 */
class Points[TGeometry /* <: Geometry | BufferGeometry */, TMaterial /* <: typings.three.materialMod.Material | js.Array[typings.three.materialMod.Material] */] ()
  extends typings.three.mod.Points[TGeometry, TMaterial]

