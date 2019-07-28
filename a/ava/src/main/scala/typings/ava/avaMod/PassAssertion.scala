package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PassAssertion extends js.Object {
  /** Count a passing assertion. */
  def apply(): Unit = js.native
  def apply(message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(): Unit = js.native
  def skip(message: String): Unit = js.native
}

