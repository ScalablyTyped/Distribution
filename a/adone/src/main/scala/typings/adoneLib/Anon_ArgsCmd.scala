package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsCmd extends js.Object {
  val INs: js.Any = js.native
  def errname(code: scala.Double): java.lang.String = js.native
  def errnameFallback(uv: js.Object, code: scala.Double): java.lang.String = js.native
  def exec(cmd: java.lang.String): adoneLib.adoneNs.systemNs.processNs.INs.ExecChildProcess = js.native
  def exec(cmd: java.lang.String, args: js.Array[java.lang.String]): adoneLib.adoneNs.systemNs.processNs.INs.ExecChildProcess = js.native
  def exec(
    cmd: java.lang.String,
    args: js.Array[java.lang.String],
    opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions
  ): adoneLib.adoneNs.systemNs.processNs.INs.ExecChildProcess = js.native
  def exec(cmd: java.lang.String, opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions): adoneLib.adoneNs.systemNs.processNs.INs.ExecChildProcess = js.native
  def execStderr(cmd: java.lang.String): js.Promise[java.lang.String] = js.native
  def execStderr(cmd: java.lang.String, args: js.Array[java.lang.String]): js.Promise[java.lang.String] = js.native
  def execStderr(
    cmd: java.lang.String,
    args: js.Array[java.lang.String],
    opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions
  ): js.Promise[java.lang.String] = js.native
  def execStderr(cmd: java.lang.String, opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions): js.Promise[java.lang.String] = js.native
  def execStdout(cmd: java.lang.String): js.Promise[java.lang.String] = js.native
  def execStdout(cmd: java.lang.String, args: js.Array[java.lang.String]): js.Promise[java.lang.String] = js.native
  def execStdout(
    cmd: java.lang.String,
    args: js.Array[java.lang.String],
    opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions
  ): js.Promise[java.lang.String] = js.native
  def execStdout(cmd: java.lang.String, opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions): js.Promise[java.lang.String] = js.native
  def execSync(cmd: java.lang.String): adoneLib.adoneNs.systemNs.processNs.INs.ExecReturns = js.native
  def execSync(cmd: java.lang.String, args: js.Array[java.lang.String]): adoneLib.adoneNs.systemNs.processNs.INs.ExecReturns = js.native
  def execSync(
    cmd: java.lang.String,
    args: js.Array[java.lang.String],
    opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecSyncOptions
  ): adoneLib.adoneNs.systemNs.processNs.INs.ExecReturns = js.native
  def shell(cmd: java.lang.String): adoneLib.adoneNs.systemNs.processNs.INs.ExecChildProcess = js.native
  def shell(cmd: java.lang.String, opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecOptions): adoneLib.adoneNs.systemNs.processNs.INs.ExecChildProcess = js.native
  def shellSync(cmd: java.lang.String): adoneLib.adoneNs.systemNs.processNs.INs.ExecReturns = js.native
  def shellSync(cmd: java.lang.String, opts: adoneLib.adoneNs.systemNs.processNs.INs.ExecSyncOptions): adoneLib.adoneNs.systemNs.processNs.INs.ExecReturns = js.native
  def stdio(opts: js.Object): js.Array[_] = js.native
}

