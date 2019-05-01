package typings
package asyncDashDoneLib.asyncDashDoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a callback function used to signal the completion of a
  * task with a single result value.
  */
@js.native
trait Callback[T] extends js.Object {
  def apply(err: scala.Null, result: T): scala.Unit = js.native
  // Use `result?: T` or `result: undefined` to require the consumer to assert the existence of the result
  // (even in case of success). See comment at the top of the file.
  def apply(err: stdLib.Error): scala.Unit = js.native
  def apply(err: stdLib.Error, result: js.Any): scala.Unit = js.native
}

