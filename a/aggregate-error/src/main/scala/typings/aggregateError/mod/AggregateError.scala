package typings.aggregateError.mod

import typings.std.Error
import typings.std.Iterable
import typings.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateError[T /* <: Error */]
  extends Error
     with Iterable[T] {
  
  @JSName(js.Symbol.iterator)
  var iterator_AggregateError: js.Function0[IterableIterator[T]] = js.native
  
  @JSName("name")
  val name_AggregateError: typings.aggregateError.aggregateErrorStrings.AggregateError = js.native
}
