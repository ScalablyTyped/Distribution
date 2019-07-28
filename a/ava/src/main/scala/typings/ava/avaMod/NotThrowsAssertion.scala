package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotThrowsAssertion extends js.Object {
  /** Assert that the function does not throw. */
  def apply(fn: js.Function0[_]): Unit = js.native
  def apply(fn: js.Function0[_], message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(fn: js.Function0[_]): Unit = js.native
  def skip(fn: js.Function0[_], message: String): Unit = js.native
}

