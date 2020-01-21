package typings.amapJsApiRiding.AMap.Riding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiRiding.amapJsApiRidingStrings.complete
  - typings.amapJsApiRiding.amapJsApiRidingStrings.error
  - typings.amapJsApiRiding.amapJsApiRidingStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiRiding.amapJsApiRidingStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiRiding.amapJsApiRidingStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiRiding.amapJsApiRidingStrings.no_data = this.cast("no_data")
}

