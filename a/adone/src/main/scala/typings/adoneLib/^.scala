package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Defines a hook that will be called only once after the block's tests
    */
  val after: adoneLib.adoneNs.shaniNs.INs.HookFunction = js.native
  /**
    * Defines a hook that will be called after each test
    */
  val afterEach: adoneLib.adoneNs.shaniNs.INs.HookFunction = js.native
  /**
    * assertion functions
    */
  val assert: adoneLib.adoneNs.assertionNs.INs.AssertFunction = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  val before: adoneLib.adoneNs.shaniNs.INs.HookFunction = js.native
  /**
    * Defines a hook that will be called before each test
    */
  val beforeEach: adoneLib.adoneNs.shaniNs.INs.HookFunction = js.native
  /**
    * Defines a tests block
    */
  val context: adoneLib.adoneNs.shaniNs.INs.DescribeFunction = js.native
  val describe: adoneLib.adoneNs.shaniNs.INs.DescribeFunction = js.native
  /**
    * bdd-style assertion functons
    */
  val expect: adoneLib.adoneNs.assertionNs.INs.ExpectFunction = js.native
  /**
    * tools for installing controllable timer functions
    */
  val fakeClock: adoneLib.adoneNs.utilNs.INs.fakeClockNs.FakeClock = js.native
  /**
    * Defines a test
    */
  val it: adoneLib.adoneNs.shaniNs.INs.TestFunction = js.native
  /**
    * defines a matcher for spies/stubs/mocks
    */
  val `match`: adoneLib.adoneNs.shaniNs.utilNs.INs.Match = js.native
  /**
    * assertion tool for http server responses
    */
  val request: js.Function1[/* server */ js.Any, adoneLib.adoneNs.shaniNs.utilNs.INs.Request] = js.native
  /**
    * Defines a test
    */
  val specify: adoneLib.adoneNs.shaniNs.INs.TestFunction = js.native
}

