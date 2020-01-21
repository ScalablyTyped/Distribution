package typings.ava.mod

import typings.std.Error
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowsAssertion extends js.Object {
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[_]): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must be an instance of the given constructor.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], constructor: Constructor): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], constructor: Constructor, message: String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must have a message equal to `errorMessage`.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], errorMessage: String): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], errorMessage: String, message: String): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], expectations: Null, message: String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], expectations: ThrowsExpectation): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], expectations: ThrowsExpectation, message: String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must have a message that matches the regular expression.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], regex: RegExp): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[_], regex: RegExp, message: String): ThrownError = js.native
  /** Skip this assertion. */
  def skip(fn: js.Function0[_]): Unit = js.native
  def skip(fn: js.Function0[_], expectations: js.Any): Unit = js.native
  def skip(fn: js.Function0[_], expectations: js.Any, message: String): Unit = js.native
}

