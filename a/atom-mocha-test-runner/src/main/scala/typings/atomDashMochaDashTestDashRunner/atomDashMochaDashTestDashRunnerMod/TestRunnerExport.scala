package typings.atomDashMochaDashTestDashRunner.atomDashMochaDashTestDashRunnerMod

import typings.atom.atomMod.TestRunner
import typings.mocha.Mocha
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
trait TestRunnerExport extends TestRunner {
  def createRunner(): TestRunner = js.native
  def createRunner(options: AtomMochaOptions): TestRunner = js.native
  def createRunner(options: AtomMochaOptions, mochaConfigFunction: js.Function1[/* mocha */ Mocha, Unit]): TestRunner = js.native
}

