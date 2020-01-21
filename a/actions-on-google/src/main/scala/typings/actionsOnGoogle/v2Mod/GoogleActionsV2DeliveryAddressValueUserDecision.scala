package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN_USER_DECISION
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ACCEPTED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.REJECTED
*/
trait GoogleActionsV2DeliveryAddressValueUserDecision extends js.Object

object GoogleActionsV2DeliveryAddressValueUserDecision {
  @scala.inline
  def ACCEPTED: typings.actionsOnGoogle.actionsOnGoogleStrings.ACCEPTED = this.cast("ACCEPTED")
  @scala.inline
  def REJECTED: typings.actionsOnGoogle.actionsOnGoogleStrings.REJECTED = this.cast("REJECTED")
  @scala.inline
  def UNKNOWN_USER_DECISION: typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN_USER_DECISION = this.cast("UNKNOWN_USER_DECISION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

