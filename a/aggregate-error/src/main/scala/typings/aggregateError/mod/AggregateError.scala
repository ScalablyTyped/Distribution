package typings.aggregateError.mod

import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateError
  extends Error
     with Iterable[Error] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_AggregateError: js.Function0[IterableIterator[Error]] = js.native
  @JSName("name")
  val name_AggregateError: typings.aggregateError.aggregateErrorStrings.AggregateError = js.native
}

