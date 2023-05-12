package typings.aframe.mod.THREE

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes] */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] protected ()
  extends typings.three.mod.InstancedMesh[TGeometry, TMaterial] {
  /**
    * Create a new instance of {@link InstancedMesh}
    * @param geometry An instance of {@link THREE.BufferGeometry | BufferGeometry}.
    * @param material A single or an array of {@link THREE.Material | Material}. Default {@link THREE.MeshBasicMaterial | `new THREE.MeshBasicMaterial()`}.
    * @param count The **maximum** number of instances of this Mesh. Expects a `Integer`
    */
  def this(
    geometry: /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ Any,
    material: /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ Any,
    count: Double
  ) = this()
}
