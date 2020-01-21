package typings.atom.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpawnProcessOptions extends js.Object {
  /** Current working directory of the child process. */
  var cwd: js.UndefOr[String] = js.undefined
  /** Prepare child to run independently of its parent process. */
  var detached: js.UndefOr[Boolean] = js.undefined
  /** Environment key-value pairs. */
  var env: js.UndefOr[StringDictionary[String]] = js.undefined
  /** Sets the group identity of the process. */
  var gid: js.UndefOr[Double] = js.undefined
  /**
    *  If true, runs command inside of a shell. Uses "/bin/sh" on UNIX, and process.env.ComSpec
    *  on Windows. A different shell can be specified as a string.
    */
  var shell: js.UndefOr[Boolean | String] = js.undefined
  /** The child's stdio configuration. */
  var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
  /** Sets the user identity of the process. */
  var uid: js.UndefOr[Double] = js.undefined
}

object SpawnProcessOptions {
  @scala.inline
  def apply(
    cwd: String = null,
    detached: js.UndefOr[Boolean] = js.undefined,
    env: StringDictionary[String] = null,
    gid: Int | Double = null,
    shell: Boolean | String = null,
    stdio: String | (js.Array[String | Double]) = null,
    uid: Int | Double = null
  ): SpawnProcessOptions = {
    val __obj = js.Dynamic.literal()
    if (cwd != null) __obj.updateDynamic("cwd")(cwd.asInstanceOf[js.Any])
    if (!js.isUndefined(detached)) __obj.updateDynamic("detached")(detached.asInstanceOf[js.Any])
    if (env != null) __obj.updateDynamic("env")(env.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (shell != null) __obj.updateDynamic("shell")(shell.asInstanceOf[js.Any])
    if (stdio != null) __obj.updateDynamic("stdio")(stdio.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpawnProcessOptions]
  }
}

