package typings.aureliaPal.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-pal", "AggregateError")
@js.native
object AggregateError extends js.Object {
  def apply(message: String): Error = js.native
  def apply(message: String, innerError: Error): Error = js.native
  def apply(message: String, innerError: Error, skipIfAlreadyAggregate: Boolean): Error = js.native
}

