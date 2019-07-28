package typings.adone

import typings.adone.adoneNs.assertionNs.INs.AssertFunction
import typings.adone.adoneNs.assertionNs.INs.ExpectFunction
import typings.adone.adoneNs.shaniNs.INs.DescribeFunction
import typings.adone.adoneNs.shaniNs.INs.HookFunction
import typings.adone.adoneNs.shaniNs.INs.TestFunction
import typings.adone.adoneNs.shaniNs.utilNs.INs.Match
import typings.adone.adoneNs.shaniNs.utilNs.INs.Request
import typings.adone.adoneNs.utilNs.INs.fakeClockNs.FakeClock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  /**
    * Defines a hook that will be called only once after the block's tests
    */
  val after: HookFunction = js.native
  /**
    * Defines a hook that will be called after each test
    */
  val afterEach: HookFunction = js.native
  /**
    * assertion functions
    */
  val assert: AssertFunction = js.native
  /**
    * Defines a hook that will be called only once before the block's tests
    */
  val before: HookFunction = js.native
  /**
    * Defines a hook that will be called before each test
    */
  val beforeEach: HookFunction = js.native
  /**
    * Defines a tests block
    */
  val context: DescribeFunction = js.native
  val describe: DescribeFunction = js.native
  /**
    * bdd-style assertion functons
    */
  val expect: ExpectFunction = js.native
  /**
    * tools for installing controllable timer functions
    */
  val fakeClock: FakeClock = js.native
  /**
    * Defines a test
    */
  val it: TestFunction = js.native
  /**
    * defines a matcher for spies/stubs/mocks
    */
  val `match`: Match = js.native
  /**
    * assertion tool for http server responses
    */
  val request: js.Function1[/* server */ js.Any, Request] = js.native
  /**
    * Defines a test
    */
  val specify: TestFunction = js.native
}

