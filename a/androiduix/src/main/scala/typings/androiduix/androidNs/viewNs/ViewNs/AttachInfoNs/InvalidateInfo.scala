package typings.androiduix.androidNs.viewNs.ViewNs.AttachInfoNs

import typings.androiduix.androidNs.viewNs.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.View.AttachInfo.InvalidateInfo")
@js.native
class InvalidateInfo () extends js.Object {
  var bottom: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var target: View = js.native
  var top: Double = js.native
  def recycle(): Unit = js.native
}

/* static members */
@JSGlobal("android.view.View.AttachInfo.InvalidateInfo")
@js.native
object InvalidateInfo extends js.Object {
  var POOL_LIMIT: js.Any = js.native
  var sPool: js.Any = js.native
  def obtain(): InvalidateInfo = js.native
}

