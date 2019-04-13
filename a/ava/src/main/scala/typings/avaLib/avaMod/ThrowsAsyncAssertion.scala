package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowsAsyncAssertion extends js.Object {
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]]): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must be an instance of the given constructor.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], constructor: Constructor): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], constructor: Constructor, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must have a message equal to `errorMessage`.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], errorMessage: java.lang.String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], errorMessage: java.lang.String, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], expectations: ThrowsExpectation, message: java.lang.String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], expectations: scala.Null, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the async function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error
  	 * value. You must await the result. The error must have a message that matches the regular expression.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], regex: stdLib.RegExp): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[js.Thenable[_]], regex: stdLib.RegExp, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_]): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must be an instance of the given constructor.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], constructor: Constructor): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], constructor: Constructor, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must have a message equal to `errorMessage`.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], errorMessage: java.lang.String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], errorMessage: java.lang.String, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], expectations: ThrowsExpectation): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], expectations: ThrowsExpectation, message: java.lang.String): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], expectations: scala.Null, message: java.lang.String): js.Promise[ThrownError] = js.native
  /**
  	 * Assert that the promise rejects with [an error](https://www.npmjs.com/package/is-error). If so, returns the
  	 * rejection reason. You must await the result. The error must have a message that matches the regular expression.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], regex: stdLib.RegExp): js.Promise[ThrownError] = js.native
  def apply[ThrownError /* <: stdLib.Error */](promise: js.Thenable[_], regex: stdLib.RegExp, message: java.lang.String): js.Promise[ThrownError] = js.native
  /** Skip this assertion. */
  def skip(thrower: js.Any): scala.Unit = js.native
  def skip(thrower: js.Any, expectations: js.Any): scala.Unit = js.native
  def skip(thrower: js.Any, expectations: js.Any, message: java.lang.String): scala.Unit = js.native
}

