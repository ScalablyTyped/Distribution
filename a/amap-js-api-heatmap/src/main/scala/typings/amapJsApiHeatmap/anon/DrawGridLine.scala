package typings.amapJsApiHeatmap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawGridLine extends js.Object {
  
  var drawGridLine: js.UndefOr[Boolean] = js.native
  
  var gridSize: js.UndefOr[Double] = js.native
  
  var heightBezier: js.UndefOr[js.Array[Double]] = js.native
  
  var heightScale: js.UndefOr[Double] = js.native
}
object DrawGridLine {
  
  @scala.inline
  def apply(): DrawGridLine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawGridLine]
  }
  
  @scala.inline
  implicit class DrawGridLineOps[Self <: DrawGridLine] (val x: Self) extends AnyVal {
    
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
    def setDrawGridLine(value: Boolean): Self = this.set("drawGridLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawGridLine: Self = this.set("drawGridLine", js.undefined)
    
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    
    @scala.inline
    def setHeightBezierVarargs(value: Double*): Self = this.set("heightBezier", js.Array(value :_*))
    
    @scala.inline
    def setHeightBezier(value: js.Array[Double]): Self = this.set("heightBezier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightBezier: Self = this.set("heightBezier", js.undefined)
    
    @scala.inline
    def setHeightScale(value: Double): Self = this.set("heightScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeightScale: Self = this.set("heightScale", js.undefined)
  }
}
