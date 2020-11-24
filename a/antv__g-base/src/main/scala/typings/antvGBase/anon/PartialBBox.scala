package typings.antvGBase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@antv/g-base.@antv/g-base/lib/types.BBox> */
@js.native
trait PartialBBox extends js.Object {
  
  var height: js.UndefOr[Double] = js.native
  
  var maxX: js.UndefOr[Double] = js.native
  
  var maxY: js.UndefOr[Double] = js.native
  
  var minX: js.UndefOr[Double] = js.native
  
  var minY: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object PartialBBox {
  
  @scala.inline
  def apply(): PartialBBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBBox]
  }
  
  @scala.inline
  implicit class PartialBBoxOps[Self <: PartialBBox] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setMaxX(value: Double): Self = this.set("maxX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxX: Self = this.set("maxX", js.undefined)
    
    @scala.inline
    def setMaxY(value: Double): Self = this.set("maxY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxY: Self = this.set("maxY", js.undefined)
    
    @scala.inline
    def setMinX(value: Double): Self = this.set("minX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinX: Self = this.set("minX", js.undefined)
    
    @scala.inline
    def setMinY(value: Double): Self = this.set("minY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinY: Self = this.set("minY", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}
