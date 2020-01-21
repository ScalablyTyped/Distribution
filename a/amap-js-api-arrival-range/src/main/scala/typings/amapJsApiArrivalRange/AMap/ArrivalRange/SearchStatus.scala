package typings.amapJsApiArrivalRange.AMap.ArrivalRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete
  - typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error
  - typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.no_data = this.cast("no_data")
}

