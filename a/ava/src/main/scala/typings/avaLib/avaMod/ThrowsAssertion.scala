package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrowsAssertion extends js.Object {
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_]): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must be an instance of the given constructor.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], constructor: Constructor): ThrownError = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], constructor: Constructor, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must have a message equal to `errorMessage`.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], errorMessage: java.lang.String): ThrownError = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], errorMessage: java.lang.String, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], expectations: ThrowsExpectation): ThrownError = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], expectations: ThrowsExpectation, message: java.lang.String): ThrownError = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], expectations: scala.Null, message: java.lang.String): ThrownError = js.native
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must have a message that matches the regular expression.
  	 */
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], regex: stdLib.RegExp): ThrownError = js.native
  def apply[ThrownError /* <: stdLib.Error */](fn: js.Function0[_], regex: stdLib.RegExp, message: java.lang.String): ThrownError = js.native
  /** Skip this assertion. */
  def skip(fn: js.Function0[_]): scala.Unit = js.native
  def skip(fn: js.Function0[_], expectations: js.Any): scala.Unit = js.native
  def skip(fn: js.Function0[_], expectations: js.Any, message: java.lang.String): scala.Unit = js.native
}

