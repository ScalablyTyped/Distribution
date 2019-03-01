package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestRunnerParams extends js.Object {
  /**
    *  A boolean indicating whether or not the tests are being run from the command
    *  line via atom --test.
    */
  var headless: scala.Boolean
  /** An optional path to a log file to which test output should be logged. */
  var logFile: java.lang.String
  /** An array of paths to tests to run. Could be paths to files or directories. */
  var testPaths: js.Array[java.lang.String]
  /**
    *  A function that can be called to construct an instance of the atom global.
    *  No atom global will be explicitly assigned, but you can assign one in your
    *  runner if desired.
    */
  def buildAtomEnvironment(options: BuildEnvironmentOptions): AtomEnvironment
  /**
    *  A function that builds a default instance of the application delegate, suitable
    *  to be passed as the applicationDelegate parameter to buildAtomEnvironment.
    */
  def buildDefaultApplicationDelegate(): js.Object
}

object TestRunnerParams {
  @scala.inline
  def apply(
    buildAtomEnvironment: js.Function1[BuildEnvironmentOptions, AtomEnvironment],
    buildDefaultApplicationDelegate: js.Function0[js.Object],
    headless: scala.Boolean,
    logFile: java.lang.String,
    testPaths: js.Array[java.lang.String]
  ): TestRunnerParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("buildAtomEnvironment")(buildAtomEnvironment)
    __obj.updateDynamic("buildDefaultApplicationDelegate")(buildDefaultApplicationDelegate)
    __obj.updateDynamic("headless")(headless)
    __obj.updateDynamic("logFile")(logFile)
    __obj.updateDynamic("testPaths")(testPaths)
    __obj.asInstanceOf[TestRunnerParams]
  }
}

