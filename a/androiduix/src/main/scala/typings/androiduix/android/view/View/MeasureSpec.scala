package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.MeasureSpec")
@js.native
class MeasureSpec () extends js.Object

/* static members */
@JSGlobal("android.view.View.MeasureSpec")
@js.native
object MeasureSpec extends js.Object {
  var AT_MOST: Double = js.native
  var EXACTLY: Double = js.native
  var MODE_MASK: Double = js.native
  var MODE_SHIFT: Double = js.native
  var UNSPECIFIED: Double = js.native
  def adjust(measureSpec: js.Any, delta: js.Any): Double = js.native
  def getMode(measureSpec: js.Any): Double = js.native
  def getSize(measureSpec: js.Any): Double = js.native
  def makeMeasureSpec(size: js.Any, mode: js.Any): Double = js.native
  def toString(measureSpec: js.Any): String = js.native
}

