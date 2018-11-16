package typings
package androiduixLib.androidNs.viewNs.ViewRootImplNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.ViewRootImpl.RunQueue")
@js.native
class RunQueue () extends js.Object {
  var mActions: js.Any = js.native
  def executeActions(handler: androiduixLib.androidNs.osNs.Handler): scala.Unit = js.native
  def post(action: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
  def postDelayed(action: androiduixLib.javaNs.langNs.Runnable, delayMillis: scala.Double): scala.Unit = js.native
  def removeCallbacks(action: androiduixLib.javaNs.langNs.Runnable): scala.Unit = js.native
}

