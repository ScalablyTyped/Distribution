package typings.androiduix.android.text.style

import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricAffectingSpan_
  extends CharacterStyle
     with UpdateAppearance {
  /* InferMemberOverrides */
  override def getUnderlying(): CharacterStyle = js.native
  /* InferMemberOverrides */
  override def updateDrawState(tp: TextPaint): Unit = js.native
  def updateMeasureState(p: TextPaint): Unit = js.native
}

object MetricAffectingSpan_ {
  @scala.inline
  def apply(
    getUnderlying: () => CharacterStyle,
    mType: js.Symbol,
    updateDrawState: TextPaint => Unit,
    updateMeasureState: TextPaint => Unit
  ): MetricAffectingSpan_ = {
    val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
    __obj.asInstanceOf[MetricAffectingSpan_]
  }
  @scala.inline
  implicit class MetricAffectingSpan_Ops[Self <: MetricAffectingSpan_] (val x: Self) extends AnyVal {
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
    def setGetUnderlying(value: () => CharacterStyle): Self = this.set("getUnderlying", js.Any.fromFunction0(value))
    @scala.inline
    def setUpdateDrawState(value: TextPaint => Unit): Self = this.set("updateDrawState", js.Any.fromFunction1(value))
    @scala.inline
    def setUpdateMeasureState(value: TextPaint => Unit): Self = this.set("updateMeasureState", js.Any.fromFunction1(value))
  }
  
}

