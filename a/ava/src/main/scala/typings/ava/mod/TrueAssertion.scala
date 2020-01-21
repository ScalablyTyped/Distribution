package typings.ava.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrueAssertion extends js.Object {
  /** Assert that `actual` is strictly true. */
  def apply(actual: js.Any): Unit = js.native
  def apply(actual: js.Any, message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(actual: js.Any): Unit = js.native
  def skip(actual: js.Any, message: String): Unit = js.native
}

