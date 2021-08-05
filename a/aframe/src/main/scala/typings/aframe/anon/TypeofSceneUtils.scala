package typings.aframe.anon

import typings.three.geometryMod.Geometry
import typings.three.object3DMod.Object3D
import typings.three.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofSceneUtils extends StObject {
  
  def attach(child: Object3D, scene: Scene, parent: Object3D): Unit
  
  def createMultiMaterialObject(geometry: Geometry, materials: js.Array[typings.three.materialMod.Material]): Object3D
  
  def detach(child: Object3D, parent: Object3D, scene: Scene): Unit
}
object TypeofSceneUtils {
  
  inline def apply(
    attach: (Object3D, Scene, Object3D) => Unit,
    createMultiMaterialObject: (Geometry, js.Array[typings.three.materialMod.Material]) => Object3D,
    detach: (Object3D, Object3D, Scene) => Unit
  ): TypeofSceneUtils = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction3(attach), createMultiMaterialObject = js.Any.fromFunction2(createMultiMaterialObject), detach = js.Any.fromFunction3(detach))
    __obj.asInstanceOf[TypeofSceneUtils]
  }
  
  extension [Self <: TypeofSceneUtils](x: Self) {
    
    inline def setAttach(value: (Object3D, Scene, Object3D) => Unit): Self = StObject.set(x, "attach", js.Any.fromFunction3(value))
    
    inline def setCreateMultiMaterialObject(value: (Geometry, js.Array[typings.three.materialMod.Material]) => Object3D): Self = StObject.set(x, "createMultiMaterialObject", js.Any.fromFunction2(value))
    
    inline def setDetach(value: (Object3D, Object3D, Scene) => Unit): Self = StObject.set(x, "detach", js.Any.fromFunction3(value))
  }
}
