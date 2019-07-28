package typings.androiduix.androidNs.widgetNs.ProgressBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ProgressBar.RefreshData")
@js.native
class RefreshData () extends js.Object {
  var fromUser: Boolean = js.native
  var id: String = js.native
  var progress: Double = js.native
  def recycle(): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.ProgressBar.RefreshData")
@js.native
object RefreshData extends js.Object {
  var POOL_MAX: js.Any = js.native
  var sPool: js.Any = js.native
  def obtain(id: String, progress: Double, fromUser: Boolean): RefreshData = js.native
}

