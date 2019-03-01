package typings
package adoneLib.adoneNs.systemNs.processNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecSyncOptions extends ExecCommonOptions {
  /**
    * Write some input to the `stdin` of your binary.
    * Streams are not allowed when using the synchronous methods.
    */
  var input: js.UndefOr[java.lang.String | nodeLib.Buffer] = js.undefined
}

object ExecSyncOptions {
  @scala.inline
  def apply(
    argv0: java.lang.String = null,
    cleanup: js.UndefOr[scala.Boolean] = js.undefined,
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    env: nodeLib.NodeJSNs.ProcessEnv = null,
    extendEnv: js.UndefOr[scala.Boolean] = js.undefined,
    gid: scala.Int | scala.Double = null,
    input: java.lang.String | nodeLib.Buffer = null,
    killSignal: java.lang.String | scala.Double = null,
    localDir: java.lang.String = null,
    maxBuffer: scala.Int | scala.Double = null,
    preferLocal: js.UndefOr[scala.Boolean] = js.undefined,
    reject: js.UndefOr[scala.Boolean] = js.undefined,
    shell: scala.Boolean | java.lang.String = null,
    stderr: StdIOOption = null,
    stdin: StdIOOption = null,
    stdio: adoneLib.adoneLibStrings.pipe | adoneLib.adoneLibStrings.ignore | adoneLib.adoneLibStrings.inherit | js.Array[StdIOOption] = null,
    stdout: StdIOOption = null,
    stripEof: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    uid: scala.Int | scala.Double = null,
    windowsVerbatimArguments: js.UndefOr[scala.Boolean] = js.undefined
  ): ExecSyncOptions = {
    val __obj = js.Dynamic.literal()
    if (argv0 != null) __obj.updateDynamic("argv0")(argv0)
    if (!js.isUndefined(cleanup)) __obj.updateDynamic("cleanup")(cleanup)
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (env != null) __obj.updateDynamic("env")(env)
    if (!js.isUndefined(extendEnv)) __obj.updateDynamic("extendEnv")(extendEnv)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (killSignal != null) __obj.updateDynamic("killSignal")(killSignal.asInstanceOf[js.Any])
    if (localDir != null) __obj.updateDynamic("localDir")(localDir)
    if (maxBuffer != null) __obj.updateDynamic("maxBuffer")(maxBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(preferLocal)) __obj.updateDynamic("preferLocal")(preferLocal)
    if (!js.isUndefined(reject)) __obj.updateDynamic("reject")(reject)
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(stderr.asInstanceOf[js.Any])
    if (stdin != null) __obj.updateDynamic("stdin")(stdin.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (stdout != null) __obj.updateDynamic("stdout")(stdout.asInstanceOf[js.Any])
    if (!js.isUndefined(stripEof)) __obj.updateDynamic("stripEof")(stripEof)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (!js.isUndefined(windowsVerbatimArguments)) __obj.updateDynamic("windowsVerbatimArguments")(windowsVerbatimArguments)
    __obj.asInstanceOf[ExecSyncOptions]
  }
}

