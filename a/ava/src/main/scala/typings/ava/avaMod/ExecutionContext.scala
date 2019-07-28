package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExecutionContext[Context] extends Assertions {
  /** Test context, shared with hooks. */
  var context: Context = js.native
  @JSName("log")
  var log_Original: LogFn = js.native
  @JSName("plan")
  var plan_Original: PlanFn = js.native
  @JSName("timeout")
  var timeout_Original: TimeoutFn = js.native
  /** Title of the test or hook. */
  val title: String = js.native
  /** Log one or more values. */
  def log(values: js.Any*): Unit = js.native
  /**
  	 * Plan how many assertion there are in the test. The test will fail if the actual assertion count doesn't match the
  	 * number of planned assertions. See [assertion planning](https://github.com/avajs/ava#assertion-planning).
  	 */
  def plan(count: Double): Unit = js.native
  def timeout(ms: Double): Unit = js.native
}

