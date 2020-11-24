package typings.androiduix.android.text.style.MetricAffectingSpan

import typings.androiduix.android.text.TextPaint
import typings.androiduix.android.text.style.CharacterStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PassthroughMetricAffectingSpan
  extends typings.androiduix.android.text.style.MetricAffectingSpan {
  
  var mStyle: js.Any = js.native
}
object PassthroughMetricAffectingSpan {
  
  @scala.inline
  def apply(
    getUnderlying: () => CharacterStyle,
    mStyle: js.Any,
    mType: js.Symbol,
    updateDrawState: TextPaint => Unit,
    updateMeasureState: TextPaint => Unit
  ): PassthroughMetricAffectingSpan = {
    val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mStyle = mStyle.asInstanceOf[js.Any], mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
    __obj.asInstanceOf[PassthroughMetricAffectingSpan]
  }
  
  @scala.inline
  implicit class PassthroughMetricAffectingSpanOps[Self <: PassthroughMetricAffectingSpan] (val x: Self) extends AnyVal {
    
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
    def setMStyle(value: js.Any): Self = this.set("mStyle", value.asInstanceOf[js.Any])
  }
}
