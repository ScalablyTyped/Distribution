package typings.androiduix.androidNs.textNs.styleNs

import typings.androiduix.androidNs.textNs.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
abstract class MetricAffectingSpan ()
  extends CharacterStyle
     with UpdateLayout {
  def updateMeasureState(p: TextPaint): Unit = js.native
}

/* static members */
@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
object MetricAffectingSpan extends js.Object {
  var `type`: js.Symbol = js.native
}

