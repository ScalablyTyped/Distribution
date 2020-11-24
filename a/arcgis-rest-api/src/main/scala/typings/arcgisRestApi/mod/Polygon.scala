package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon
  extends HasZM
     with Geometry {
  
  var rings: js.Array[js.Array[Position]] = js.native
}
object Polygon {
  
  @scala.inline
  def apply(rings: js.Array[js.Array[Position]]): Polygon = {
    val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    
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
    def setRingsVarargs(value: js.Array[Position]*): Self = this.set("rings", js.Array(value :_*))
    
    @scala.inline
    def setRings(value: js.Array[js.Array[Position]]): Self = this.set("rings", value.asInstanceOf[js.Any])
  }
}
