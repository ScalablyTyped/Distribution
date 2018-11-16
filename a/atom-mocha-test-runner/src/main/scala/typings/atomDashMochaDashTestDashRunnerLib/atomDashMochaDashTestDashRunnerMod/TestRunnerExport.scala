package typings
package atomDashMochaDashTestDashRunnerLib.atomDashMochaDashTestDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// The test runner function is augmented on export by:
//   import createRunner from './lib/create-runner'
//
//   module.exports = createRunner()
//   module.exports.createRunner = createRunner
// Which is what we're trying to model here.
@js.native
trait TestRunnerExport
  extends atomLib.atomMod.TestRunner {
  def createRunner(): atomLib.atomMod.TestRunner = js.native
  def createRunner(options: AtomMochaOptions): atomLib.atomMod.TestRunner = js.native
  def createRunner(
    options: AtomMochaOptions,
    mochaConfigFunction: js.Function1[/* mocha */ mochaLib.Mocha, scala.Unit]
  ): atomLib.atomMod.TestRunner = js.native
}

