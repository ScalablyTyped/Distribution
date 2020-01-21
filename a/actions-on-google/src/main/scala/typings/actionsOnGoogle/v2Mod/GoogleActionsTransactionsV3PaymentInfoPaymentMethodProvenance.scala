package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_METHOD_PROVENANCE_UNSPECIFIED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_METHOD_PROVENANCE_GOOGLE
  - typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_METHOD_PROVENANCE_MERCHANT
*/
trait GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance extends js.Object

object GoogleActionsTransactionsV3PaymentInfoPaymentMethodProvenance {
  @scala.inline
  def PAYMENT_METHOD_PROVENANCE_GOOGLE: typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_METHOD_PROVENANCE_GOOGLE = this.cast("PAYMENT_METHOD_PROVENANCE_GOOGLE")
  @scala.inline
  def PAYMENT_METHOD_PROVENANCE_MERCHANT: typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_METHOD_PROVENANCE_MERCHANT = this.cast("PAYMENT_METHOD_PROVENANCE_MERCHANT")
  @scala.inline
  def PAYMENT_METHOD_PROVENANCE_UNSPECIFIED: typings.actionsOnGoogle.actionsOnGoogleStrings.PAYMENT_METHOD_PROVENANCE_UNSPECIFIED = this.cast("PAYMENT_METHOD_PROVENANCE_UNSPECIFIED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

