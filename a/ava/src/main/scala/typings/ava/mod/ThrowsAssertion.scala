package typings.ava.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThrowsAssertion extends StObject {
  
  /**
  	 * Assert that the function throws [an error](https://www.npmjs.com/package/is-error). If so, returns the error value.
  	 * The error must satisfy all expectations.
  	 */
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Any]): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: Null, message: String): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: Unit, message: String): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: ThrowsExpectation): ThrownError = js.native
  def apply[ThrownError /* <: Error */](fn: js.Function0[js.Any], expectations: ThrowsExpectation, message: String): ThrownError = js.native
  
  /** Skip this assertion. */
  def skip(fn: js.Function0[js.Any]): Unit = js.native
  def skip(fn: js.Function0[js.Any], expectations: js.Any): Unit = js.native
  def skip(fn: js.Function0[js.Any], expectations: js.Any, message: String): Unit = js.native
  def skip(fn: js.Function0[js.Any], expectations: Unit, message: String): Unit = js.native
}
