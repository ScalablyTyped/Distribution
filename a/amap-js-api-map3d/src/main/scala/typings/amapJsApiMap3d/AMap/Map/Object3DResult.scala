package typings.amapJsApiMap3d.AMap.Map

import typings.amapJsApiMap3d.AMap.Object3D
import typings.amapJsApiMap3d.AMap.Vector3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Object3DResult extends js.Object {
  
  var distance: Double = js.native
  
  var index: Double = js.native
  
  var `object`: Object3D = js.native
  
  var point: Vector3 = js.native
}
object Object3DResult {
  
  @scala.inline
  def apply(distance: Double, index: Double, `object`: Object3D, point: Vector3): Object3DResult = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3DResult]
  }
  
  @scala.inline
  implicit class Object3DResultOps[Self <: Object3DResult] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: Object3D): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoint(value: Vector3): Self = this.set("point", value.asInstanceOf[js.Any])
  }
}
