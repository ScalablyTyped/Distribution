package typings.angularMocks.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// TimeoutService
// see https://docs.angularjs.org/api/ngMock/service/$timeout
// Augments the original service
///////////////////////////////////////////////////////////////////////////
@js.native
trait ITimeoutService extends js.Object {
  /**
    * **Deprecated** since version 1.7.3. (Use `$flushPendingTasks` instead.)
    *
    * ---
    * Flushes the queue of pending tasks.
    *
    * _This method is essentially an alias of `$flushPendingTasks`._
    *
    * > For historical reasons, this method will also flush non-`$timeout` pending tasks, such as
    * > `$q` promises and tasks scheduled via `$applyAsync` and `$evalAsync`.
    *
    * @param delay - The maximum timeout amount to flush up until.
    */
  def flush(): Unit = js.native
  def flush(delay: Double): Unit = js.native
  /**
    * **Deprecated** since version 1.7.3. (Use `$verifyNoPendingTasks` instead.)
    *
    * ---
    * Verifies that there are no pending tasks that need to be flushed. It throws an error if there
    * are still pending tasks.
    *
    * _This method is essentially an alias of `$verifyNoPendingTasks` (called with no arguments)._
    *
    * > For historical reasons, this method will also verify non-`$timeout` pending tasks, such as
    * > pending `$http` requests, in-progress `$route` transitions, unresolved `$q` promises and
    * > tasks scheduled via `$applyAsync` and `$evalAsync`.
    * >
    * > It is recommended to use `$verifyNoPendingTasks` instead, which additionally supports
    * > verifying a specific type of tasks. For example, you can verify there are no pending
    * > timeouts with `$verifyNoPendingTasks('$timeout')`.
    */
  def verifyNoPendingTasks(): Unit = js.native
}

