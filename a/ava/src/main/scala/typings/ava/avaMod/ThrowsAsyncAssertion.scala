package typings.ava.avaMod

import typings.std.Error
import typings.std.RegExp
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
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must be an instance of the given constructor.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], constructor: Constructor): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], constructor: Constructor, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must have a message equal to `errorMessage`.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], errorMessage: String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], errorMessage: String, message: String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: Null, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must have a message that matches the regular expression.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], regex: RegExp): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Thenable[_]], regex: RegExp, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_]): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must be an instance of the given constructor.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], constructor: Constructor): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], constructor: Constructor, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must have a message equal to `errorMessage`.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], errorMessage: String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], errorMessage: String, message: String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: Null, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], expectations: ThrowsExpectation, message: String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must have a message that matches the regular expression.
  	 */
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], regex: RegExp): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: Error */](promise: js.Thenable[_], regex: RegExp, message: String): js.Promise[ThrownError] = js.native
  /** Skip this assertion. */
  def skip(thrower: js.Any): Unit = js.native
  def skip(thrower: js.Any, expectations: js.Any): Unit = js.native
  def skip(thrower: js.Any, expectations: js.Any, message: String): Unit = js.native
}

