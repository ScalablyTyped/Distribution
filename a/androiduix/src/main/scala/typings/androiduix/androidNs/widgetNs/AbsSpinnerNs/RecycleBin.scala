package typings.androiduix.androidNs.widgetNs.AbsSpinnerNs

import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.AbsSpinner
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.AbsSpinner.RecycleBin")
@js.native
class RecycleBin protected () extends js.Object {
  def this(arg: AbsSpinner) = this()
  var _AbsSpinner_this: AbsSpinner = js.native
  var mScrapHeap: js.Any = js.native
  def clear(): Unit = js.native
  def get(position: Double): View = js.native
  def put(position: Double, v: View): Unit = js.native
}

