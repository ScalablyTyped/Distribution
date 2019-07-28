package typings.androiduix.androidNs.viewNs.ViewRootImplNs

import typings.androiduix.androidNs.osNs.Handler
import typings.androiduix.javaNs.langNs.Runnable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewRootImpl.RunQueue")
@js.native
class RunQueue () extends js.Object {
  var mActions: js.Any = js.native
  def executeActions(handler: Handler): Unit = js.native
  def post(action: Runnable): Unit = js.native
  def postDelayed(action: Runnable, delayMillis: Double): Unit = js.native
  def removeCallbacks(action: Runnable): Unit = js.native
}

