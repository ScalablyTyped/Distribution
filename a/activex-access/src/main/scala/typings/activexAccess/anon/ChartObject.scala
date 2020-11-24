package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartObject extends js.Object {
  
  val chartObject: js.Any = js.native
  
  val drawObject: js.Any = js.native
}
object ChartObject {
  
  @scala.inline
  def apply(chartObject: js.Any, drawObject: js.Any): ChartObject = {
    val __obj = js.Dynamic.literal(chartObject = chartObject.asInstanceOf[js.Any], drawObject = drawObject.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartObject]
  }
  
  @scala.inline
  implicit class ChartObjectOps[Self <: ChartObject] (val x: Self) extends AnyVal {
    
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
    def setChartObject(value: js.Any): Self = this.set("chartObject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDrawObject(value: js.Any): Self = this.set("drawObject", value.asInstanceOf[js.Any])
  }
}
