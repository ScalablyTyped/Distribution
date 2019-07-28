package typings.adone.adoneNs.appNs

import typings.adone.Anon_IgnoreArgs
import typings.adone.Anon_Value
import typings.adone.adoneNs.appNs.INs.ArgumentInfo
import typings.adone.adoneNs.appNs.INs.Command
import typings.adone.adoneNs.appNs.INs.CommandInfo
import typings.adone.adoneNs.appNs.INs.DefineCommandFromSubsystemOptions
import typings.adone.adoneNs.appNs.INs.Group
import typings.adone.adoneNs.appNs.INs.MainCommandInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.app.CliApplication")
@js.native
class CliApplication () extends Application {
  val mainCommand: Command = js.native
  def defineArguments(schema: MainCommandInfo): this.type = js.native
  def defineCommand(schema: CommandInfo): Command = js.native
  def defineCommandFromSubsystem(): Unit = js.native
  def defineCommandFromSubsystem(options: DefineCommandFromSubsystemOptions): Unit = js.native
  def defineCommandsGroup(schema: Group): Unit = js.native
  def defineMainCommand(schema: MainCommandInfo): this.type = js.native
  def defineOption(schema: ArgumentInfo): Unit = js.native
  def defineOptionsGroup(schema: Group): Unit = js.native
  def exposeCliInterface(): Unit = js.native
  def exposeCliInterface(ctxId: String): Unit = js.native
  def getVersion(): js.Promise[js.UndefOr[String]] = js.native
  def option(path: String): js.Any = js.native
  def option(path: String, options: Anon_Value): js.Any = js.native
  def run(options: Anon_IgnoreArgs): js.Promise[Unit] = js.native
}

