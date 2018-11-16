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
  var env: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
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

