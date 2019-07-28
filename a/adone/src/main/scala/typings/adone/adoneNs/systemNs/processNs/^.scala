package typings.adone.adoneNs.systemNs.processNs

import typings.adone.adoneNs.systemNs.processNs.INs.ExecChildProcess
import typings.adone.adoneNs.systemNs.processNs.INs.ExecOptions
import typings.adone.adoneNs.systemNs.processNs.INs.ExecReturns
import typings.adone.adoneNs.systemNs.processNs.INs.ExecSyncOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.system.process")
@js.native
object ^ extends js.Object {
  def errname(code: Double): String = js.native
  def errnameFallback(uv: js.Object, code: Double): String = js.native
  def exec(cmd: String): ExecChildProcess = js.native
  def exec(cmd: String, args: js.Array[String]): ExecChildProcess = js.native
  def exec(cmd: String, args: js.Array[String], opts: ExecOptions): ExecChildProcess = js.native
  def exec(cmd: String, opts: ExecOptions): ExecChildProcess = js.native
  def execStderr(cmd: String): js.Promise[String] = js.native
  def execStderr(cmd: String, args: js.Array[String]): js.Promise[String] = js.native
  def execStderr(cmd: String, args: js.Array[String], opts: ExecOptions): js.Promise[String] = js.native
  def execStderr(cmd: String, opts: ExecOptions): js.Promise[String] = js.native
  def execStdout(cmd: String): js.Promise[String] = js.native
  def execStdout(cmd: String, args: js.Array[String]): js.Promise[String] = js.native
  def execStdout(cmd: String, args: js.Array[String], opts: ExecOptions): js.Promise[String] = js.native
  def execStdout(cmd: String, opts: ExecOptions): js.Promise[String] = js.native
  def execSync(cmd: String): ExecReturns = js.native
  def execSync(cmd: String, args: js.Array[String]): ExecReturns = js.native
  def execSync(cmd: String, args: js.Array[String], opts: ExecSyncOptions): ExecReturns = js.native
  def shell(cmd: String): ExecChildProcess = js.native
  def shell(cmd: String, opts: ExecOptions): ExecChildProcess = js.native
  def shellSync(cmd: String): ExecReturns = js.native
  def shellSync(cmd: String, opts: ExecSyncOptions): ExecReturns = js.native
  def stdio(opts: js.Object): js.Array[_] = js.native
}

