package typings.androiduix.androidNs.textNs.styleNs.LineHeightSpanNs

import typings.androiduix.androidNs.graphicsNs.PaintNs.FontMetricsInt
import typings.androiduix.androidNs.textNs.TextPaint
import typings.androiduix.androidNs.textNs.styleNs.LineHeightSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithDensity extends LineHeightSpan {
  def chooseHeight(
    text: String,
    start: Double,
    end: Double,
    spanstartv: Double,
    v: Double,
    fm: FontMetricsInt,
    paint: TextPaint
  ): Unit = js.native
}

