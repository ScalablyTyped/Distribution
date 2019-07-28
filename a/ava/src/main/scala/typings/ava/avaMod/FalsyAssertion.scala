package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FalsyAssertion extends js.Object {
  /** Assert that `actual` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy). */
  def apply(actual: js.Any): Unit = js.native
  def apply(actual: js.Any, message: String): Unit = js.native
  /** Skip this assertion. */
  def skip(actual: js.Any): Unit = js.native
  def skip(actual: js.Any, message: String): Unit = js.native
}

