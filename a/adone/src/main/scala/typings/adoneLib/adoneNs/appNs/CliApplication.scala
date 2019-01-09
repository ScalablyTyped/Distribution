package typings
package adoneLib.adoneNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app.CliApplication")
@js.native
class CliApplication () extends Application {
  val mainCommand: adoneLib.adoneNs.appNs.INs.Command = js.native
  def defineArguments(schema: adoneLib.adoneNs.appNs.INs.MainCommandInfo): this.type = js.native
  def defineCommand(schema: adoneLib.adoneNs.appNs.INs.CommandInfo): adoneLib.adoneNs.appNs.INs.Command = js.native
  def defineCommandFromSubsystem(): scala.Unit = js.native
  def defineCommandFromSubsystem(options: adoneLib.adoneNs.appNs.INs.DefineCommandFromSubsystemOptions): scala.Unit = js.native
  def defineCommandsGroup(schema: adoneLib.adoneNs.appNs.INs.Group): scala.Unit = js.native
  def defineMainCommand(schema: adoneLib.adoneNs.appNs.INs.MainCommandInfo): this.type = js.native
  def defineOption(schema: adoneLib.adoneNs.appNs.INs.ArgumentInfo): scala.Unit = js.native
  def defineOptionsGroup(schema: adoneLib.adoneNs.appNs.INs.Group): scala.Unit = js.native
  def exposeCliInterface(): scala.Unit = js.native
  def exposeCliInterface(ctxId: java.lang.String): scala.Unit = js.native
  def getVersion(): js.Promise[js.UndefOr[java.lang.String]] = js.native
  def option(path: java.lang.String): js.Any = js.native
  def option(path: java.lang.String, options: adoneLib.Anon_Value): js.Any = js.native
  def run(options: adoneLib.Anon_IgnoreArgs): js.Promise[scala.Unit] = js.native
}

