package typings.amapJsApiLineSearch.AMap.LineSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete
  - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error
  - typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiLineSearch.amapJsApiLineSearchStrings.no_data = this.cast("no_data")
}

