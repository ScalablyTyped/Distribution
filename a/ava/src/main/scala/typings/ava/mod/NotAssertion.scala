package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotAssertion extends js.Object {
  /**
  	 * Assert that `actual` is not [the same
  	 * value](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Object/is) as `expected`.
  	 */
  def apply[ValueType](actual: ValueType, expected: ValueType): Unit = js.native
  def apply[ValueType](actual: ValueType, expected: ValueType, message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(actual: js.Any, expected: js.Any): Unit = js.native
  def skip(actual: js.Any, expected: js.Any, message: String): Unit = js.native
}

