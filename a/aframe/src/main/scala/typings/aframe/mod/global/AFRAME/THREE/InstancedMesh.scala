package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.InstancedMesh")
@js.native
open class InstancedMesh[TGeometry /* <: typings.three.srcCoreBufferGeometryMod.BufferGeometry */, TMaterial /* <: typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material] */] protected ()
  extends typings.three.mod.InstancedMesh[TGeometry, TMaterial] {
  def this(
    geometry: /* import warning: RewrittenClass.unapply cls was tparam TGeometry */ Any,
    material: /* import warning: RewrittenClass.unapply cls was tparam TMaterial */ Any,
    count: Double
  ) = this()
}
