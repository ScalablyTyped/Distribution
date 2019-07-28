package typings.adone.adoneNs.systemNs.processNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecReturns extends js.Object {
  /**
    * The command that was run.
    */
  var cmd: String
  /**
    * The exit code of the process that was run.
    */
  var code: Double
  /**
    * Whether the process failed to run.
    */
  var failed: Boolean
  /**
    * Whether the process was killed.
    */
  var killed: Boolean
  /**
    * The signal that was used to terminate the process.
    */
  var signal: String | Null
  /**
    * The output of the process on stderr.
    */
  var stderr: String
  /**
    * The output of the process on stdout.
    */
  var stdout: String
  /**
    * Whether the process timed out.
    */
  var timedOut: Boolean
}

object ExecReturns {
  @scala.inline
  def apply(
    cmd: String,
    code: Double,
    failed: Boolean,
    killed: Boolean,
    stderr: String,
    stdout: String,
    timedOut: Boolean,
    signal: String = null
  ): ExecReturns = {
    val __obj = js.Dynamic.literal(cmd = cmd, code = code, failed = failed, killed = killed, stderr = stderr, stdout = stdout, timedOut = timedOut)
    if (signal != null) __obj.updateDynamic("signal")(signal)
    __obj.asInstanceOf[ExecReturns]
  }
}

