package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.STATUS_UNSPECIFIED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.FINISHED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.FAILED
*/
trait GoogleActionsV2MediaStatusStatus extends js.Object

object GoogleActionsV2MediaStatusStatus {
  @scala.inline
  def FAILED: typings.actionsOnGoogle.actionsOnGoogleStrings.FAILED = this.cast("FAILED")
  @scala.inline
  def FINISHED: typings.actionsOnGoogle.actionsOnGoogleStrings.FINISHED = this.cast("FINISHED")
  @scala.inline
  def STATUS_UNSPECIFIED: typings.actionsOnGoogle.actionsOnGoogleStrings.STATUS_UNSPECIFIED = this.cast("STATUS_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

