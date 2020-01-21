package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.SIGN_IN_STATUS_UNSPECIFIED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.OK
  - typings.actionsOnGoogle.actionsOnGoogleStrings.CANCELLED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ERROR
*/
trait GoogleActionsV2SignInValueStatus extends js.Object

object GoogleActionsV2SignInValueStatus {
  @scala.inline
  def CANCELLED: typings.actionsOnGoogle.actionsOnGoogleStrings.CANCELLED = this.cast("CANCELLED")
  @scala.inline
  def ERROR: typings.actionsOnGoogle.actionsOnGoogleStrings.ERROR = this.cast("ERROR")
  @scala.inline
  def OK: typings.actionsOnGoogle.actionsOnGoogleStrings.OK = this.cast("OK")
  @scala.inline
  def SIGN_IN_STATUS_UNSPECIFIED: typings.actionsOnGoogle.actionsOnGoogleStrings.SIGN_IN_STATUS_UNSPECIFIED = this.cast("SIGN_IN_STATUS_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

