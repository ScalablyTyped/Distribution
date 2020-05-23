package typings.aframe.anon

import typings.three.geometryMod.Geometry
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofSceneUtils extends js.Object {
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[typings.three.materialMod.Material]): Object3D
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit
}

object TypeofSceneUtils {
  @scala.inline
  def apply(
    attach: (Object3D, Scene, Object3D) => Unit,
    createMultiMaterialObject: (Geometry, js.Array[typings.three.materialMod.Material]) => Object3D,
    detach: (Object3D, Object3D, Scene) => Unit
  ): TypeofSceneUtils = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), createMultiMaterialObject = js.Any.fromFunction2(createMultiMaterialObject), detach = js.Any.fromFunction3(detach))
    __obj.asInstanceOf[TypeofSceneUtils]
  }
}

