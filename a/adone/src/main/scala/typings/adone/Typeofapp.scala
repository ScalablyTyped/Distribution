package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.appNs.Application
import typings.adone.adoneNs.appNs.CliApplication
import typings.adone.adoneNs.appNs.INs.ApplicationInfo
import typings.adone.adoneNs.appNs.INs.CommandInfo
import typings.adone.adoneNs.appNs.INs.MainCommandInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofapp extends js.Object {
  var Application: Instantiable0[typings.adone.adoneNs.appNs.Application] = js.native
  var CliApplication: Instantiable0[typings.adone.adoneNs.appNs.CliApplication] = js.native
  val INs: js.Any = js.native
  var Subsystem: Instantiable1[js.UndefOr[/* options */ Anon_Name], typings.adone.adoneNs.appNs.Subsystem] = js.native
  def DApplication(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DApplication(info: ApplicationInfo): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DCliCommand(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DCliCommand(info: CommandInfo): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DMainCliCommand(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DMainCliCommand(info: MainCommandInfo): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DSubsystem(): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def DSubsystem(info: ApplicationInfo): js.Function1[/* repeated */ js.Any, Unit] = js.native
  def run(app: Application): js.Promise[Unit] = js.native
  def run(app: Application, ignoreArgs: Boolean): js.Promise[Unit] = js.native
  def runCli(app: CliApplication): js.Promise[Unit] = js.native
  def runCli(app: CliApplication, ignoreArgs: Boolean): js.Promise[Unit] = js.native
}

