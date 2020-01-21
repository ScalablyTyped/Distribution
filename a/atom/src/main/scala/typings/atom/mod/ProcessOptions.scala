package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends NodeProcessOptions {
  /**
    *  Whether the command will automatically start when this BufferedProcess is
    *  created.
    */
  var autoStart: js.UndefOr[Boolean] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    command: String,
    args: js.Array[String] = null,
    autoStart: js.UndefOr[Boolean] = js.undefined,
    exit: /* code */ Double => Unit = null,
    options: SpawnProcessOptions = null,
    stderr: /* data */ String => Unit = null,
    stdout: /* data */ String => Unit = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
    if (args != null) __obj.updateDynamic("args")(args.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(js.Any.fromFunction1(exit))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (stderr != null) __obj.updateDynamic("stderr")(js.Any.fromFunction1(stderr))
    if (stdout != null) __obj.updateDynamic("stdout")(js.Any.fromFunction1(stdout))
    __obj.asInstanceOf[ProcessOptions]
  }
}

