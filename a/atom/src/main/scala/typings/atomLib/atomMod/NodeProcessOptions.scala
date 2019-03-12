package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeProcessOptions extends js.Object {
  /** The array of arguments to pass to the command. */
  var args: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The command to execute. */
  var command: java.lang.String
  /** The callback which receives a single argument containing the exit status. */
  var exit: js.UndefOr[js.Function1[/* code */ scala.Double, scala.Unit]] = js.undefined
  /** The options object to pass to Node's ChildProcess.spawn method. */
  var options: js.UndefOr[SpawnProcessOptions] = js.undefined
  /**
    *  The callback that receives a single argument which contains the standard
    *  error output from the command.
    */
  var stderr: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Unit]] = js.undefined
  /**
    *  The callback that receives a single argument which contains the standard
    *  output from the command.
    */
  var stdout: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Unit]] = js.undefined
}

object NodeProcessOptions {
  @scala.inline
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String] = null,
    exit: /* code */ scala.Double => scala.Unit = null,
    options: SpawnProcessOptions = null,
    stderr: /* data */ java.lang.String => scala.Unit = null,
    stdout: /* data */ java.lang.String => scala.Unit = null
  ): NodeProcessOptions = {
    val __obj = js.Dynamic.literal(command = command)
    if (args != null) __obj.updateDynamic("args")(args)
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction1(exit))
    if (options != null) __obj.updateDynamic("options")(options)
    if (stderr != null) __obj.updateDynamic("stderr")(js.Any.fromFunction1(stderr))
    if (stdout != null) __obj.updateDynamic("stdout")(js.Any.fromFunction1(stdout))
    __obj.asInstanceOf[NodeProcessOptions]
  }
}

