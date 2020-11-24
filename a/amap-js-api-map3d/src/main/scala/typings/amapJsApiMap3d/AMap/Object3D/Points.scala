package typings.amapJsApiMap3d.AMap.Object3D

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Points
  extends typings.amapJsApiMap3d.AMap.Object3D {
  
  var borderColor: String = js.native
  
  var borderWeight: Double = js.native
  
  @JSName("geometry")
  val geometry_Points: typings.amapJsApiMap3d.AMap.Geometry3D.Points = js.native
}
object Points {
  
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    borderColor: String,
    borderWeight: Double,
    geometry: typings.amapJsApiMap3d.AMap.Geometry3D.Points,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Points = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWeight = borderWeight.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
  
  @scala.inline
  implicit class PointsOps[Self <: Points] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderWeight(value: Double): Self = this.set("borderWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: typings.amapJsApiMap3d.AMap.Geometry3D.Points): Self = this.set("geometry", value.asInstanceOf[js.Any])
  }
}
