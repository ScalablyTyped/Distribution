package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICanvasTextMetrics extends js.Object {
  @JSName("MSHTML.ICanvasTextMetrics_typekey")
  var MSHTMLDotICanvasTextMetrics_typekey: ICanvasTextMetrics = js.native
  val width: Double = js.native
}

object ICanvasTextMetrics {
  @scala.inline
  def apply(MSHTMLDotICanvasTextMetrics_typekey: ICanvasTextMetrics, width: Double): ICanvasTextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasTextMetrics_typekey")(MSHTMLDotICanvasTextMetrics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasTextMetrics]
  }
  @scala.inline
  implicit class ICanvasTextMetricsOps[Self <: ICanvasTextMetrics] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotICanvasTextMetrics_typekey(value: ICanvasTextMetrics): Self = this.set("MSHTML.ICanvasTextMetrics_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

