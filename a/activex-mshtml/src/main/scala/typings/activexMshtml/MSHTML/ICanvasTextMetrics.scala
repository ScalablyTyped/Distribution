package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICanvasTextMetrics extends js.Object {
  @JSName("MSHTML.ICanvasTextMetrics_typekey")
  var MSHTMLDotICanvasTextMetrics_typekey: ICanvasTextMetrics
  val width: Double
}

object ICanvasTextMetrics {
  @scala.inline
  def apply(MSHTMLDotICanvasTextMetrics_typekey: ICanvasTextMetrics, width: Double): ICanvasTextMetrics = {
    val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ICanvasTextMetrics_typekey")(MSHTMLDotICanvasTextMetrics_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasTextMetrics]
  }
}

