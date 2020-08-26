package typings.androiduix.android.text.style

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplacementSpan extends MetricAffectingSpan {
  def draw(
    canvas: Canvas,
    text: String,
    start: Double,
    end: Double,
    x: Double,
    top: Double,
    y: Double,
    bottom: Double,
    paint: Paint
  ): Unit = js.native
  def getSize(paint: Paint, text: String, start: Double, end: Double, fm: FontMetricsInt): Double = js.native
}

object ReplacementSpan {
  @scala.inline
  def apply(
    draw: (Canvas, String, Double, Double, Double, Double, Double, Double, Paint) => Unit,
    getSize: (Paint, String, Double, Double, FontMetricsInt) => Double,
    getUnderlying: () => CharacterStyle,
    mType: js.Symbol,
    updateDrawState: TextPaint => Unit,
    updateMeasureState: TextPaint => Unit
  ): ReplacementSpan = {
    val __obj = js.Dynamic.literal(draw = js.Any.fromFunction9(draw), getSize = js.Any.fromFunction5(getSize), getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
    __obj.asInstanceOf[ReplacementSpan]
  }
  @scala.inline
  implicit class ReplacementSpanOps[Self <: ReplacementSpan] (val x: Self) extends AnyVal {
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
    def setDraw(value: (Canvas, String, Double, Double, Double, Double, Double, Double, Paint) => Unit): Self = this.set("draw", js.Any.fromFunction9(value))
    @scala.inline
    def setGetSize(value: (Paint, String, Double, Double, FontMetricsInt) => Double): Self = this.set("getSize", js.Any.fromFunction5(value))
  }
  
}

