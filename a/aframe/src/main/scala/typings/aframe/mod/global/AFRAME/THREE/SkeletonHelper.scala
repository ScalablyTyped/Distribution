package typings.aframe.mod.global.AFRAME.THREE

import typings.three.srcCoreBufferGeometryMod.NormalBufferAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.SkeletonHelper")
@js.native
open class SkeletonHelper protected ()
  extends typings.three.mod.SkeletonHelper {
  /**
    * Create a new instance of {@link SkeletonHelper}
    * @param object Usually an instance of {@link THREE.SkinnedMesh | SkinnedMesh}.
    * However, any instance of {@link THREE.Object3D | Object3D} can be used if it represents a hierarchy of {@link Bone | Bone}s (via {@link THREE.Object3D.children | Object3D.children}).
    */
  def this(`object`: typings.three.srcThreeMod.SkinnedMesh[
        typings.three.srcCoreBufferGeometryMod.BufferGeometry[NormalBufferAttributes], 
        typings.three.srcMaterialsMaterialMod.Material | js.Array[typings.three.srcMaterialsMaterialMod.Material]
      ]) = this()
}
