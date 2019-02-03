package typings
package androiduixLib.androidNs.widgetNs.ProgressBarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.ProgressBar.RefreshData")
@js.native
class RefreshData () extends js.Object {
  var fromUser: scala.Boolean = js.native
  var id: java.lang.String = js.native
  var progress: scala.Double = js.native
  def recycle(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.ProgressBar.RefreshData")
@js.native
object RefreshData extends js.Object {
  var POOL_MAX: js.Any = js.native
  var sPool: js.Any = js.native
  def obtain(id: java.lang.String, progress: scala.Double, fromUser: scala.Boolean): androiduixLib.androidNs.widgetNs.ProgressBarNs.RefreshData = js.native
}

