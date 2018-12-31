package typings
package atomDashMochaDashTestDashRunnerLib.atomDashMochaDashTestDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AtomMochaOptions extends js.Object {
  /** Whether or not to colorize output on the terminal. */
  var colors: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not to assign the created Atom environment to `global.atom`. */
  var globalAtom: js.UndefOr[scala.Boolean] = js.undefined
  /** The string to use for the window title in the HTML reporter. */
  var htmlTitle: js.UndefOr[java.lang.String] = js.undefined
  /** Which reporter to use on the terminal. */
  var reporter: js.UndefOr[java.lang.String] = js.undefined
  /** File extensions that indicate that the file contains tests. */
  var testSuffixes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

