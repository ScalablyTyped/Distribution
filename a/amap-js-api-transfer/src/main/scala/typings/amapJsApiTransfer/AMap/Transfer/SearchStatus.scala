package typings.amapJsApiTransfer.AMap.Transfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amapJsApiTransfer.amapJsApiTransferStrings.complete
  - typings.amapJsApiTransfer.amapJsApiTransferStrings.error
  - typings.amapJsApiTransfer.amapJsApiTransferStrings.no_data
*/
trait SearchStatus extends js.Object

object SearchStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def complete: typings.amapJsApiTransfer.amapJsApiTransferStrings.complete = this.cast("complete")
  @scala.inline
  def error: typings.amapJsApiTransfer.amapJsApiTransferStrings.error = this.cast("error")
  @scala.inline
  def no_data: typings.amapJsApiTransfer.amapJsApiTransferStrings.no_data = this.cast("no_data")
}

