package typings.androiduix.android.text.style

import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
abstract class MetricAffectingSpan ()
  extends CharacterStyle
     with UpdateAppearance {
  def updateMeasureState(p: TextPaint): Unit = js.native
}

/* static members */
@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
object MetricAffectingSpan extends js.Object {
  @js.native
  class Passthrough_MetricAffectingSpan protected () extends MetricAffectingSpan {
    def this(cs: MetricAffectingSpan) = this()
    var mStyle: js.Any = js.native
  }
  
  var `type`: js.Symbol = js.native
}

