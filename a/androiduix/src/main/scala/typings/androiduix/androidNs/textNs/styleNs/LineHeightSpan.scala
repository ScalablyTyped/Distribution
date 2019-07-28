package typings.androiduix.androidNs.textNs.styleNs

import typings.androiduix.androidNs.graphicsNs.PaintNs.FontMetricsInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineHeightSpan extends ParagraphStyle {
  def chooseHeight(text: String, start: Double, end: Double, spanstartv: Double, v: Double, fm: FontMetricsInt): Unit
}

object LineHeightSpan {
  @scala.inline
  def apply(chooseHeight: (String, Double, Double, Double, Double, FontMetricsInt) => Unit): LineHeightSpan = {
    val __obj = js.Dynamic.literal(chooseHeight = js.Any.fromFunction6(chooseHeight))
  
    __obj.asInstanceOf[LineHeightSpan]
  }
}

