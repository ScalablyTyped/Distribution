package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessOptions extends NodeProcessOptions {
  /**
    *  Whether the command will automatically start when this BufferedProcess is
    *  created.
    */
  var autoStart: js.UndefOr[scala.Boolean] = js.undefined
}

object ProcessOptions {
  @scala.inline
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String] = null,
    autoStart: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.Function1[/* code */ scala.Double, scala.Unit] = null,
    options: SpawnProcessOptions = null,
    stderr: js.Function1[/* data */ java.lang.String, scala.Unit] = null,
    stdout: js.Function1[/* data */ java.lang.String, scala.Unit] = null
  ): ProcessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("command")(command)
    if (args != null) __obj.updateDynamic("args")(args)
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart)
    if (exit != null) __obj.updateDynamic("exit")(exit)
    if (options != null) __obj.updateDynamic("options")(options)
    if (stderr != null) __obj.updateDynamic("stderr")(stderr)
    if (stdout != null) __obj.updateDynamic("stdout")(stdout)
    __obj.asInstanceOf[ProcessOptions]
  }
}

