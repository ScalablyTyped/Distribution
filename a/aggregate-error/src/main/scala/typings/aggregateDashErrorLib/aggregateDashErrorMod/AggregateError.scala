package typings
package aggregateDashErrorLib.aggregateDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateError
  extends stdLib.Error
     with stdLib.Iterable[stdLib.Error] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_AggregateError: js.Function0[stdLib.IterableIterator[stdLib.Error]] = js.native
  @JSName("name")
  val name_AggregateError: aggregateDashErrorLib.aggregateDashErrorLibStrings.AggregateError = js.native
}

