package typings.amapJsApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApi.amapJsApiStrings.complete
  - typings.amapJsApi.amapJsApiStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApi.amapJsApiStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApi.amapJsApiStrings.error = this.cast("error")
}

