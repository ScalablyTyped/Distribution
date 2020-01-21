package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN
  - typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_DATE
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ETA
  - typings.actionsOnGoogle.actionsOnGoogleStrings.RESERVATION_SLOT
*/
trait GoogleActionsV2OrdersTimeType extends js.Object

object GoogleActionsV2OrdersTimeType {
  @scala.inline
  def DELIVERY_DATE: typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_DATE = this.cast("DELIVERY_DATE")
  @scala.inline
  def ETA: typings.actionsOnGoogle.actionsOnGoogleStrings.ETA = this.cast("ETA")
  @scala.inline
  def RESERVATION_SLOT: typings.actionsOnGoogle.actionsOnGoogleStrings.RESERVATION_SLOT = this.cast("RESERVATION_SLOT")
  @scala.inline
  def UNKNOWN: typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN = this.cast("UNKNOWN")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

