package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogFn extends js.Object {
  /** Log one or more values. */
  def apply(values: js.Any*): Unit = js.native
  /** Skip logging. */
  def skip(values: js.Any*): Unit = js.native
}

