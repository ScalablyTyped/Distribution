package typings
package androiduixLib.androidNs.viewNs.ViewNs.AttachInfoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.AttachInfo.InvalidateInfo")
@js.native
class InvalidateInfo () extends js.Object {
  var bottom: scala.Double = js.native
  var left: scala.Double = js.native
  var right: scala.Double = js.native
  var target: androiduixLib.androidNs.viewNs.View = js.native
  var top: scala.Double = js.native
  def recycle(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.view.View.AttachInfo.InvalidateInfo")
@js.native
object InvalidateInfo extends js.Object {
  var POOL_LIMIT: js.Any = js.native
  var sPool: js.Any = js.native
  def obtain(): androiduixLib.androidNs.viewNs.ViewNs.AttachInfoNs.InvalidateInfo = js.native
}

