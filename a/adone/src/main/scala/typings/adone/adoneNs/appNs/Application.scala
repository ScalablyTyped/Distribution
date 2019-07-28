package typings.adone.adoneNs.appNs

import typings.adone.adoneNs.appNs.INs.ReportOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app.Application")
@js.native
class Application () extends Subsystem {
  val isMain: Boolean = js.native
  def _rejectionHandled(p: js.Promise[_]): Unit = js.native
  def _signalExit(sigName: String): Unit = js.native
  def _uncaughtException(err: js.Any): Unit = js.native
  def _unhandledRejection(reson: js.Any, p: js.Promise[_]): Unit = js.native
  def enableReport(): Unit = js.native
  def enableReport(opts: ReportOptions): Unit = js.native
  def exit(): js.Promise[Unit] = js.native
  def exit(code: Double): js.Promise[Unit] = js.native
  def exitOnSignal(names: String*): Unit = js.native
  def main(): Unit = js.native
  def removeProcesshandlers(): Unit = js.native
  def reportEnabled(): Boolean = js.native
  def run(): js.Promise[Unit] = js.native
}

