package typings.amapJsApiMap3d.AMap

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object3D_ extends js.Object {
  
  var DEPTH_TEST: Boolean = js.native
  
  val geometry: Geometry3D = js.native
  
  var needUpdate: Boolean = js.native
  
  def reDraw(): Unit = js.native
  
  // internal
  def reset(): Unit = js.native
  
  var textures: js.Array[String | HTMLCanvasElement] = js.native
  
  var transparent: Boolean = js.native
}
object Object3D_ {
  
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3D_ = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3D_]
  }
  
  @scala.inline
  implicit class Object3D_Ops[Self <: Object3D_] (val x: Self) extends AnyVal {
    
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
    def setDEPTH_TEST(value: Boolean): Self = this.set("DEPTH_TEST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: Geometry3D): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedUpdate(value: Boolean): Self = this.set("needUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReDraw(value: () => Unit): Self = this.set("reDraw", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTexturesVarargs(value: (String | HTMLCanvasElement)*): Self = this.set("textures", js.Array(value :_*))
    
    @scala.inline
    def setTextures(value: js.Array[String | HTMLCanvasElement]): Self = this.set("textures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
  }
}
