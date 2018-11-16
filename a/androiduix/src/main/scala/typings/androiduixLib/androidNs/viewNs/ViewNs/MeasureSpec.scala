package typings
package androiduixLib.androidNs.viewNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.MeasureSpec")
@js.native
class MeasureSpec () extends js.Object

@JSGlobal("android.view.View.MeasureSpec")
@js.native
object MeasureSpec extends js.Object {
  var AT_MOST: scala.Double = js.native
  var EXACTLY: scala.Double = js.native
  var MODE_MASK: scala.Double = js.native
  var MODE_SHIFT: scala.Double = js.native
  var UNSPECIFIED: scala.Double = js.native
  def adjust(measureSpec: js.Any, delta: js.Any): scala.Double = js.native
  def getMode(measureSpec: js.Any): scala.Double = js.native
  def getSize(measureSpec: js.Any): scala.Double = js.native
  def makeMeasureSpec(size: js.Any, mode: js.Any): scala.Double = js.native
  def toString(measureSpec: js.Any): java.lang.String = js.native
}

