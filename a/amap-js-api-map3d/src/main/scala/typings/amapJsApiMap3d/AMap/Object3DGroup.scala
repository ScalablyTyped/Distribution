package typings.amapJsApiMap3d.AMap

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object3DGroup[C /* <: Object3D */]
  extends StObject
     with Object3D {
  
  def add(object3d: C): Unit
  
  var children: js.Array[C]
  
  def remove(object3d: C): Unit
}
object Object3DGroup {
  
  inline def apply[C /* <: Object3D */](
    DEPTH_TEST: Boolean,
    add: C => Unit,
    children: js.Array[C],
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    remove: C => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3DGroup[C] = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), children = children.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3DGroup[C]]
  }
  
  extension [Self <: Object3DGroup[?], C /* <: Object3D */](x: Self & Object3DGroup[C]) {
    
    inline def setAdd(value: C => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setChildren(value: js.Array[C]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: C*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setRemove(value: C => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
