package typings
package aggregateDashErrorLib.aggregateDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateError
  extends stdLib.Error
     with stdLib.Iterable[stdLib.Error] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator_AggregateError: js.Function0[stdLib.IterableIterator[stdLib.Error]]
  @JSName("name")
  val name_AggregateError: aggregateDashErrorLib.aggregateDashErrorLibStrings.AggregateError
}

object AggregateError {
  @scala.inline
  def apply(
    iterator: () => stdLib.IterableIterator[stdLib.Error],
    message: java.lang.String,
    name: aggregateDashErrorLib.aggregateDashErrorLibStrings.AggregateError,
    stack: java.lang.String = null
  ): AggregateError = {
    val __obj = js.Dynamic.literal(iterator = js.Any.fromFunction0(iterator), message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AggregateError]
  }
}

