package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofapp extends js.Object {
  var Application: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.appNs.Application] = js.native
  var CliApplication: org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.appNs.CliApplication] = js.native
  val INs: js.Any = js.native
  var Subsystem: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* options */ Anon_Name], adoneLib.adoneNs.appNs.Subsystem] = js.native
  def DApplication(): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DApplication(info: adoneLib.adoneNs.appNs.INs.ApplicationInfo): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DCliCommand(): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DCliCommand(info: adoneLib.adoneNs.appNs.INs.CommandInfo): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DMainCliCommand(): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DMainCliCommand(info: adoneLib.adoneNs.appNs.INs.MainCommandInfo): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DSubsystem(): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def DSubsystem(info: adoneLib.adoneNs.appNs.INs.ApplicationInfo): js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  def run(app: adoneLib.adoneNs.appNs.Application): js.Promise[scala.Unit] = js.native
  def run(app: adoneLib.adoneNs.appNs.Application, ignoreArgs: scala.Boolean): js.Promise[scala.Unit] = js.native
  def runCli(app: adoneLib.adoneNs.appNs.CliApplication): js.Promise[scala.Unit] = js.native
  def runCli(app: adoneLib.adoneNs.appNs.CliApplication, ignoreArgs: scala.Boolean): js.Promise[scala.Unit] = js.native
}

