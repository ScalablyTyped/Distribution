package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN
  - typings.actionsOnGoogle.actionsOnGoogleStrings.GUEST
  - typings.actionsOnGoogle.actionsOnGoogleStrings.VERIFIED
*/
trait GoogleActionsV2UserUserVerificationStatus extends js.Object

object GoogleActionsV2UserUserVerificationStatus {
  @scala.inline
  def GUEST: typings.actionsOnGoogle.actionsOnGoogleStrings.GUEST = this.cast("GUEST")
  @scala.inline
  def UNKNOWN: typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  def VERIFIED: typings.actionsOnGoogle.actionsOnGoogleStrings.VERIFIED = this.cast("VERIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

