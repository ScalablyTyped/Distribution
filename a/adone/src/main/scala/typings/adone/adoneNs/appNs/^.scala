package typings.adone.adoneNs.appNs

import typings.adone.adoneNs.appNs.INs.ApplicationInfo
import typings.adone.adoneNs.appNs.INs.CommandInfo
import typings.adone.adoneNs.appNs.INs.MainCommandInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app")
@js.native
object ^ extends js.Object {
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

