package typings
package aggregateDashErrorLib.aggregateDashErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateError
  extends stdLib.Error
     with stdLib.Iterable[stdLib.Error]

object AggregateError {
  @scala.inline
  def apply(
    iterator: js.Function0[stdLib.Iterator[stdLib.Error]],
    message: java.lang.String,
    name: java.lang.String,
    stack: java.lang.String = null
  ): AggregateError = {
    val __obj = js.Dynamic.literal(iterator = iterator, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[AggregateError]
  }
}

