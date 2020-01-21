package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_DECLINED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.INELIGIBLE
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PROMO_NOT_APPLICABLE
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNAVAILABLE_SLOT
*/
trait GoogleActionsV2OrdersRejectionInfoType extends js.Object

object GoogleActionsV2OrdersRejectionInfoType {
  @scala.inline
  def INELIGIBLE: typings.actionsOnGoogle.actionsOnGoogleStrings.INELIGIBLE = this.cast("INELIGIBLE")
  @scala.inline
  def PAYMENT_DECLINED: typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_DECLINED = this.cast("PAYMENT_DECLINED")
  @scala.inline
  def PROMO_NOT_APPLICABLE: typings.actionsOnGoogle.actionsOnGoogleStrings.PROMO_NOT_APPLICABLE = this.cast("PROMO_NOT_APPLICABLE")
  @scala.inline
  def UNAVAILABLE_SLOT: typings.actionsOnGoogle.actionsOnGoogleStrings.UNAVAILABLE_SLOT = this.cast("UNAVAILABLE_SLOT")
  @scala.inline
  def UNKNOWN: typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

