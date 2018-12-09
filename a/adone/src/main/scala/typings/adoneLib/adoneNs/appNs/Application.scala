package typings
package adoneLib.adoneNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app.Application")
@js.native
class Application () extends Subsystem {
  val isMain: scala.Boolean = js.native
  def _rejectionHandled(p: js.Promise[_]): scala.Unit = js.native
  def _signalExit(sigName: java.lang.String): scala.Unit = js.native
  def _uncaughtException(err: js.Any): scala.Unit = js.native
  def _unhandledRejection(reson: js.Any, p: js.Promise[_]): scala.Unit = js.native
  def enableReport(): scala.Unit = js.native
  def enableReport(opts: adoneLib.adoneNs.appNs.INs.ReportOptions): scala.Unit = js.native
  def exit(): js.Promise[scala.Unit] = js.native
  def exit(code: scala.Double): js.Promise[scala.Unit] = js.native
  def exitOnSignal(names: java.lang.String*): scala.Unit = js.native
  def main(): scala.Unit = js.native
  def removeProcesshandlers(): scala.Unit = js.native
  def reportEnabled(): scala.Boolean = js.native
  def run(): js.Promise[scala.Unit] = js.native
}

