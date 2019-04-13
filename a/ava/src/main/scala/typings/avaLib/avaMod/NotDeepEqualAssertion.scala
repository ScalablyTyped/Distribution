package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotDeepEqualAssertion extends js.Object {
  /** Assert that `actual` is not [deeply equal](https://github.com/concordancejs/concordance#comparison-details) to `expected`. */
  def apply[ValueType](actual: ValueType, expected: ValueType): scala.Unit = js.native
  def apply[ValueType](actual: ValueType, expected: ValueType, message: java.lang.String): scala.Unit = js.native
  /** Skip this assertion. */
  def skip(actual: js.Any, expected: js.Any): scala.Unit = js.native
  def skip(actual: js.Any, expected: js.Any, message: java.lang.String): scala.Unit = js.native
}

