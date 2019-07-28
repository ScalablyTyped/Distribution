package typings.asyncDashDone.asyncDashDoneMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a callback function used to signal the completion of a
  * task with a single result value.
  */
@js.native
trait Callback[T] extends js.Object {
  def apply(err: Null, result: T): Unit = js.native
  // Use `result?: T` or `result: undefined` to require the consumer to assert the existence of the result
  // (even in case of success). See comment at the top of the file.
  def apply(err: Error): Unit = js.native
  def apply(err: Error, result: js.Any): Unit = js.native
}

