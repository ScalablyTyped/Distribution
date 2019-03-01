package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnProcessOptions extends js.Object {
  /** Current working directory of the child process. */
  var cwd: js.UndefOr[java.lang.String] = js.undefined
  /** Prepare child to run independently of its parent process. */
  var detached: js.UndefOr[scala.Boolean] = js.undefined
  /** Environment key-value pairs. */
  var env: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /** Sets the group identity of the process. */
  var gid: js.UndefOr[scala.Double] = js.undefined
  /**
    *  If true, runs command inside of a shell. Uses "/bin/sh" on UNIX, and process.env.ComSpec
    *  on Windows. A different shell can be specified as a string.
    */
  var shell: js.UndefOr[scala.Boolean | java.lang.String] = js.undefined
  /** The child's stdio configuration. */
  var stdio: js.UndefOr[java.lang.String | (js.Array[java.lang.String | scala.Double])] = js.undefined
  /** Sets the user identity of the process. */
  var uid: js.UndefOr[scala.Double] = js.undefined
}

object SpawnProcessOptions {
  @scala.inline
  def apply(
    cwd: java.lang.String = null,
    detached: js.UndefOr[scala.Boolean] = js.undefined,
    env: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    gid: scala.Int | scala.Double = null,
    shell: scala.Boolean | java.lang.String = null,
    stdio: java.lang.String | (js.Array[java.lang.String | scala.Double]) = null,
    uid: scala.Int | scala.Double = null
  ): SpawnProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd)
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached)
    if (env != null) __obj.updateDynamic("env")(env)
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnProcessOptions]
  }
}

