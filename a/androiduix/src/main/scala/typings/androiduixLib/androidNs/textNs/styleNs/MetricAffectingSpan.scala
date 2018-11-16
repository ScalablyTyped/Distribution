package typings
package androiduixLib.androidNs.textNs.styleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
abstract class MetricAffectingSpan ()
  extends CharacterStyle
     with UpdateLayout {
  def updateMeasureState(p: androiduixLib.androidNs.textNs.TextPaint): scala.Unit = js.native
}

@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
object MetricAffectingSpan extends js.Object {
  var `type`: js.Symbol = js.native
}

