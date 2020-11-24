package typings.androiduix.android.text

import typings.androiduix.android.graphics.Paint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextPaint extends Paint {
  
  var baselineShift: Double = js.native
  
  var bgColor: Double = js.native
  
  var linkColor: Double = js.native
  
  def set(tp: TextPaint): Unit = js.native
  
  def setUnderlineText(color: Double, thickness: Double): Unit = js.native
  
  var underlineColor: Double = js.native
  
  var underlineThickness: Double = js.native
}
