package typings.amapDashJsDashApi.AMap.convertFrom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete
  - typings.amapDashJsDashApi.amapDashJsDashApiStrings.error
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapDashJsDashApi.amapDashJsDashApiStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapDashJsDashApi.amapDashJsDashApiStrings.error = this.cast("error")
}

