package typings.ava.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowsAsyncAssertion extends js.Object {
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]]): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: js.UndefOr[scala.Nothing], message: String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: Null, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_]): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: js.UndefOr[scala.Nothing], message: String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: Null, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: ThrowsExpectation, message: String): js.Promise[ThrownError] = js.native
  /** Skip this assertion. */
  def skip(thrower: js.Any): Unit = js.native
  def skip(thrower: js.Any, expectations: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def skip(thrower: js.Any, expectations: js.Any): Unit = js.native
  def skip(thrower: js.Any, expectations: js.Any, message: String): Unit = js.native
}

