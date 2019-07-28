package typings.androiduix.androidNs.textNs

import typings.androiduix.androidNs.graphicsNs.Paint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextPaint")
@js.native
class TextPaint () extends Paint {
  var baselineShift: Double = js.native
  var bgColor: Double = js.native
  var linkColor: Double = js.native
  var underlineColor: Double = js.native
  var underlineThickness: Double = js.native
  def set(tp: TextPaint): Unit = js.native
  def setUnderlineText(color: Double, thickness: Double): Unit = js.native
}

