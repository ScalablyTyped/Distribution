package typings.amapJsApiMap3d.AMap

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object3DGroup[C /* <: Object3D */] extends Object3D {
  
  def add(object3d: C): Unit = js.native
  
  var children: js.Array[C] = js.native
  
  def remove(object3d: C): Unit = js.native
}
object Object3DGroup {
  
  @scala.inline
  def apply[C /* <: Object3D */](
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
  
  @scala.inline
  implicit class Object3DGroupOps[Self <: Object3DGroup[_], C /* <: Object3D */] (val x: Self with Object3DGroup[C]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: C => Unit): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildrenVarargs(value: C*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[C]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: C => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
}
