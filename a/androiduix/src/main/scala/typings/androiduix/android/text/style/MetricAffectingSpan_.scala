package typings.androiduix.android.text.style

import typings.androiduix.android.text.TextPaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.MetricAffectingSpan")
@js.native
abstract class MetricAffectingSpan_ ()
  extends CharacterStyle
     with UpdateAppearance {
  /* InferMemberOverrides */
  override def getUnderlying(): CharacterStyle = js.native
  /* InferMemberOverrides */
  override def updateDrawState(tp: TextPaint): Unit = js.native
  def updateMeasureState(p: TextPaint): Unit = js.native
}

