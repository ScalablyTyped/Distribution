package typings
package adoneLib.adoneNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app")
@js.native
object appNsMembers extends js.Object {
  def DApplication(): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DApplication(info: adoneLib.adoneNs.appNs.INs.ApplicationInfo): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DCliCommand(): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DCliCommand(info: adoneLib.adoneNs.appNs.INs.CommandInfo): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DMainCliCommand(): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DMainCliCommand(info: adoneLib.adoneNs.appNs.INs.MainCommandInfo): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DSubsystem(): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def DSubsystem(info: adoneLib.adoneNs.appNs.INs.ApplicationInfo): js.Function1[/* repeated */js.Any, scala.Unit] = js.native
  def run(app: Application): js.Promise[scala.Unit] = js.native
  def run(app: Application, ignoreArgs: scala.Boolean): js.Promise[scala.Unit] = js.native
  def runCli(app: CliApplication): js.Promise[scala.Unit] = js.native
  def runCli(app: CliApplication, ignoreArgs: scala.Boolean): js.Promise[scala.Unit] = js.native
}

