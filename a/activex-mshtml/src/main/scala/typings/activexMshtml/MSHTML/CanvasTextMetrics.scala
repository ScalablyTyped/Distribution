package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasTextMetrics extends js.Object {
  @JSName("MSHTML.CanvasTextMetrics_typekey")
  var MSHTMLDotCanvasTextMetrics_typekey: CanvasTextMetrics
  val width: Double
}

object CanvasTextMetrics {
  @scala.inline
  def apply(MSHTMLDotCanvasTextMetrics_typekey: CanvasTextMetrics, width: Double): CanvasTextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.CanvasTextMetrics_typekey")(MSHTMLDotCanvasTextMetrics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasTextMetrics]
  }
}

