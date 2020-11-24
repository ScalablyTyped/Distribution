package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasTextMetrics extends js.Object {
  
  @JSName("MSHTML.CanvasTextMetrics_typekey")
  var MSHTMLDotCanvasTextMetrics_typekey: CanvasTextMetrics = js.native
  
  val width: Double = js.native
}
object CanvasTextMetrics {
  
  @scala.inline
  def apply(MSHTMLDotCanvasTextMetrics_typekey: CanvasTextMetrics, width: Double): CanvasTextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CanvasTextMetrics_typekey")(MSHTMLDotCanvasTextMetrics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextMetrics]
  }
  
  @scala.inline
  implicit class CanvasTextMetricsOps[Self <: CanvasTextMetrics] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotCanvasTextMetrics_typekey(value: CanvasTextMetrics): Self = this.set("MSHTML.CanvasTextMetrics_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
}
